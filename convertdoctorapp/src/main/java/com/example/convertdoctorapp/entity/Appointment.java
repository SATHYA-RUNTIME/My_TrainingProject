package com.example.convertdoctorapp.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "appointment")
public class Appointment {
    @Id
    private int appid;
    private String  patientid;
    private String APPDATE;
    private int HID;
    // @OneToMany(mappedBy = "DID")
    private int DID;
    private int status;
    public int getAppid() {
        return appid;
    }
    public void setAppid(int appid) {
        this.appid = appid;
    }
    public String getPatientid() {
        return patientid;
    }
    public void setPatientid(String patientid) {
        patientid = patientid;
    }
    public String getAPPDATE() {
        return APPDATE;
    }
    public void setAPPDATE(String aPPDATE) {
        APPDATE = aPPDATE;
    }
    public int getHID() {
        return HID;
    }
    public void setHID(int hID) {
        HID = hID;
    }
    public int getDID() {
        return DID;
    }
    public void setDID(int dID) {
        DID = dID;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Appointment [appid=" + appid + ", Patientid=" + patientid + ", APPDATE=" + APPDATE + ", HID=" + HID
                + ", DID=" + DID + ", status=" + status + "]";
    }

    



}

