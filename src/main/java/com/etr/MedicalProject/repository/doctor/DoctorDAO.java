package com.etr.MedicalProject.repository.doctor;

import java.util.List;

import com.etr.MedicalProject.entity.doctor.Doctor;

public interface DoctorDAO {

	Doctor createDoctor(Doctor doc);
	List<Doctor> getAll();
	List<Doctor> getDoctorBySpecialization(String spec);
}
