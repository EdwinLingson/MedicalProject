package com.etr.MedicalProject.repository.user;

import java.util.List;

import com.etr.MedicalProject.entity.user.User;

public interface UserDAO {

	User createUser(User user);
	//User getUser(long id);
	User getUserDetailsByApptNameAndUserId(String apptname, Long userId);


}
