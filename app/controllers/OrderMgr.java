package controllers;

import java.util.List;

import models.Orders;
import models.Users;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.ordermgr.createOrderForm;
import views.html.ordermgr.editOrderForm;
import views.html.ordermgr.orderlist;

import java.util.GregorianCalendar;

import static play.data.Form.form;

/**
 * Manage a database of computers
 */
public class OrderMgr extends Controller {

    public final static String DEFAULT_EML = "sample@saohuo.com";
    public final static String DEFAULT_PWD = "abcd";

    public static Result ordermain(){
        return orderlist(0, "item_name", "asc", "");
    }

    public static Result orderlist(int page, String sortBy, String order, String filter) {

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
        return ok(orderlist.render(user, Orders.page(page, 10, sortBy, order, filter), sortBy, order, filter));

    }

    public static Result save() {
        Form<Orders> orderForm = form(Orders.class).bindFromRequest();
        System.out.println(orderForm.toString());
        if(orderForm.hasErrors()) {
            System.out.println("orderForm hasErrors");
            return badRequest(createOrderForm.render(orderForm));
        }
        Orders newOrder = orderForm.get();
        newOrder.users = Users.findByEmail(session("user")).get(0);
        newOrder.post_dt = new GregorianCalendar().getTime();
        newOrder.save();
        flash("success", "Order " + orderForm.get().id + " has been created");
        return orderlist(0,"item_name", "asc", "");
    }

    public static Result create() {
        Form<Orders> orderForm = form(Orders.class);
        return ok(createOrderForm.render(orderForm));
    }

    public static Result delete(Long id) {
        Orders.find.ref(id).delete();
        flash("success", "Order has been deleted");
        return orderlist(0,"item_name", "asc", "");
    }

    public static Result update(Long id) {
        Form<Orders> orderForm = form(Orders.class).bindFromRequest();
        if(orderForm.hasErrors()) {
            return badRequest(editOrderForm.render(id, orderForm));
        }
        orderForm.get().update(id);
        flash("success", "Order " + orderForm.get().id + " has been updated");
        return orderlist(0,"item_name", "asc", "");
    }


    public static Result edit(Long id) {
        Form<Orders> orderForm = form(Orders.class).fill(Orders.find.byId(id));
        return ok(editOrderForm.render(id, orderForm));
    }
    

}
            
