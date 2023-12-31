package com.etr.MedicalProject.service.doctor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etr.MedicalProject.entity.doctor.Doctor;
import com.etr.MedicalProject.repository.doctor.DoctorDAO;
import com.etr.MedicalProject.repository.model.UserAuth;

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
	@Override
	public List<Doctor> getDoctorBySpecialization(long spec) {
		// TODO Auto-generated method stub
		String specialization = getSpec((int)spec);
		return doctorDAO.getDoctorBySpecialization(specialization);
	}
	private String getSpec(int spec) {
		switch(spec) {
		case 1: return "Pulmonory";
		case 2: return "General Medicine";
		case 3: return "General Surgery";
		case 4: return "Pediatric";
		}
		return null;
	}
	@Override
	public UserAuth authenticate(Doctor doctor) {
		UserAuth retObj = new UserAuth();
		Doctor realDr = getDoctorbyUsername(doctor.getUname());
		if(realDr==null)return retObj;
		
		retObj.setId(realDr.getId());
		retObj.setSuccess(realDr.authenticate(doctor.getUname(), doctor.getPwd()));
		return retObj;
	}
	
	private Doctor getDoctorbyUsername(String uname) {
		Doctor dr = doctorDAO.getDoctorByUname(uname);
		
		return dr;
	}
	@Override
	public Doctor getDoctor(long id) {
		
		return doctorDAO.get(id);
	}
	

}
