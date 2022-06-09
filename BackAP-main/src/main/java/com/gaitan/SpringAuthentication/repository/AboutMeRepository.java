
package com.gaitan.SpringAuthentication.repository;

import com.gaitan.SpringAuthentication.domain.AboutMe;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AboutMeRepository extends JpaRepository<AboutMe, Long> {
    
}
