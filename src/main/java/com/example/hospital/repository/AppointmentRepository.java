package com.example.hospital.repository;

import com.example.hospital.model.Appointment;
import com.example.hospital.model.AppointmentStatus;
import com.example.hospital.model.Doctor;
import com.example.hospital.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

//    boolean existsByDoctorAndAppointmentDateAndAppointmentTime(
//            Doctor doctor,
//            LocalDate appointmentDate,
//            LocalTime appointmentTime
//    );
boolean existsByPatientAndDoctorAndAppointmentDate(
        User patient,
        Doctor doctor,
        LocalDate appointmentDate
);

    List<Appointment> findByDoctorId(Long doctorId);
    Page<Appointment> findAll(Pageable pageable);
    long countByStatus(AppointmentStatus status);
}
