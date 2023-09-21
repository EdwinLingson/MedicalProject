package com.etr.MedicalProject.repository.model;

import com.etr.MedicalProject.entity.admin.Appointment;
import com.etr.MedicalProject.entity.user.User;

public class InAppointment {

	private Appointment appt;
	private User user;
	
	public InAppointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InAppointment(Appointment inAppointment, User inUser) {
		super();
		this.appt = inAppointment;
		this.user = inUser;
	}

	public Appointment getAppt() {
		return appt;
	}

	public void setAppt(Appointment appt) {
		this.appt = appt;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	
	
}
