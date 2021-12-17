package com.demolab.demolab.Controller;

import com.demolab.demolab.Model.Patients;
import com.demolab.demolab.Repository.PatientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Creating Microservice to Create, Add, Update & Delete Data

@RestController
public class PatientsController {

//Autowired inject values from class, PatientsRepository is our Repository

    @Autowired
    private PatientsRepository repository;

// Toget all Patients in Database @Getmpping Annotaion used
// Use Api in Localhost:8080 with given API
// findall function used to get all the patients details in database

    @GetMapping(value = "/getPatients")
    public List<Patients> getPatients(){
        return repository.findAll();
    }

// To Add New Data we are using @Postmapping Annotation

    @PostMapping(value = "/AddNewPatient")
    public String savePatients(@RequestBody Patients patients){
        repository.save(patients);
        return ("The Data Entered is Added.......");
    }

//To update database with ID we are using @PutMapping Annotation

    @PutMapping("/UpdatePatient/{id}")
    public String updatePatients(@PathVariable long id, @RequestBody Patients patients){
        Patients updatedPatients=repository.findById(id).get();
        updatedPatients.setPatientname(patients.getPatientname());
        updatedPatients.setPatientphno(patients.getPatientphno());
        updatedPatients.setReportnumber(patients.getReportnumber());
        updatedPatients.setTestname(patients.getTestname());
        updatedPatients.setPrice(patients.getPrice());
        repository.save(updatedPatients);
        return "Changes Which are made It's Updated......";

    }

// To Delete database with ID we are using @PutMapping Annotation

    @DeleteMapping("/DeletePatient/{id}")
    public String deletePatients(@PathVariable Long id){
        Patients deletePatients=repository.findById(id).get();
        repository.delete(deletePatients);
        return "The Id which Selected It's Deleted......";
    }

}
