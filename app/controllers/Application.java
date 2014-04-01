package controllers;

import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import views.html.*;

import models.*;

/**
 * Manage a database of computers
 */
public class Application extends Controller {

    final static Form<Users> signinForm = form(Users.class);

    /**
     * Handle default path requests, redirect to computers orderlist
     */
    public static Result index() {
        return ok(views.html.index.render("LOG IN", signinForm));
    }
    

}
            
