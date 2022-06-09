
package com.gaitan.SpringAuthentication.controller;

import com.gaitan.SpringAuthentication.domain.AboutMe;
import com.gaitan.SpringAuthentication.service.AboutMeService;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/aboutme")
public class AboutMeController {
    
    @Autowired
    private final AboutMeService aboutMeService;
    
    public AboutMeController(AboutMeService aboutMeService){
        this.aboutMeService = aboutMeService;
    }
    
    @GetMapping
    public ResponseEntity<List<AboutMe>> getAllAboutMe(){
        List<AboutMe> aboutme=aboutMeService.findAllAboutMe();
        return new ResponseEntity<>(aboutme, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<AboutMe> addAboutMe(@RequestBody AboutMe aboutme){
        AboutMe newAboutMe=aboutMeService.addAboutMe(aboutme);
        return new ResponseEntity<>(newAboutMe,HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity<AboutMe> updateAboutMe(@RequestBody AboutMe aboutme){
        AboutMe updateAboutMe=aboutMeService.updateAboutMe(aboutme);
        return new ResponseEntity<>(updateAboutMe,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAboutMe(@PathVariable("id") Long id){
        aboutMeService.deleteAboutMe(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
