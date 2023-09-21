package com.etr.MedicalProject.repository.doctor;

import java.util.List;

import com.etr.MedicalProject.entity.doctor.Doctor;

public interface DoctorDAO {

	Doctor createDoctor(Doctor doc);
	List<Doctor> getAll();
	Doctor get(long id);
	List<Doctor> getDoctorBySpecialization(String spec);
	Doctor getDoctorByUname(String uname);
}
