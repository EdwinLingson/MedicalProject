package com.etr.MedicalProject.repository.Admin;

import com.etr.MedicalProject.entity.admin.Admin;

public interface AdminDAO {

	Admin createAdmin(Admin admin);
	Admin getAdminByUsername(String username);
}
