package com.encharity.encharity_backend.controller;

import com.encharity.encharity_backend.exception.ResourceNotFoundException;
import com.encharity.encharity_backend.model.Patient;
import com.encharity.encharity_backend.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/allPatients")
public class PatientController {

    @Autowired
    PatientRepository patientRepository;

    @GetMapping("/patients")
    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }

    @PostMapping("/addPatient")
    public Patient addPatient(@Valid @RequestBody Patient patient){
        return patientRepository.save(patient);
    }

    @GetMapping("patients/{id}")
    public Patient getPatient(@PathVariable(value = "id") int patientId){
        return patientRepository.findById(patientId)
                .orElseThrow(() -> new ResourceNotFoundException("Patient","id",patientId));
    }

    @PutMapping("patients/{id}")
    public Patient updatePatient(@PathVariable(value = "id") int patientId, @Valid @RequestBody Patient patientDetails){

        Patient patient = patientRepository.findById(patientId).orElseThrow(()-> new ResourceNotFoundException("Patient","id",patientId));

        patient.setPhotoId(patientDetails.getPhotoId());
        patient.setFullname(patientDetails.getFullname());
        patient.setCategory(patientDetails.getCategory());
        patient.setDescription(patientDetails.getDescription());
        patient.setTotalTenge(patientDetails.getTotalTenge());
        patient.setFundedPercent(patientDetails.getFundedPercent());
        patient.setDaysLeft(patientDetails.getDaysLeft());
        patient.setCity(patientDetails.getCity());

        Patient updatedNote = patientRepository.save(patient);

        return updatedNote;
    }

    @DeleteMapping("patients/{id}")
    public ResponseEntity<?> deletePatient(@PathVariable(value = "id") int patientId){

        Patient patient  = patientRepository.findById(patientId).orElseThrow(()-> new ResourceNotFoundException("Patient","id",patientId));

        patientRepository.delete(patient);

        return ResponseEntity.ok().build();

    }

}
