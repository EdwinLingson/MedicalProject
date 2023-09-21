package com.etr.MedicalProject.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etr.MedicalProject.entity.user.User;
import com.etr.MedicalProject.repository.user.UserDAO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDAO;
	
	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return (User)userDAO.createUser(user);
	}

	@Override
	public User getUserDetailsByApptNameAndUserId(String apptname, Long userId) {
		// TODO Auto-generated method stub
		return userDAO.getUserDetailsByApptNameAndUserId(apptname, userId);
   
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return (User)userDAO.updateUser(user);
	}



	

}
