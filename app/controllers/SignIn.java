package controllers;

import models.Users;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

import static play.data.Form.*;

import views.html.signin.*;

public class SignIn extends Controller {

    final static Form<Users> signinForm = form(Users.class);

    public static Result blank() {
        return ok(form.render("Please sign in", signinForm));
    }

    public static Result signin() {
        Form<Users> filledForm = signinForm.bindFromRequest();

        if(filledForm.hasErrors()) {
            return badRequest(form.render("Please fill with valid email and password",filledForm));
        }

        final String email = filledForm.get().email;
        final String password = filledForm.get().password;

        System.out.println("email: "+email);
        System.out.println("password: "+password);

        Users login_user = null;
        // Check if the username is valid
        if(!filledForm.hasErrors()) {
            List<Users> userList =  Users.findAll();
            System.out.println("Size: "+userList.size());
            for(Users user : userList){
                System.out.println("email: "+user.email);
                System.out.println("password: "+user.password);
                if(user.email.equals(email) && user.password.equals(password))
                    login_user = user;
            }
        }

        System.out.println("login_user: "+login_user);

        if(login_user == null) {
            return ok(form.render("email and password not found", signinForm));
        } else {
            Users created = filledForm.get();
            System.out.println("User: "+created.email);
            session("user",email);
            session("pwd",password);
//            return UserMgr.pmtlist(0, "cc_name","asc","");
            return ok(summary.render("Welcome, " + created.first_name + " " + created.last_name +" !",created));
        }
    }

}


            
