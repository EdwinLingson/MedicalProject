package com.etr.MedicalProject.service.doctor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etr.MedicalProject.entity.doctor.Doctor;
import com.etr.MedicalProject.repository.doctor.DoctorDAO;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	DoctorDAO doctorDAO;
	@Override
	public Doctor createDoctor(Doctor doctor) {
		return doctorDAO.createDoctor(doctor);
	}
	@Override
	public List<Doctor> getAll() {
		return doctorDAO.getAll();
	}

}
