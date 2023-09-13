package com.etr.MedicalProject.entity.admin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

@Entity
@Table(name = "appointment")
public class Appointment {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id")
    private Long appointmentId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "doctor_id")
    private Long doctorId;

    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date date;

    @Column(name = "time")
    private String time;

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(Long appointmentId, Long userId, Long doctorId, Date date, String time) {
		super();
		this.appointmentId = appointmentId;
		this.userId = userId;
		this.doctorId = doctorId;
		this.date = date;
		this.time = time;
	}

	public Long getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(Long appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", userId=" + userId + ", doctorId=" + doctorId
				+ ", date=" + date + ", time=" + time + "]";
	}


}
