package com.etr.MedicalProject.controller.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
}
