package com.etr.MedicalProject.service.admin;

import com.etr.MedicalProject.entity.admin.Admin;

public interface AdminService {
    Admin createAdmin(Admin admin);
    Admin getAdminByUsername(String username);
    boolean authenticate(String username, String password);
}
