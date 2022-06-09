package com.gaitan.SpringAuthentication.service;

import com.gaitan.SpringAuthentication.domain.Experience;
import com.gaitan.SpringAuthentication.repository.ExperienceRespository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ExperienceService {

   private final ExperienceRespository experienceRespository;

    public ExperienceService(ExperienceRespository experienceRespository) {
        this.experienceRespository = experienceRespository;
    }

    public Experience addExperience(Experience experience){
        return experienceRespository.save(experience);
    }

    public Experience updateExperience(Experience experience){
        return experienceRespository.save(experience);
    }

    public List<Experience> findAllExperience(){
        return experienceRespository.findAll();
    }

    public void deleteExperience(long id){
        experienceRespository.deleteById(id);
    }
}
