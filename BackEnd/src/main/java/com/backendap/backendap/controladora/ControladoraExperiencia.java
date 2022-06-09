
package com.backendap.backendap.controladora;

import com.backendap.backendap.modelos.Experiencia;
import com.backendap.backendap.servicio.ExperienciaServicio;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/experiencia")
@CrossOrigin(origins = "http://localhost:4200")
public class ControladoraExperiencia {
    
    private final ExperienciaServicio experienciaServicio;
    
    public ControladoraExperiencia(ExperienciaServicio experienciaServicio) {
        this.experienciaServicio = experienciaServicio;
    }
    
    @PutMapping("update")
    public ResponseEntity<Experiencia> editarExperiencia(@RequestBody Experiencia experiencia) {
      Experiencia updateExperiencia=experienciaServicio.editarExperiencia(experiencia);
      return new ResponseEntity<>(updateExperiencia, HttpStatus.OK);  
    }
    
    @GetMapping("all")
    public ResponseEntity<List<Experiencia>> obtenerExperiencia() {
        List<Experiencia> experiencias=experienciaServicio.buscarExperiencias();
        return new ResponseEntity<>(experiencias, HttpStatus.OK);
    }
    
    @PostMapping("add")
    public ResponseEntity<Experiencia> crearExperiencia(@RequestBody Experiencia experiencia){
       Experiencia nuevaExperiencia=experienciaServicio.addExperiencia(experiencia);
       return new ResponseEntity<>(nuevaExperiencia, HttpStatus.CREATED);
    }
    
    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> borrarExperiencia(@PathVariable("id") Long id){
        experienciaServicio.borrarExperiencia(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
