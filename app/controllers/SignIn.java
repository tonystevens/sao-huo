package controllers;

import models.Orders;
import models.Users;
import models.Payment;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

import static play.data.Form.*;

import views.html.signin.*;
import views.html.index.*;

public class SignIn extends Controller {

    final static Form<Users> signinForm = form(Users.class);

    public static Result blank() {
        return ok(form.render("Please sign in", signinForm));
    }

    public static Result signin() {
        Form<Users> filledForm = signinForm.bindFromRequest();

        System.out.println("filledForm: "+filledForm);

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
            for(Users user : userList){
                if(user.email.equals(email) && user.password.equals(password))
                    login_user = user;
            }
        }

        System.out.println("login_user: "+login_user);

        if(login_user == null) {
            return ok(form.render("email and password not found", signinForm));
        } else {
            session("user",email);
            login_user.userPaymentList  = Payment.findByUser(login_user);
            login_user.userOrdersList = Orders.findByUser(login_user);
            String role = login_user.role;
            System.out.println("role: "+role);

            String[] roleParts = role.split("\\.");
            String role_prefix = (Integer.parseInt(roleParts[0])-1)+"."+roleParts[1];
            login_user.sub_user_list = Users.findByRole(role_prefix);
            for(Users user:login_user.sub_user_list){
                user.userPaymentList = Payment.findByUser(user);
                user.userOrdersList = Orders.findByUser(user);
            }

            return ok(summary.render("Welcome, " + login_user.first_name + " " + login_user.last_name +" !",login_user));
        }
    }

}


            
