package com.example.convertdoctorapp.service;

import java.util.List;

import com.example.convertdoctorapp.entity.Appointment;
import com.example.convertdoctorapp.entity.Doctortable;
import com.example.convertdoctorapp.entity.Patient;

/**
 * Doctorservice
 */
public interface Doctorservice {

	
    public void docterAppoInsert(Appointment appointment);
    public List<Doctortable> pickdoctorname();
    public Doctortable findByUsernamePasswordforD(String a,int p);
    public String  finduser(String name);
    public String findname(String name);
    public Patient findByUsernamePassword(String name,String pass);
    public String findpatientid(String r);
    public List<Doctortable> findByDoctorname();
    public List<Appointment> findByAppoiment(); 
    public int something();
    List<Patient> findByAddressOrPasswd(String address1,String passwd1);
    List<Patient> findByPname(String pname1);
    List<Patient> findByAddressAndPasswd(String address1,String passwd1);
    public int countByPname(String name);
    List<Patient> getByAddressOrPasswd(String address1,String passwd1);
    public Object finddocdate();
    List<Appointment> findByDID(int object);
    List<Appointment> findByPatientid(String object);
    Appointment findByAppid(Integer message);
    public void saveappoiment(Appointment appointment);
}