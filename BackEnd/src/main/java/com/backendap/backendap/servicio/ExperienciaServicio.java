
package com.backendap.backendap.servicio;

import com.backendap.backendap.modelos.Experiencia;
import com.backendap.backendap.repositorio.ExperienciaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExperienciaServicio {
    
    private final ExperienciaRepo experienciaRepo;
    
    @Autowired
    public ExperienciaServicio(ExperienciaRepo experienciaRepo){
        this.experienciaRepo = experienciaRepo;
    }
    
    public Experiencia addExperiencia(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }
    
    public List<Experiencia> buscarExperiencias(){
        return experienciaRepo.findAll();
    }
    
    public Experiencia editarExperiencia(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }
    
    public void borrarExperiencia(Long id){
        experienciaRepo.deleteById(id);
    }
    
}
