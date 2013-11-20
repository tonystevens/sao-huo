package models;

import com.avaje.ebean.Page;
import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import java.util.List;

/**
 * Computer entity managed by Ebean
 */
@Entity 
public class Payment extends Model {

    private static final long serialVersionUID = 1L;

	@Id
    public Long id;
    
    @Constraints.Required
    public String cc_number;

    @Constraints.Required
    public String cc_address_1;

    public String cc_address_2;

    @Constraints.Required
    public String cc_city;

    @Constraints.Required
    public String cc_state;

    @Constraints.Required
    public String cc_zip_code;
    
    @ManyToOne
    public Users users;
    
    /**
     * Generic query helper for entity Computer with id Long
     */
    public static Finder<Long, Payment> find = new Finder<Long, Payment>(Long.class, Payment.class);
    
    public static List<Payment> findByUser(Users user){
        return find.where().eq("users",user).findList();
    }
    
}

