package com.example.convertdoctorapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.convertdoctorapp.entity.Appointment;
import com.example.convertdoctorapp.entity.Doctortable;
import com.example.convertdoctorapp.entity.Patient;
import com.example.convertdoctorapp.ropository.Datajparepo;
import com.example.convertdoctorapp.ropository.Doctorrepo;

@Service
@Transactional
public class DoctorServiceImpl implements Doctorservice {
   

     @Autowired
    Datajparepo datajparepo;

    @Autowired
    Doctorrepo doctorrepo;

    @Override
    public void docterAppoInsert(Appointment appo) {
          doctorrepo.save(appo);
    }

    @Override
    public List<Doctortable> pickdoctorname() {        
        return datajparepo.findByDoctorname();
    }

    @Override
    public Doctortable findByUsernamePasswordforD(String name,int pass) {
        return datajparepo.findByUsernamePasswordforD(name, pass);
    }

    @Override
    public String finduser(String name) {
        return datajparepo.finduser(name);
    }

    @Override
    public String findname(String name) {
        return datajparepo.findname(name);
    }

    @Override
    public Patient findByUsernamePassword(String name, String pass) {
        return datajparepo.findByUsernamePassword(name,pass);
    }

    @Override
    public String findpatientid(String r) {
        return datajparepo.findpatientid(r);
    }

    @Override
    public List<Doctortable> findByDoctorname() {
        return datajparepo.findByDoctorname();
    }

    @Override
    public List<Appointment> findByAppoiment() {
        return datajparepo.findByAppoiment();
    }

    @Override
    public int something() {
        return datajparepo.something();
    }

    @Override
    public List<Patient> findByAddressOrPasswd(String address1, String passwd1) {
        return datajparepo.findByAddressOrPasswd(address1, passwd1);
    }

    @Override
    public List<Patient> findByPname(String pname1) {
        return datajparepo.findByPname(pname1);
    }

    @Override
    public List<Patient> findByAddressAndPasswd(String address1, String passwd1) {
        return datajparepo.findByAddressAndPasswd(address1, passwd1);
    }

    @Override
    public int countByPname(String name) {
        return datajparepo.countByPname(name);
    }

    @Override
    public List<Patient> getByAddressOrPasswd(String address1, String passwd1) {
        return datajparepo.getByAddressOrPasswd(address1, passwd1);
    }

    @Override
    public Object finddocdate() {
        return datajparepo.finddocdate();
    }

    @Override
    public List<Appointment> findByDID(int object) {
        //doctorrepo
        return doctorrepo.findByDID(object);
    }

    @Override
    public List<Appointment> findByPatientid(String object) {
        //doctorrepo
        return doctorrepo.findByPatientid(object);
    }

    @Override
    public Appointment findByAppid(Integer message) {
        //doctorrepo
        return doctorrepo.findByAppid(message);
    }


    @Override
    public void saveappoiment(Appointment appointment) {
        doctorrepo.save(appointment);
    }

   
}
