package com.encharity.encharity_backend.controller;

import com.encharity.encharity_backend.exception.ResourceNotFoundException;
import com.encharity.encharity_backend.model.Investment;
import com.encharity.encharity_backend.model.Patient;
import com.encharity.encharity_backend.model.UrgentPatient;
import com.encharity.encharity_backend.repository.InvestmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/allInvestments")
public class InvestmentController {

    @Autowired
    InvestmentRepository investmentRepository;

    @GetMapping("/investments")
    public List<Investment> getAllInvestments(){
        return investmentRepository.findAll();
    }

    @GetMapping("/investment/{id}")
    public Investment getInvestment(@PathVariable(value = "id") Long investmentId){
        return investmentRepository.findById(investmentId)
                .orElseThrow(() -> new ResourceNotFoundException("Investment","id",investmentId));
    }


    @PostMapping("/addInvestment")
    public Investment addInvestment(@Valid @RequestBody Investment investment){
        return investmentRepository.save(investment);
    }


}
