package com.example.convertdoctorapp.ropository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.convertdoctorapp.entity.Appointment;
import com.example.convertdoctorapp.entity.Doctortable;

@Repository
public interface Doctorrepo extends CrudRepository<Appointment,Integer> {
    
    List<Appointment> findByDID(int object);
    List<Appointment> findByPatientid(String object);
    Appointment findByAppid(Integer message);
    


}
