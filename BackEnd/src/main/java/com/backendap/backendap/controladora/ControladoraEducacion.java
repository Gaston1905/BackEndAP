
package com.backendap.backendap.controladora;

import com.backendap.backendap.modelos.Educacion;
import com.backendap.backendap.servicio.EducacionServicio;
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
@RequestMapping("api/educacion")
@CrossOrigin(origins = "http://localhost:4200")
public class ControladoraEducacion {
    
    private final EducacionServicio educacionServicio;

    public ControladoraEducacion(EducacionServicio educacionServicio) {
        this.educacionServicio = educacionServicio;
    }
    
    @PutMapping("update")
    public ResponseEntity<Educacion> editarEducacion(@RequestBody Educacion educacion){
        Educacion updateEducacion=educacionServicio.editarEducacion(educacion);
        return new ResponseEntity<>(updateEducacion, HttpStatus.OK);
    }
    
      @GetMapping("all")
    public ResponseEntity<List<Educacion>> obtenerEducacion(){
        List<Educacion> educaciones=educacionServicio.buscarEducaciones();
        return new ResponseEntity<>(educaciones, HttpStatus.OK);
    }
    
    @PostMapping("add")
    public ResponseEntity<Educacion> crearEducacion(@RequestBody Educacion educacion){
        Educacion nuevaEducacion=educacionServicio.addEducacion(educacion);
        return new ResponseEntity<>(nuevaEducacion,HttpStatus.CREATED);
    }
    
    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> borrarEducacion(@PathVariable("id") Long id){
        educacionServicio.borrarEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
