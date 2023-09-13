package com.etr.MedicalProject.controller.doctor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etr.MedicalProject.entity.doctor.Doctor;
import com.etr.MedicalProject.service.doctor.DoctorService;

@RequestMapping("/dr")
@RestController
@CrossOrigin(origins="http://localhost:4200/")
public class DoctorController {

	@Autowired
	DoctorService doctorService;
	
	@PostMapping("/add")
	Doctor addDoctor(@RequestBody Doctor doctor) {
		return doctorService.createDoctor(doctor);
	}
	
	@GetMapping("/getAll")
	List<Doctor> getAll(){
		return doctorService.getAll();
	}
	
	@GetMapping("/getByType/{sp}")
	List<Doctor> getByType(@PathVariable long sp){
		return doctorService.getDoctorBySpecialization(sp);
	}
	
	@PostMapping("/authenticate")
	Doctor authenticate	
}
