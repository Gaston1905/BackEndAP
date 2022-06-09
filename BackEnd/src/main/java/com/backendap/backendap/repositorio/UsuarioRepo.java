
package com.backendap.backendap.repositorio;

import com.backendap.backendap.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepo extends JpaRepository<Usuario, Long>{
    
}
