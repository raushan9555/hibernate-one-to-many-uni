package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertFoodOrderEntity {

	public static void main(String[] args) {
		FoodOrder foodOrder1=new FoodOrder();
		foodOrder1.setOrderedBy("Sandeep");
		foodOrder1.setStatus("served");
		
		Item item1=new Item();
		item1.setName("Pizza");
		item1.setQuantity("2");
		item1.setCost(749);
		
		Item item2=new Item();
		item2.setName("Pizza");
		item2.setQuantity("2");
		item2.setCost(749);
		
		List<Item> items=new ArrayList<Item>();
		items.add(item1);
		items.add(item2);
		
		foodOrder1.setItems(items);
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(foodOrder1);
		entityManager.persist(item1);
		entityManager.persist(item2);
		entityTransaction.commit();
		

	}

}
