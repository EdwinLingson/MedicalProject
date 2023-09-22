package com.etr.MedicalProject.service.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etr.MedicalProject.entity.admin.Appointment;
import com.etr.MedicalProject.repository.Admin.AppointmentRepository;
import com.etr.MedicalProject.repository.model.InAppointment;
import com.etr.MedicalProject.service.user.UserService;

import jakarta.transaction.Transactional;

@Service
public class AppointmentServiceImpl implements AppointmentService {
	
	
	@Autowired
	private AppointmentRepository appointmentRepository;
	@Autowired
	private UserService userService;
	

    
   


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

	@Transactional
	@Override
	public InAppointment createAppointment(InAppointment inAppointment) {
		// TODO Auto-generated method stub
		inAppointment.setUser(userService.createUser(inAppointment.getUser()));
		long userId = inAppointment.getUser().getId();
		inAppointment.getAppt().setUserId(userId);
		inAppointment.setAppt(appointmentRepository.save(inAppointment.getAppt()));
		long apptId= inAppointment.getAppt().getAppointmentId();
		inAppointment.getUser().setApptNum(apptId);
		inAppointment.setUser(userService.updateUser(inAppointment.getUser()));
		return inAppointment;
	}

	@Override
	public List<Appointment> appointmentsForDoctor(long dId) {
		return appointmentRepository.findAll().stream()
				.filter(e->e.getDoctorId()==dId)
				.toList();
	}
}
