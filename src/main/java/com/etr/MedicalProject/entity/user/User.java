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
	private String gender;
	private int age;
	private String mNum;
	private String email;
	private String pHistory;
	private Long apptNum;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(Long id, String gender, int age, String mNum, String email, String pHistory, Long apptNum) {
		super();
		this.id = id;
		this.gender = gender;
		this.age = age;
		this.mNum = mNum;
		this.email = email;
		this.pHistory = pHistory;
		this.apptNum = apptNum;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
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


	public String getpHistory() {
		return pHistory;
	}


	public void setpHistory(String pHistory) {
		this.pHistory = pHistory;
	}


	public Long getApptNum() {
		return apptNum;
	}


	public void setApptNum(Long apptNum) {
		this.apptNum = apptNum;
	}
}
