package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;


/**
 * Company entity managed by Ebean
 */
@Entity 
public class Users extends Model {

    private static final long serialVersionUID = 1L;

	@Id
    public String email;

    @Constraints.Required
    public String password;

    public String first_name;

    public String last_name;

    public String address_1;

    public String address_2;

    public String city;

    public String state;

    public String zip_code;

    public String cell_phone;

    public String home_phone;

    public String role;

    public List<Users> sub_user_list;

    public List<Orders> userOrdersList;
    public List<Payment> userPaymentList;

    /**
     * Generic query helper for entity
     */
    public static Finder<String, Users> find = new Finder<String, Users>(String.class, Users.class);

    public static List<Users> findByEmail(String email) {
        return find.where().eq("email", email).findList();
    }

    public static List<Users> findByRole(String role_prefix) {
        return find.where().startsWith("role",role_prefix).findList();
    }

    public static List<Users> findByEmailAndPassword(String email, String password) {
        return find.where().eq("email", email).eq("password", password).orderBy("email asc").findList();
    }

    public static List<Users> findAll(){
        return find.findList();
    }

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer().append("email :"+email).append(", first_name: "+first_name).append(", last_name: "+last_name);
        return sb.toString();
    }

}

