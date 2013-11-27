package controllers;

import models.Payment;
import models.Users;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.usermgr.createPmtForm;
import views.html.usermgr.editPmtForm;
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
        return pmtlist(0, "name", "asc", "");
    }

    public static Result pmtlist(int page, String sortBy, String order, String filter) {

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
        return ok(pmtlist.render(user, Payment.page(page, 10, sortBy, order, filter), sortBy, order, filter));

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
        return pmtlist(0,"cc_name", "asc", "");
    }

    public static Result create() {
        Form<Payment> paymentForm = form(Payment.class);
        return ok(createPmtForm.render(paymentForm));
    }

    public static Result delete(Long id) {
        Payment.find.ref(id).delete();
        flash("success", "Payment method has been deleted");
        return pmtlist(0,"cc_name", "asc", "");
    }

    public static Result update(Long id) {
        Form<Payment> paymentForm = form(Payment.class).bindFromRequest();
        if(paymentForm.hasErrors()) {
            return badRequest(editPmtForm.render(id, paymentForm));
        }
        paymentForm.get().update(id);
        flash("success", "Payment method " + paymentForm.get().cc_name + " has been updated");
        return pmtlist(0,"cc_name", "asc", "");
    }


    public static Result edit(Long id) {
        Form<Payment> paymentForm = form(Payment.class).fill(
            Payment.find.byId(id)
        );
        return ok(
            editPmtForm.render(id, paymentForm)
        );
    }

}
            
