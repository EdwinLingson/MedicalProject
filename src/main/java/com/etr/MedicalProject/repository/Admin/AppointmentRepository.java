package com.etr.MedicalProject.repository.Admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etr.MedicalProject.entity.admin.Appointment;


@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
