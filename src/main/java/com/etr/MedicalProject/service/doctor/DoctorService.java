package com.etr.MedicalProject.service.doctor;


import java.util.List;

import com.etr.MedicalProject.entity.doctor.Doctor;

public interface DoctorService {

	Doctor createDoctor(Doctor doctor);
	List<Doctor> getAll();
}
