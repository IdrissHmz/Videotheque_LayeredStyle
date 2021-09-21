package modelLayer;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: RentedItem
 *
 */

@Entity
@Table(name="RENTED_ITEMS",schema ="APP")
public class RentedItem implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id 
	private int itemID;
	private int customerID;
	private Date DueDate;

	public RentedItem() {
		super();
		}
	
	

	    public RentedItem(int customerID, int itemID, Date dueDate) {
	        this.customerID = customerID;
	        this.itemID = itemID;
	        this.DueDate = dueDate;
	    }

	    public int getCustomerID() {
	        return customerID;
	    }

	    public void setCustomerID(int customerID) {
	        this.customerID = customerID;
	    }

	    public int getItemID() {
	        return itemID;
	    }

	    public void setItemID(int itemID) {
	        this.itemID = itemID;
	    }

	    public Date getDueDate() {
	        return DueDate;
	    }

	    public void setDueDate(Date dueDate) {
	        DueDate = dueDate;
	    }
	
   
}
