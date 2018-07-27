package run;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Customer;
public class JpaExample {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("jpa_example");
		EntityManager em=factory.createEntityManager();
		Customer cust=new Customer();
		//cust.setName("NameCust1");	
		em.persist(cust);
		em.close();
	}

}
