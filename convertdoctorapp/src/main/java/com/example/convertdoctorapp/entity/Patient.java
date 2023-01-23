package com.example.convertdoctorapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {

    @Id
    private int Patientid;
    private String address;
    private double contact;
    private String mail;
    private String pname;
    private String passwd;
    public int getPatientid() {
        return Patientid;
    }
    public void setPatientid(int patientid) {
        Patientid = patientid;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public double getContact() {
        return contact;
    }
    public void setContact(double contact) {
        this.contact = contact;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getP_name() {
        return pname;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }
    public String getPasswd() {
        return passwd;
    }
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    public Patient(int patientid, String address, double contact, String mail, String pname, String passwd) {
        Patientid = patientid;
        this.address = address;
        this.contact = contact;
        this.mail = mail;
        this.pname = pname;
        this.passwd = passwd;
    }
    public Patient() {
    }
    @Override
    public String toString() {
        return " \n[" + Patientid + ", " + address + ", " + contact + ", " + mail
                + ", " + pname + ", " + passwd + "]";
    }


    
}
