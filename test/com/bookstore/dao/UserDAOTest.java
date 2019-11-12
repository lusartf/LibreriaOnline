package com.bookstore.dao;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.bookstore.entity.Users;

public class UserDAOTest {
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private static UserDAO userDAO;

	@BeforeClass
	public static void setupClass() throws Exception{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BookStoreWebsite");
		EntityManager em = emf.createEntityManager();
		userDAO = new UserDAO(em);
		
	}

	@Test
	public void testCreateUsers() {

		Users user = new Users();
		user.setEmail("edwin@mail.com");
		user.setFullName("Edwn Torres");
		user.setPassword("123456");

		user = userDAO.create(user);

		assertTrue(user.getUserId() > 0);
		
	}

	@Test( expected = PersistenceException.class )
	public void testCreateUsersFieldsNotSet() {
		Users user = new Users();
		//System.out.println(user.getEmail());
		user = userDAO.create(user);
	}
	
	@Test
	public void testUpdateUsers() {
		Users user = new Users();
		user.setUserId(20);
		user.setEmail("hass@mail.com");
		user.setFullName("Hassel Funes");
		user.setPassword("123456");
		
		user = userDAO.update(user);
		
		String expected = "hass@mail.com";
		String actual = user.getEmail();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetUsersFound() {
		Integer userId = 19;
		Users user = userDAO.get(userId);
		
		if (user != null) {
			System.out.println("testGetUsersFound: "+user.getFullName());
		}
		
		assertNotNull(user);
	}
	
	@Test 
	public void testGetUsersNotFound() {
		Integer userId = 99;
		Users user = userDAO.get(userId);
	
		assertNull(user);
	}
	
	@Test
	public void testDeleteUsers() {
		Integer userId = 39;
		userDAO.delete(userId);
		
		Users user = userDAO.get(userId);
		
		assertNull(user);
	}
	
	@Test(expected = EntityNotFoundException.class)
	public void testDeleteNonExistUsers() {
		Integer userId = 55;
		userDAO.delete(userId);
	}
	
	@AfterClass
	public static void tearDownClass() {
		em.close();
		emf.close();
	}
		
}
