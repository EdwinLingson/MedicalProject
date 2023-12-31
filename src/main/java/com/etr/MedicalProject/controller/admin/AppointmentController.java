package com.etr.MedicalProject.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.etr.MedicalProject.entity.admin.Appointment;
import com.etr.MedicalProject.repository.model.InAppointment;
import com.etr.MedicalProject.service.admin.AppointmentService;

import java.util.List;

@RestController
@RequestMapping("/appointments")
@CrossOrigin(origins = "http://localhost:4200/")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @PostMapping("/add")
    public Appointment addAppointment(@RequestBody Appointment appointment) {
        return appointmentService.save(appointment);
    }
    
    @PostMapping("/create")	
    public InAppointment createAppointment(@RequestBody InAppointment appointment) {
        return appointmentService.createAppointment(appointment);
    }

    @GetMapping("/all")
    public List<Appointment> getAllAppointments() {
        return appointmentService.findAll();
    }
    @GetMapping("/byDoctor/{dId}")
    public List<Appointment> getAppointmentsForDoctor(@PathVariable long dId) {
    	System.out.println(dId);
        return appointmentService.appointmentsForDoctor(dId);
    }
    
}
