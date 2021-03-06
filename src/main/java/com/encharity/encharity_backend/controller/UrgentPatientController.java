package com.encharity.encharity_backend.controller;

import com.encharity.encharity_backend.exception.ResourceNotFoundException;
import com.encharity.encharity_backend.model.UrgentPatient;
import com.encharity.encharity_backend.repository.UrgentPatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/allPatients")
public class UrgentPatientController {

    @Autowired
    UrgentPatientRepository urgentPatientRepository;

    @GetMapping("/urgentPatients")
    public List<UrgentPatient> getAllUrgentPatients(){
        return urgentPatientRepository.findAll();
    }

    @PostMapping("/addUrgentPatient")
    public UrgentPatient addUrgentPatient(@Valid @RequestBody UrgentPatient urgentPatient){
        return urgentPatientRepository.save(urgentPatient);
    }

    @GetMapping("urgentPatients/{id}")
    public UrgentPatient getUrgentPatient(@PathVariable(value = "id") int urgentPatientId){
        return urgentPatientRepository.findById(urgentPatientId)
                .orElseThrow(() -> new ResourceNotFoundException("UrgentPatient","id",urgentPatientId));
    }

    @PutMapping("urgentPatients/{id}")
    public UrgentPatient updatePatient(@PathVariable(value = "id") int urgentPatientId, @Valid @RequestBody UrgentPatient urgentPatientDetails){

        UrgentPatient urgentPatient = urgentPatientRepository.findById(urgentPatientId).orElseThrow(()-> new ResourceNotFoundException("UrgentPatient","id",urgentPatientId));

        urgentPatient.setUrgentPhotoId(urgentPatientDetails.getUrgentPhotoId());
        urgentPatient.setUrgentFullname(urgentPatientDetails.getUrgentFullname());
        urgentPatient.setUrgentCategory(urgentPatientDetails.getUrgentCategory());
        urgentPatient.setUrgentDescription(urgentPatientDetails.getUrgentDescription());
        urgentPatient.setUrgentTotalTenge(urgentPatientDetails.getUrgentTotalTenge());
        urgentPatient.setUrgentFundedPercent(urgentPatientDetails.getUrgentFundedPercent());
        urgentPatient.setUrgentDaysLeft(urgentPatientDetails.getUrgentDaysLeft());
        urgentPatient.setUrgentCity(urgentPatientDetails.getUrgentCity());

        UrgentPatient updatedUrgentPatient = urgentPatientRepository.save(urgentPatient);

        return updatedUrgentPatient;
    }

    @DeleteMapping("urgentPatients/{id}")
    public ResponseEntity<?> deleteUrgentPatient(@PathVariable(value = "id") int urgentPatientId){

        UrgentPatient urgentPatient  = urgentPatientRepository.findById(urgentPatientId).orElseThrow(()-> new ResourceNotFoundException("Patient","id",urgentPatientId));

        urgentPatientRepository.delete(urgentPatient);

        return ResponseEntity.ok().build();

    }

}
