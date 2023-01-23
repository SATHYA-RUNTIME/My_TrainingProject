package com.example.convertdoctorapp.ropository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.convertdoctorapp.entity.Patient;
import com.example.convertdoctorapp.entity.Appointment;
import com.example.convertdoctorapp.entity.Doctortable;

@Repository
public interface Datajparepo extends CrudRepository<Patient,Integer>{
    
    @Query("select mail from  Patient where Patientid=?1")
	public String findmail(int r);

    @Query("select DNAME from  Doctortable where Duser=?1")
	public String findname(String r);
    @Query("select DID from  Doctortable where Duser=?1")
	public String finduser(String r);

    @Query("select Patientid from  Patient where pname=?1")
	public String findpatientid(String r);

    @Query("from Patient where pname=?1 and passwd=?2")
	public Patient findByUsernamePassword(String username,String password);

    @Query("from Doctortable where Duser=?1 and password=?2")
    public Doctortable findByUsernamePasswordforD(String username,int password);

    @Query("from  Doctortable ")
	public List<Doctortable> findByDoctorname();    
    @Query("from  Appointment ")
	public List<Appointment> findByAppoiment();    

    @Query(nativeQuery = true,value ="select count('pname') from Patient;")
	public int something();
    
    List<Patient> findByAddressOrPasswd(String address1,String passwd1);

    List<Patient> findByPname(String pname1);

    List<Patient> findByAddressAndPasswd(String address1,String passwd1);

    public int countByPname(String name);

    List<Patient> getByAddressOrPasswd(String address1,String passwd1);

    @Query(nativeQuery = true,value ="select DISTINCT(DID),DNAME,special from doctortable;")
    public Object finddocdate();

}

