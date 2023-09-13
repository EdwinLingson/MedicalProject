package com.etr.MedicalProject.service.doctor;


import java.util.List;

import com.etr.MedicalProject.entity.doctor.Doctor;
import com.etr.MedicalProject.repository.model.UserAuth;

public interface DoctorService {

	Doctor createDoctor(Doctor doctor);
	List<Doctor> getAll();
	List<Doctor> getDoctorBySpecialization(long spec);
	UserAuth authenticate(Doctor doctor);
}
