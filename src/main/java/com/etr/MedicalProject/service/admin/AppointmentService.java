package com.etr.MedicalProject.service.admin;

import java.util.List;
import com.etr.MedicalProject.entity.admin.Appointment;
import com.etr.MedicalProject.repository.model.InAppointment;

public interface AppointmentService {
    Appointment createAppointment(Appointment appointment);
    List<Appointment> getAllAppointments();
	Appointment save(Appointment appointment);
	List<Appointment> findAll();
	List<Appointment> appointmentsForDoctor(long dId);
	InAppointment createAppointment(InAppointment inAppointment);

}