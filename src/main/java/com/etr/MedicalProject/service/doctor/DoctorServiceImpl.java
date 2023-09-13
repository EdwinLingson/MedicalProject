package com.etr.MedicalProject.service.doctor;

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
		// TODO Auto-generated method stub
		return doctorDAO.createDoctor(doctor);
	}

}
