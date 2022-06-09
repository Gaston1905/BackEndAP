
package com.gaitan.SpringAuthentication.service;

import com.gaitan.SpringAuthentication.domain.AboutMe;
import com.gaitan.SpringAuthentication.repository.AboutMeRepository;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class AboutMeService {

    private final AboutMeRepository aboutMeRepository;

    public AboutMeService(AboutMeRepository aboutMeRepository) {
        this.aboutMeRepository = aboutMeRepository;
    }


     public AboutMe addAboutMe(AboutMe aboutme){
        return aboutMeRepository.save(aboutme);
    }
    public AboutMe updateAboutMe(AboutMe aboutme){
        return aboutMeRepository.save(aboutme);
    }
    public List<AboutMe> findAllAboutMe(){
        return aboutMeRepository.findAll();
    }
    public void deleteAboutMe(Long id){
        aboutMeRepository.deleteById(id);
    }
    
}
