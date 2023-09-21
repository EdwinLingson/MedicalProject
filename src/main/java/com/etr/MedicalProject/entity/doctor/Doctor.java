package com.etr.MedicalProject.entity.doctor;

import java.math.BigDecimal;

import com.etr.MedicalProject.entity.admin.Person;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Doctor implements Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String uname; 
	private String pwd;
	
	private String specialization;
	private String name;
	private BigDecimal fee;
	private BigDecimal experience;
	private String gender;
	@Column(name="availble_from")
	private String availableFrom;
	@Column(name="availble_to")
	private String availableTo;
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Doctor(Long id, String uname, String pwd, String specialization, String name, BigDecimal fee,
			BigDecimal experience, String gender, String availbleFrom, String availbleTo) {
		super();
		this.id = id;
		this.uname = uname;
		this.pwd = pwd;
		this.specialization = specialization;
		this.name = name;
		this.fee = fee;
		this.experience = experience;
		this.gender = gender;
		this.availableFrom = availbleFrom;
		this.availableTo = availbleTo;
	}

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getFee() {
		return fee;
	}

	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}

	public BigDecimal getExperience() {
		return experience;
	}

	public void setExperience(BigDecimal experience) {
		this.experience = experience;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAvailableFrom() {
		return availableFrom;
	}

	public void setAvailableFrom(String availableFrom) {
		this.availableFrom = availableFrom;
	}

	public String getAvailableTo() {
		return availableTo;
	}

	public void setAvailableTo(String availableTo) {
		this.availableTo = availableTo;
	}

	@Override
	public boolean authenticate(String username, String password) {
		return this.uname.equals(username) && this.pwd.equals(password);
	}
	

}
