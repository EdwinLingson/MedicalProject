package com.etr.MedicalProject.entity.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String gen;
	private int age;
	private String mNum;
	private String email;
	private String hHistory;
	private Long apptNum;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public User(Long id, String gen, int age, String mNum, String email, String hHistory, Long apptNum) {
		super();
		this.id = id;
		this.gen = gen;
		this.age = age;
		this.mNum = mNum;
		this.email = email;
		this.hHistory = hHistory;
		this.apptNum = apptNum;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getGen() {
		return gen;
	}


	public void setGen(String gen) {
		this.gen = gen;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getmNum() {
		return mNum;
	}


	public void setmNum(String mNum) {
		this.mNum = mNum;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String gethHistory() {
		return hHistory;
	}


	public void sethHistory(String hHistory) {
		this.hHistory = hHistory;
	}


	public Long getApptNum() {
		return apptNum;
	}


	public void setApptNum(Long apptNum) {
		this.apptNum = apptNum;
	}


	
	
	

}
