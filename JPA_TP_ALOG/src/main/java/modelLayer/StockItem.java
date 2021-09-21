package modelLayer;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: StockItem
 *
 */
@Entity
@Table(name="STOCK_ITEMS",schema ="APP")
public class StockItem implements Serializable {
	private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue
		private int id;
	    private int itemID;
	    private String name;
	    private int RentalPrice;

	    public StockItem(String name, int rent) {
	        this.name = name;
	        this.RentalPrice = rent;
	    }
	    public StockItem() {
			super();
		}

	    public int getRentalPrice() {
	        return RentalPrice;
	    }

	    public void setRentalPrice(int rentalPrice) {
	        RentalPrice = rentalPrice;
	    }

	    public int getItemID() {
	        return itemID;
	    }

	    public void setItemID(int itemID) {
	        this.itemID = itemID;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
	
   
}
