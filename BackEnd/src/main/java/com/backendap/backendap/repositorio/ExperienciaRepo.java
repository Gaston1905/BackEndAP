
package com.backendap.backendap.repositorio;

import com.backendap.backendap.modelos.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepo extends JpaRepository<Experiencia, Long>{
    
}
