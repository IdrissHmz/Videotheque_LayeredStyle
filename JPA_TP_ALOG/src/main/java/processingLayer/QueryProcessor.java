package processingLayer;
import javax.persistence.*;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.criteria.*; 
import modelLayer.*;

public class QueryProcessor {

	public List<Client> getClients(){

        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );  
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin( );  
        CriteriaBuilder cb=em.getCriteriaBuilder();  
        CriteriaQuery<Client> cq=cb.createQuery(Client.class);  
           
        Root<Client> cli = cq.from(Client.class); 
        
        cq.multiselect(cli.get("customerID"),cli.get("nom"),cli.get("accountBalance") );  
        CriteriaQuery<Client> select = cq.select(cli);  
        TypedQuery<Client> q = em.createQuery(select);  
        List<Client> list = q.getResultList();  
        
        em.getTransaction().commit();  
        em.close();  
        emf.close(); 
        return list;
		
	}
	
	public List<StockItem> getItems(){

        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );  
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin( );  
        CriteriaBuilder cb=em.getCriteriaBuilder();  
        CriteriaQuery<StockItem> cq=cb.createQuery(StockItem.class);  
           
        Root<StockItem> cli = cq.from(StockItem.class); 
        
        cq.multiselect(cli.get("itemID"),cli.get("name"),cli.get("RentalPrice") );  
        CriteriaQuery<StockItem> select = cq.select(cli);  
        TypedQuery<StockItem> q = em.createQuery(select);  
        List<StockItem> list = q.getResultList();  
        
        em.getTransaction().commit();  
        em.close();  
        emf.close(); 
        return list;
		
	}
	public List<StockItem> FindByTitle(String tit){
		
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Stock_Items" );  
         EntityManager em = emf.createEntityManager();  
         em.getTransaction().begin( );  
           
         CriteriaBuilder cb=em.getCriteriaBuilder();  
           
         AbstractQuery<StockItem> cq1=cb.createQuery(StockItem.class); 
           
        Root<StockItem> st=cq1.from(StockItem.class);  
          
       cq1.where(cb.equal(st.get("name"), tit));  
         
         CriteriaQuery<StockItem> select1 = ((CriteriaQuery<StockItem>) cq1).select(st);  
         TypedQuery<StockItem> tq1 = em.createQuery(select1);  
         List<StockItem> list = tq1.getResultList();  
		
		return list;
	}
	
	public List<StockItem> FindByActor(String act){
		
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Stock_Items" );  
         EntityManager em = emf.createEntityManager();  
         em.getTransaction().begin( );  
           
         CriteriaBuilder cb=em.getCriteriaBuilder();  
           
         AbstractQuery<StockItem> cq1=cb.createQuery(StockItem.class); 
           
         Root<StockItem> st=cq1.from(StockItem.class);  
          
         cq1.where(cb.equal(st.get("acteur"), act));  
         
         CriteriaQuery<StockItem> select1 = ((CriteriaQuery<StockItem>) cq1).select(st);  
         TypedQuery<StockItem> tq1 = em.createQuery(select1);  
         List<StockItem> list = tq1.getResultList();  
		
		return list;
	}
	public List<RentedItem> overDueItems(Date date){
		
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Rented_Items" );  
         EntityManager em = emf.createEntityManager();  
         em.getTransaction().begin( );  
           
         CriteriaBuilder cb=em.getCriteriaBuilder();  
           
         AbstractQuery<RentedItem> cq1=cb.createQuery(RentedItem.class); 
           
         Root<RentedItem> st=cq1.from(RentedItem.class);  
          
         cq1.where(cb.equal(st.get("DueDate"), date));  
         
         CriteriaQuery<RentedItem> select1 = ((CriteriaQuery<RentedItem>) cq1).select(st);  
         TypedQuery<RentedItem> tq1 = em.createQuery(select1);  
         List<RentedItem> list = tq1.getResultList();  
		
		return list;
	}
	
	
	public int Solde(){
		
		return 0;
	}
	public boolean isCheckedOut(){
		
		return false;
	}
	
}
