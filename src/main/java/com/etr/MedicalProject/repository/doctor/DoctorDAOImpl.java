package com.etr.MedicalProject.repository.doctor;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.etr.MedicalProject.entity.doctor.Doctor;

import jakarta.persistence.EntityManager;

@Repository
public class DoctorDAOImpl implements DoctorDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public Doctor createDoctor(Doctor doc) {
		Session currSession =entityManager.unwrap(Session.class);
		long id = (long) currSession.save(doc);
		return currSession.get(Doctor.class,id);
	}

}