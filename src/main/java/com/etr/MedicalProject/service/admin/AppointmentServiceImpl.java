package com.etr.MedicalProject.service.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etr.MedicalProject.entity.admin.Appointment;
import com.etr.MedicalProject.repository.Admin.AppointmentRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService {
	private final AppointmentRepository appointmentRepository;

    @Autowired
    public AppointmentServiceImpl(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }


    @Override
    public Appointment createAppointment(Appointment appointment) {
        System.out.println("Received appointment data: " + appointment);
        Appointment savedAppointment = appointmentRepository.save(appointment);
        System.out.println("Saved appointment data: " + savedAppointment);

        return savedAppointment;
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

	@Override
	public Appointment save(Appointment appointment) {
		return appointmentRepository.save(appointment);
	}

	@Override
	public List<Appointment> findAll() {
		   return appointmentRepository.findAll();
	}
}
