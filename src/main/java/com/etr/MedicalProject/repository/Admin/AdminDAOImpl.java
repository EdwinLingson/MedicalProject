package com.etr.MedicalProject.repository.Admin;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.etr.MedicalProject.entity.admin.Admin;


import jakarta.persistence.EntityManager;

@Repository
public class AdminDAOImpl implements AdminDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public Admin createAdmin(Admin admin) {
		Session currSession =entityManager.unwrap(Session.class);
		long id = (long) currSession.save(admin);
		return currSession.get(Admin.class,id);
	}
}
