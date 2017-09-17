package com.main.entity;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPATest {
	private static EntityManager em;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date mydate = new Date();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("db_sa");
		em = emf.createEntityManager();
		createCategory(1, "Kids", "Hello", true, 1, 1, mydate, mydate);
		System.out.println("Record created");
	}

	private static void createCategory(int id, String categoryName, String categoryDescription, boolean isActive,
			int addedBy, int updatedBy, Date addedDate, Date updatedDate) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		Category category = new Category(id, categoryName, categoryDescription, isActive, addedBy, updatedBy, addedDate,
				updatedDate);
		em.persist(category);
		em.getTransaction().commit();
	}

}
