package com.jsp.vehicle.chasis;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("neha");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	//object of vehicle
	Vehicle v1=new Vehicle();
	v1.setName("bike");
	v1.setBrand("abc");
	v1.setColor("blue");
	v1.setPrice(15000);
	//object of chasis
	Chasis c1=new Chasis();
	c1.setChasisno("12345asdfgh");
	c1.setVehicle1(v1);
	
	et.begin();
	em.persist(v1);
	em.persist(c1);
	et.commit();
}
}
