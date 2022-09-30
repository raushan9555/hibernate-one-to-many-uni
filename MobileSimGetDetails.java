package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MobileSimGetDetails {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Mobile mobile=entityManager.find(Mobile.class,1);
		
		
		Sim sim=entityManager.find(Sim.class,1);
		System.out.println(".....Mobile-Info.......");
		System.out.println(mobile.getId());
		System.out.println(mobile.getName());
		System.out.println(mobile.getCost());
		List<Sim> ls=mobile.getSims();
		if(ls!=null)
		for(Sim s:ls) {
			System.out.println(".......SimDetails........");
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getProvider());
			/*EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(mobile);
			entityManager.persist(sim);
			entityTransaction.commit();
			*/
		}

	}

}
