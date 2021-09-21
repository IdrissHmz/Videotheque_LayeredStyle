package processingLayer;
import java.util.Calendar;

import javax.persistence.*;
import modelLayer.*;

public class TransactionProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("CLIENTS");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Client c = new Client("idriss",1000);
		
		em.persist(c);
		em.getTransaction().commit();
		
		emf.close();
	}
	
	
	public void addClient(String name,int rent) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("CLIENTS");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Client c = new Client("idriss",rent);
		
		em.persist(c);
		em.getTransaction().commit();
		
		emf.close();
		em.close();
	}
	public void addItem(String name,int rent) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("CLIENTS");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Client c = new Client("idriss",rent);
		
		em.persist(c);
		em.getTransaction().commit();
		
		emf.close();
		em.close();
}
	
	public void deleteClient(int id) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("CLIENTS");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		
		Client c = em.find(Client.class,id);  
		em.remove(c);  
		em.getTransaction().commit();  
		
		
		emf.close();
		em.close();
}
public void deleteItem(int id) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("STOCK_ITEMS");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		StockItem c = em.find(StockItem.class,id);  
		em.remove(c);  
		em.getTransaction().commit();  
		
		
		emf.close();
		em.close();
}

public void checkItem(int id,int custId) {
	EntityManagerFactory emf =Persistence.createEntityManagerFactory("RENTED_ITEMS");
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();
	Calendar today = Calendar.getInstance();
	RentedItem r = new RentedItem(id,custId,today.getTime());
	
	em.persist(r);
	em.getTransaction().commit();
	
	emf.close();
	em.close();
}


public void unCheckItem(int id) {
	EntityManagerFactory emf =Persistence.createEntityManagerFactory("RENTED_ITEMS");
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();
	
	RentedItem c = em.find(RentedItem.class,id);  
	em.remove(c);  
	em.getTransaction().commit();  
	
	
	emf.close();
	em.close();
}

}
