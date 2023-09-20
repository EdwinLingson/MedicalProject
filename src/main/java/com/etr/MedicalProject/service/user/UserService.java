package com.etr.MedicalProject.service.user;

import com.etr.MedicalProject.entity.user.User;

public interface UserService {
	 User createUser(User user);
	 User getUserDetailsByApptNameAndUserId(String apptname, Long userId);
	
	
}
