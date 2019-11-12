package com.bookstore.entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bookstore.entity.Users;

public class UsersTest {

	public static void main(String[] args) {
		Users user = new Users();
		user.setEmail("user2@mail.com");
		user.setFullName("Usuario2 Apellido2");
		user.setPassword("123456");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BookStoreWebsite");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		System.out.println("Usuario guardado");
	}

}
