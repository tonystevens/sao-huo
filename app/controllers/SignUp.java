package controllers;

import models.Users;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

import static play.data.Form.form;
import views.html.signup.*;

public class SignUp extends Controller {

    final static Form<Users> signupForm = form(Users.class);

    public static Result blank() {
        return ok(form.render("Please sign up", signupForm));
    }

    public static Result signup(){
        Form<Users> filledForm = signupForm.bindFromRequest();
        if(filledForm.hasErrors()) {
            return badRequest(form.render(filledForm.globalError().message(),filledForm));
        } else {

            // Check repeated password
            if(!filledForm.field("password").valueOr("").isEmpty()) {
                if(!filledForm.field("password").valueOr("").equals(filledForm.field("repeatPassword").value())) {
                    filledForm.reject("repeatPassword", "Password don't match");
                }
            }

            final String email = filledForm.get().email;

            List<Users> user = Users.findByEmail(email);
            if(user.size()==0){
                Users new_user = filledForm.get();
                new_user.save();
                return ok(summary.render("Welcome, " + new_user.first_name + " " + new_user.last_name +" !",new_user));
            } else {
                return ok(form.render("User already exist", signupForm));
            }

        }

    }

}


            
