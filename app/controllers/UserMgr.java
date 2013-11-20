package controllers;

import models.Payment;
import models.Users;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.createForm;
import views.html.editForm;
import views.html.usermgr.pmtlist;

import java.util.List;

import static play.data.Form.form;

/**
 * Manage a database of computers
 */
public class UserMgr extends Controller {

    public final static String DEFAULT_EML = "sample@saohuo.com";
    public final static String DEFAULT_PWD = "abcd";

    public static Result pmtmain(){
        return pmtlist(DEFAULT_EML,DEFAULT_PWD);
    }

    public static Result pmtlist(String email, String password) {

        System.out.println("email: "+email);
        System.out.println("password: "+password);

        if(email.equals(DEFAULT_EML) && email.equals(DEFAULT_PWD))
            return redirect(routes.SignIn.signin());

        List<Users> userList = Users.findByEmailAndPassword(email, password);
        System.out.println("userList size: "+userList.size());
        if(userList.size() == 0)
            return redirect(routes.SignIn.signin());

        Users user = userList.get(0);
        List<Payment> payments = Payment.findByUser(user);
        System.out.println("payments size: "+payments.size());
        return ok(pmtlist.render(user,payments));

    }
    

}
            
