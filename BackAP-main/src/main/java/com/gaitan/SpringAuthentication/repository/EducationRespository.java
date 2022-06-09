package com.gaitan.SpringAuthentication.repository;

import com.gaitan.SpringAuthentication.domain.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRespository extends JpaRepository<Education,Long> {
}
