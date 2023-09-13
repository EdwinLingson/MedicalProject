package com.etr.MedicalProject.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etr.MedicalProject.entity.admin.Admin;

import com.etr.MedicalProject.service.admin.AdminService;

@RequestMapping("/mgr")
@RestController
@CrossOrigin(origins="http://localhost:4200/")
public class AdminController {

		@Autowired
	  AdminService adminService;
		
		@PostMapping("/add")
		Admin addAdmin(@RequestBody Admin admin) {
			return adminService.createAdmin(admin);
		}	
		
		@PostMapping("/authenticate")
	    public boolean authenticateAdmin(@RequestBody Admin admin) {
	        boolean isAuthenticated = admin.authenticate(admin.getUsername(), admin.getPassword());
	        return isAuthenticated;
	    }
	}
