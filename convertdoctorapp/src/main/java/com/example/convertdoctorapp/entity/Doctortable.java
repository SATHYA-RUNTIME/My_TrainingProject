package com.example.convertdoctorapp.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Doctortable {
    @Id
    // @ManyToOne
    // @Column(name="DID")
    private int DID;
    @Column(name="Duser")
    private String Duser;
    @Column(name="password")
    private int password;
  
    @Column(name="DNAME")
    private String DNAME;
    @Column(name="special")
    private String special;
    public int getDID() {
        return DID;
    }
    public void setDID(int dID) {
        DID = dID;
    }
    public String getDuser() {
        return Duser;
    }
    public void setDuser(String duser) {
        Duser = duser;
    }
    public int getPassword() {
        return password;
    }
    public void setPassword(int password) {
        this.password = password;
    }

    public String getDNAME() {
        return DNAME;
    }
    public void setDNAME(String dNAME) {
        DNAME = dNAME;
    }
    public String getSpecial() {
        return special;
    }
    public void setSpecial(String special) {
        this.special = special;
    }
    @Override
    public String toString() {
        return "Doctortable [DID=" + DID + ", Duser=" + Duser + ", password=" + password + ","
                + ", DNAME=" + DNAME + ", special=" + special + "]";
    }

  


}   
