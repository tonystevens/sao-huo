package models;

import com.avaje.ebean.Page;
import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;
import java.util.List;

/**
 * Computer entity managed by Ebean
 */
@Entity 
public class Orders extends Model {

    private static final long serialVersionUID = 1L;

	@Id
    public Long id;
    
    @Constraints.Required
    public String item_name;
    
    @Formats.DateTime(pattern="yyyy-MM-dd")
    public Date buy_dt;
    
    @Formats.DateTime(pattern="yyyy-MM-dd")
    public Date deliver_dt;

    @Constraints.Required
    public String unit_price;

    @Constraints.Required
    public int quantity;

    @Constraints.Required
    public String item_source;

    @Constraints.Required
    public String note;


    public String tracking_number;

    @Formats.DateTime(pattern="yyyy-MM-dd hh:mm:ss")
    public Date post_dt;

    @ManyToOne
    public Users users;

    public static Finder<Long, Orders> find = new Finder<Long, Orders>(Long.class, Orders.class);

    public static List<Orders> findByUser(Users user){
        return find.where().eq("users",user).findList();
    }

    public static List<Orders> findByUserAndTrackingNumber(Users user, String trackingNumber){
        return find.where().eq("users",user).eq("tracking_number",trackingNumber).findList();
    }

    public static Page<Orders> page(int page, int pageSize, String sortBy, String order, String filter){
        return find.where()
                .ilike("item_name", "%" + filter + "%")
                .orderBy(sortBy + " " + order)
                .fetch("users")
                .findPagingList(pageSize)
                .setFetchAhead(false)
                .getPage(page);
    }

}

