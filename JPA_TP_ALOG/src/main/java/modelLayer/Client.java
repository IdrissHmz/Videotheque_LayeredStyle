package modelLayer;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity
@Table(name="CLIENTS",schema ="APP")
public class Client implements Serializable {
		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue
	    private int customerID;
		private int accountBalance;
	    private String nom;

	    public Client(String nom,int AcBalance) {
	        this.accountBalance = AcBalance;
	        this.nom = nom;
	    }
		public Client() {
			super();
		}

	    public int getAccountBalance() {
	        return accountBalance;
	    }

	    public void setAccountBalance(int accountBalance) {
	        this.accountBalance = accountBalance;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public void setNom(String nom) {
	        this.nom = nom;
	    }

	    public int getCustomerID() {
	        return customerID;
	    }

	    public void setCustomerID(int customerID) {
	        this.customerID = customerID;
	    }

   
}
