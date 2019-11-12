package com.bookstore.entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.bookstore.entity.Category;

public class CategoryTest {

	public static void main(String[] args) {
		Category newCat = new Category("Advanced Java");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BookStoreWebsite");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(newCat);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		System.out.println("Categoria Nueva guardado");
	}

}
