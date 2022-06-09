
package com.backendap.backendap.servicio;

import com.backendap.backendap.modelos.Educacion;
import com.backendap.backendap.repositorio.EducacionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducacionServicio {
    
    private final EducacionRepo educacionRepo;

    @Autowired
    public EducacionServicio(EducacionRepo educacionRepo) {
        this.educacionRepo = educacionRepo;
    }
    
    public Educacion addEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }
    
    public List<Educacion> buscarEducaciones(){
        return educacionRepo.findAll();
    }
    
    public Educacion editarEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }
    
    public void borrarEducacion(Long id){
        educacionRepo.deleteById(id);
    }
}
