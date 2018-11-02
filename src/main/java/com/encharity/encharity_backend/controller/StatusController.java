package com.encharity.encharity_backend.controller;

import com.encharity.encharity_backend.model.Status;
import com.encharity.encharity_backend.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/allStatus")
public class StatusController {

        @Autowired
        StatusRepository statusRepository;

        @GetMapping("/status")
        public List<Status> getAllStatus(){
            return statusRepository.findAll();
        }

        @PostMapping("/addStatus")
        public Status addStatus(@Valid @RequestBody Status status){
            return statusRepository.save(status);
        }

}

