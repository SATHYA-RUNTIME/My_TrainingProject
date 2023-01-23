package com.example.convertdoctorapp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.aspectj.weaver.ast.And;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.convertdoctorapp.entity.Appointment;
import com.example.convertdoctorapp.entity.Doctortable;
import com.example.convertdoctorapp.entity.Patient;
import com.example.convertdoctorapp.ropository.Datajparepo;
import com.example.convertdoctorapp.ropository.Doctorrepo;
// import com.google.gson.Gson;
import com.google.gson.Gson;

@Controller
public class Homecontrol {

    @Autowired
    Datajparepo datajparepo;

    @Autowired
    Doctorrepo doctorrepo;

    @RequestMapping("/insertpatient")
    public String insertpatient(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("finalguy" + request.getParameter("Address11"));
        // Patient pt=new Patient(0, request.getParameter("Address"), 879876755,
        // request.getParameter("Mail"), request.getParameter("Patient_name"),
        // request.getParameter("Password"));
        // System.out.println("finalguyfinesh");
        // datajparepo.save(pt);
        System.out.println("finalguycompleted");
        return "Login";
    }

    @RequestMapping("/")
    public String getmail(HttpServletRequest request, HttpServletResponse response) {
        // HttpSession session1 = request.getSession();
        return "Login";
        // return datajparepo.findmail(1);
        // return session1.getAttribute("checkmyname");
    }

    @RequestMapping("/app")
    public String appoiment(HttpServletRequest request, HttpServletResponse response, Model model) {
        HttpSession session = request.getSession();
        model.addAttribute("uname1", session.getAttribute("goldenuser"));
        model.addAttribute("pid", session.getAttribute("goldenpatientid"));
      
        System.out.println(session.getAttribute("goldenuser"));
        return "appnt";
    }
    
    @RequestMapping("/makeapp2")
    public void makeapp2(HttpServletRequest request, HttpServletResponse response){
       
        Appointment appo= new Appointment();
        appo.setAppid(0);
        appo.setPatientid(request.getParameter("p_id"));
        appo.setDID(Integer.parseInt(request.getParameter("d_id")));
        appo.setHID(Integer.parseInt(request.getParameter("h_id")));
        appo.setAPPDATE(request.getParameter("date"));
        appo.setStatus(0);
        doctorrepo.save(appo);
    }

    @RequestMapping("/datecheck")
    public String checkdata(HttpServletRequest request, HttpServletResponse response) {

        return "appimentdate";
    }

    @PostMapping("/log_in")
    public String login(HttpServletRequest request, HttpServletResponse response, Model model) {
        if (request.getParameter("u_name").charAt(0) == 'D'
                && request.getParameter("u_name").charAt(request.getParameter("u_name").length() - 1) == 'r') {

            if (datajparepo.findByUsernamePasswordforD(request.getParameter("u_name"),
                   Integer.parseInt(request.getParameter("passwd")) ) != null) {
                System.out.println("welcome");
                HttpSession session = request.getSession();
                 System.out.println(datajparepo.findname(request.getParameter("u_name")));
                 session.setAttribute("goldenid",Integer.parseInt(datajparepo.finduser(request.getParameter("u_name"))));
                session.setAttribute("goldenuser",datajparepo.findname(request.getParameter("u_name")));
                model.addAttribute("uname1", session.getAttribute("goldenuser"));
                

               
                return "doctor";
            } else {
                System.out.println("go back come again");
                return "error2";
            }
        } else {

            if (datajparepo.findByUsernamePassword(request.getParameter("u_name"),
                    request.getParameter("passwd")) != null) {
                System.out.println("welcome");
                HttpSession session = request.getSession();
                session.setAttribute("goldenuser", request.getParameter("u_name"));
                model.addAttribute("uname1", session.getAttribute("goldenuser"));
                session.setAttribute("goldenpatientid",Integer.parseInt(datajparepo.findpatientid(request.getParameter("u_name"))));

                model.addAttribute("company","patient");
                return "doctor";
            } else {
                System.out.println("go back come again");
                return "error2";
            }
        }

    }

    @RequestMapping("/pickdoctor")
    public ResponseEntity<String> pickdoctor(HttpServletRequest request, HttpServletResponse response) {
        Gson g = new Gson();
        return ResponseEntity.ok(g.toJson(datajparepo.findByDoctorname()));
    }

    @RequestMapping("/hh")
    public void pickdoctor1(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("topten");
        datajparepo.findAll();

    }

    @RequestMapping("/hqldb")
    @ResponseBody
    public void hql23(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(datajparepo.something());
        // return datajparepo.something();
        // return datajparepo.countByPname("sathya");
        // System.out.println(datajparepo.findByAddressAndPasswd("tirupur","1234")+"oxofgbo");
        // System.out.println(datajparepo.findByPname("sathya")+"oxofgbo");
        // System.out.println(datajparepo.findByAddressOrPasswd("tirupur","1234")+"oxofgbo");
        // System.out.println(datajparepo.getByAddressOrPasswd("tirupur","1234")+"oxofgbo");

    }
    @RequestMapping("/viewaooiment")
    public String viewap(){
        return "display";
    }
    @GetMapping("/appoimentapi")
    public ResponseEntity<String> appoimentapi(){
        Gson g= new Gson();
        System.out.println("iamhere"+datajparepo.findByAppoiment());
        return ResponseEntity.ok(g.toJson(datajparepo.findByAppoiment()));   
     }
     @RequestMapping("/makeapp")
     public void makeapp(@RequestParam("message") String message){
        // doctorrepo.updateappo();
        System.out.println("dfgs"+message);
        Appointment ap= doctorrepo.findByAppid(Integer.parseInt(message));
        ap.setStatus(1);
        doctorrepo.save(ap);
        System.out.println("successfully updated");


     }
     @RequestMapping("/viewdoctorappo")
     public String doctorview(){
         return "dappoiment";
     }
     @GetMapping("/docappoimentapi")
     public ResponseEntity<String> dappoimentapi(HttpServletRequest req,HttpServletResponse res){
         Gson g= new Gson();
         HttpSession session = req.getSession();
         int t=(int) session.getAttribute("goldenid");  
         System.out.println("fgd"+doctorrepo.findByDID(t));         
         System.out.println(session.getAttribute("goldenid")+"iamhere"+doctorrepo.findByDID(t));
         return ResponseEntity.ok(g.toJson(doctorrepo.findByDID(t)));   
      }
      @RequestMapping("/showstatus")
      public ResponseEntity<String> showstatus(HttpServletRequest req,HttpServletResponse res){
        HttpSession session = req.getSession();
        int t=  (int) session.getAttribute("goldenpatientid"); 
        System.out.println("funby"+session.getAttribute("goldenpatientid")+t);
        Gson g= new Gson();
         
        return ResponseEntity.ok(g.toJson(doctorrepo.findByPatientid(String.valueOf(session.getAttribute("goldenpatientid")))));  
      }

    //   @GetMapping("/myapi2")     
    //   @ResponseBody
    //   public ResponseEntity<List<Doctortable>> doctorapi(){
    //     List<Doctortable> doc=datajparepo.findByDoctorname();
    //     return new ResponseEntity<List<Doctortable>>(doc,HttpStatus.OK);
    //   }
      
      @GetMapping("/myapi")     
      public ResponseEntity<String> doctorapi2(){
        Gson g= new Gson();
         return ResponseEntity.ok(g.toJson(datajparepo.findByDoctorname()));      
        
      }
      @PostMapping("/servdate")
      public ResponseEntity<String> checkdate(){
        Gson g= new Gson();
        return ResponseEntity.ok(g.toJson(datajparepo.finddocdate()));

      }
      
}