package controllers;

import com.avaje.ebean.Ebean;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

import static play.data.Form.*;

import views.html.signin.*;

import models.Users;

/**
 * Manage a database of computers
 */
public class UserManager extends Controller {

    final static Form<Users> signinForm = form(Users.class);

    public static Result blank() {
        return ok(form.render(signinForm));
    }

    public static Result submit() {
        Form<Users> filledForm = signinForm.bindFromRequest();

        final String email = filledForm.get().email;
        final String password = filledForm.get().password;

        // Check if the username is valid
        if(!filledForm.hasErrors()) {
            System.out.println("Email: " + email);
            System.out.println("Password: " + password);

            List<Users> userList =  Users.findAll();
            for(Users user : userList){
                System.out.println("user: "+user.email);
            }

        }

        if(filledForm.hasErrors()) {
            return badRequest(form.render(filledForm));
        } else {
            Users created = filledForm.get();
            return ok(summary.render(created));
        }
    }

}
            
