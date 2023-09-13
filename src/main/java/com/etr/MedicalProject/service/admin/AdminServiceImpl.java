package com.etr.MedicalProject.service.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etr.MedicalProject.entity.admin.Admin;
import com.etr.MedicalProject.repository.Admin.AdminDAO;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDAO adminDAO;
	@Override
	public Admin createAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminDAO.createAdmin(admin);
	}
}
