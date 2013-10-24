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


    public Users() {}

    public Users(String email, String password) {
        this.email = email;
        this.password = password;
    }

    /**
     * Generic query helper for entity
     */
    public static Finder<String, Users> find = new Finder<String, Users>(String.class, Users.class);

    public static List<Users> findByEmailAndPassword(String email, String password) {
        return find.where().eq("email", email).eq("password", password).orderBy("email asc").findList();
    }

    public static List<Users> findAll(){
        return find.findList();
    }

}

