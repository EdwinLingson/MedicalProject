package com.etr.MedicalProject.controller.doctor;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etr.MedicalProject.entity.doctor.Doctor;

@RequestMapping("/dr")
@RestController
@CrossOrigin(origins="http://localhost:4200/")
public class DoctorController {

	@RequestMapping("/add")
	Doctor addDoctor(Doctor doctor) {
		return null;
	}
}
