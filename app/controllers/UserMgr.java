package controllers;

import models.Payment;
import models.Users;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.usermgr.createPmtForm;
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
        return pmtlist();
    }

    public static Result pmtlist() {

        String email = session("user");
        String password = session("pwd");

        System.out.println("1. email: "+email);
        System.out.println("2. password: "+password);

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

    public static Result save() {
        Form<Payment> paymentForm = form(Payment.class).bindFromRequest();
        Payment newPmt = paymentForm.get();
        newPmt.users = Users.findByEmail(session("user")).get(0);
        if(paymentForm.hasErrors()) {
            return badRequest(createPmtForm.render(paymentForm));
        }
        newPmt.save();
        flash("success", "Payment method " + paymentForm.get().cc_name + " has been created");
        return pmtlist();
    }

    public static Result create() {
        Form<Payment> paymentForm = form(Payment.class);
        return ok(createPmtForm.render(paymentForm));
    }
    

}
            
