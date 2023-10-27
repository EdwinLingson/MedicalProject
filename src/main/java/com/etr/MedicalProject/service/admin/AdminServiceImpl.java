package com.etr.MedicalProject.service.admin;

import com.etr.MedicalProject.entity.admin.Admin;
import com.etr.MedicalProject.repository.Admin.AdminDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminDAO adminDAO;

    @Override
    public Admin createAdmin(Admin admin) {
        return adminDAO.createAdmin(admin);
    }
    @Override
    public boolean authenticate(String username, String password) {
        Admin admin = adminDAO.getAdminByUsername(username);

        if (admin != null) {
            if (admin.getPassword().equals(password)) {
                return true;
            } else {
                System.out.println("Password does not match");
            }
        } else {
            System.out.println("Admin not found");
        }

        return false;
    }

    @Override
    public Admin getAdminByUsername(String username) {
        return adminDAO.getAdminByUsername(username);
    }
}
