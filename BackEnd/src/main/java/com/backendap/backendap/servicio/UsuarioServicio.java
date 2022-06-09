
package com.backendap.backendap.servicio;

import Exception.UserNotFoundException;
import com.backendap.backendap.modelos.Usuario;
import com.backendap.backendap.repositorio.UsuarioRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsuarioServicio {
    private final UsuarioRepo usuarioRepo;

@Autowired
public UsuarioServicio(UsuarioRepo usuarioRepo) {
    this.usuarioRepo = usuarioRepo;
    }
    
     public Usuario addUsuario(Usuario usuario){
        return usuarioRepo.save(usuario);
    }
    
    public List<Usuario> buscarUsuario(){
        return usuarioRepo.findAll();
    }
    
    public Usuario editarUsuario(Usuario usuario){
        return usuarioRepo.save(usuario);
    }
    
    public void borrarUsuario(Long id){
        usuarioRepo.deleteById(id);
    }
    
    public Usuario buscarUsuarioPorId(Long id){
        return usuarioRepo.findById(id).orElseThrow(() ->new UserNotFoundException("Usuario no encontrado"));
    }
}
