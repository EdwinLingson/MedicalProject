package com.etr.MedicalProject.repository.doctor;

import java.util.List;

import javax.print.Doc;

import org.hibernate.Session;
import org.hibernate.query.Query;
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

	@Override
	public List<Doctor> getAll() {
		Session currSession =entityManager.unwrap(Session.class);
		Query <Doctor> query = currSession.createQuery("from Doctor",Doctor.class);
		List<Doctor> list = query.getResultList();
		if(list.size()>0)
		return list;
		return null;
	}

	@Override
	public List<Doctor> getDoctorBySpecialization(String spec) {
		Session currSession =entityManager.unwrap(Session.class);
		Query <Doctor> query = currSession.createQuery("from Doctor d where d.specialization=:spec",Doctor.class);
		query.setParameter("spec",spec);
		List<Doctor> list = query.getResultList();
		if(list.size()>0)
		return list;
		return null;
	}

	@Override
	public Doctor getDoctorByUname(String uname) {
		Session currSession =entityManager.unwrap(Session.class);
		Query <Doctor> query = currSession.createQuery("from Doctor u where u.uname ="
				+ " :uname",Doctor.class);
		query.setParameter("uname",uname);
		List<Doctor> list = query.getResultList();
		if(list.size()>0)
		return list.get(0);
		return null;
	}

	@Override
	public Doctor get(long id) {
		Session currSession =entityManager.unwrap(Session.class);
		return currSession.get(Doctor.class,id);
	}

}
