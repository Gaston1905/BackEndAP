
package com.backendap.backendap.controladora;

import com.backendap.backendap.modelos.Skills;
import com.backendap.backendap.servicio.SkillsServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
        
@RestController
@RequestMapping("api/skill")
public class ControladoraSkills {
    
    @Autowired
    private final SkillsServicio skillService;

    public ControladoraSkills(SkillsServicio skillService) {
        this.skillService = skillService;
    }

    @GetMapping
    public ResponseEntity<List<Skills>> getAllSkill(){
        List<Skills> projects=skillService.findAllSkills();
        return new ResponseEntity<>(projects, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Skills> addSkill(@RequestBody Skills skill){
        Skills newSkill=skillService.addSkill(skill);
        return new ResponseEntity<>(newSkill,HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity<Skills> updateSkill(@RequestBody Skills project){
        Skills updateSkill=skillService.updateSkill(project);
        return new ResponseEntity<>(updateSkill,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSkill(@PathVariable("id") Long id){
        skillService.deleteSkill(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

