
package com.backendap.backendap.servicio;

import com.backendap.backendap.modelos.Skills;
import com.backendap.backendap.repositorio.SkillsRepo;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SkillsServicio {

    private final SkillsRepo skillRepository;

    public SkillsServicio(SkillsRepo skillRepository) {
        this.skillRepository = skillRepository;
    }

    public Skills addSkill(Skills skill){
        return skillRepository.save(skill);
    }
    public Skills updateSkill(Skills skill){
        return skillRepository.save(skill);
    }
    public List<Skills> findAllSkills(){
        return skillRepository.findAll();
    }
    public void deleteSkill(Long id){
        skillRepository.deleteById(id);
    }

}
