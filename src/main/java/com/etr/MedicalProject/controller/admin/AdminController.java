package com.etr.MedicalProject.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.etr.MedicalProject.entity.admin.Admin;
import com.etr.MedicalProject.service.admin.AdminService;

@RestController
@CrossOrigin(origins = "http://localhost:4200") 
@RequestMapping("/mgr")
public class AdminController {

    @Autowired
    AdminService adminService;

    @PostMapping("/add")
    public Admin addAdmin(@RequestBody Admin admin) {
        return adminService.createAdmin(admin);
    }

    @PostMapping("/authenticate")
    public boolean authenticateAdmin(@RequestBody Admin admin) {
    	System.out.println("Received username: " + admin.getUsername());
        System.out.println("Received password: " + admin.getPassword());
        return adminService.authenticate(admin.getUsername(), admin.getPassword());
    }
}
