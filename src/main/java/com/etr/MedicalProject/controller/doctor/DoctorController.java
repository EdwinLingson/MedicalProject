package com.etr.MedicalProject.controller.doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.etr.MedicalProject.entity.doctor.Doctor;
import com.etr.MedicalProject.repository.model.UserAuth;
import com.etr.MedicalProject.service.doctor.DoctorService;

import java.util.List;

@RequestMapping("/dr")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping("/add")
    Doctor addDoctor(@RequestBody Doctor doctor) {
        return doctorService.createDoctor(doctor);
    }

    @GetMapping("/getAll")
    List<Doctor> getAll() {
        return doctorService.getAll();
    }

    @GetMapping("/getByType/{sp}")
    List<Doctor> getByType(@PathVariable long sp) {
        return doctorService.getDoctorBySpecialization(sp);
    }

    @PostMapping("/authenticate")
    UserAuth authenticate(@RequestBody Doctor doctor) {
        return doctorService.authenticate(doctor);
    }

    
    @PutMapping("/update/{id}")
    Doctor updateDoctor(@PathVariable Long id, @RequestBody Doctor updatedDoctor) {
        return doctorService.updateDoctor(id, updatedDoctor);
    }
}
