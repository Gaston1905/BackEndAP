
package com.backendap.backendap.repositorio;

import com.backendap.backendap.modelos.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepo extends JpaRepository<Educacion, Long>{
    
}
