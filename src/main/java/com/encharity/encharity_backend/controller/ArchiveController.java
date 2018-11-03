package com.encharity.encharity_backend.controller;

import com.encharity.encharity_backend.exception.ResourceNotFoundException;
import com.encharity.encharity_backend.model.Archive;
import com.encharity.encharity_backend.repository.ArchiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/archive")
public class ArchiveController {

    @Autowired
    ArchiveRepository archiveRepository;

    @GetMapping("/")
    public List<Archive> getAllArchive(){
        return archiveRepository.findAll();
    }

    @GetMapping("/{id}")
    public Archive getArchive(@PathVariable(value = "id") int archiveId){
        return archiveRepository.findById(archiveId)
                .orElseThrow(() -> new ResourceNotFoundException("Archive","id",archiveId));
    }

    @PostMapping("/addArchiveItem")
    public Archive addArchiveItem(@Valid @RequestBody Archive archive){
        return archiveRepository.save(archive);
    }


}
