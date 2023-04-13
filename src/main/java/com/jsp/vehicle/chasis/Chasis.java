package com.jsp.vehicle.chasis;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Chasis {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String chasisno;
	
	@OneToOne
	private Vehicle vehicle1;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChasisno() {
		return chasisno;
	}
	public void setChasisno(String chasisno) {
		this.chasisno = chasisno;
	}
	public Vehicle getVehicle1() {
		return vehicle1;
	}
	public void setVehicle1(Vehicle vehicle1) {
		this.vehicle1=vehicle1;
	}
	
}
