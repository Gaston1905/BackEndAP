
package com.backendap.backendap.controladora;



import com.backendap.backendap.modelos.Usuario;
import com.backendap.backendap.servicio.UsuarioServicio;
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
@RequestMapping("api/usuario")
@CrossOrigin(origins = "http://localhost:4200")
public class ControladoraUsuario {
    
    private final UsuarioServicio usuarioServicio;

    public ControladoraUsuario(UsuarioServicio usuarioServicio) {
        this.usuarioServicio = usuarioServicio;
    }
    
    @GetMapping("id/{id}")
    public ResponseEntity<Usuario> obtenerUsuario(@PathVariable("id") Long id){
        Usuario usuario=usuarioServicio.buscarUsuarioPorId(id);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }
    
    @PutMapping("update")
    public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario){
        Usuario updateUsuario=usuarioServicio.editarUsuario(usuario);
        return new ResponseEntity<>(updateUsuario, HttpStatus.OK);
    }
    
    @PostMapping("add")
    public ResponseEntity<Usuario> crearExperiencia(@RequestBody Usuario usuario){
       Usuario nuevaExperiencia=usuarioServicio.addUsuario(usuario);
       return new ResponseEntity<>(nuevaExperiencia, HttpStatus.CREATED);
    }
    
    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> BorrarUsuario(@PathVariable("id") Long id){
        usuarioServicio.borrarUsuario(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
