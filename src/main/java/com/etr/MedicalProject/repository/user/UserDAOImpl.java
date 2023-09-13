package com.etr.MedicalProject.repository.user;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
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
	    
	    public User getUserDetailsByApptNameAndUserId(String apptname, Long userId) {
	        Session session = entityManager.unwrap(Session.class);
	        String query = "FROM User u WHERE u.apptname = :apptname AND u.id = :userId";
	        return (User) session.createQuery(query)
	                .setParameter("apptname", apptname)
	                .setParameter("userId", userId)
	                .uniqueResult();
	    }





//		@Override
//		public User getUser(long id) {
//			// TODO Auto-generated method stub
//			Session currSession =entityManager.unwrap(Session.class);
//			System.out.println(id);
//			return currSession.get(User.class,id);
//		}




//		@Override
//		public User getCustomerByApptName(String aname) {
//			// TODO Auto-generated method stub
//			Session currSession =entityManager.unwrap(Session.class);
//			Query<User> query = currSession.createQuery("from Customer u where u.aname ="
//					+ " :aname",User.class);
//			query.setParameter("uname",aname);
//			List<User> list = query.getResultList();
//			if(list.size()>0)
//			return list.get(0);
//			return null;
//		}
	

}
