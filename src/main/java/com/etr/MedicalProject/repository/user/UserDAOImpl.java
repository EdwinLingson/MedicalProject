package com.etr.MedicalProject.repository.user;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.etr.MedicalProject.entity.user.User;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO {
	@Autowired
	private  EntityManager entityManager;

	    
	  

	    @Override
	    public User createUser(User user) {
	       Session currSession=entityManager.unwrap(Session.class);
	       long id= (long) currSession.save(user);
	       return currSession.get(User.class, id);
	    }
//
//	    @Override
//	    public List<User> getAllUsers() {
//	        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
//	    }
	

}
