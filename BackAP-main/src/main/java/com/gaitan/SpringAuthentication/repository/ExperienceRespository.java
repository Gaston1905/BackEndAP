package com.gaitan.SpringAuthentication.repository;


import com.gaitan.SpringAuthentication.domain.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceRespository extends JpaRepository<Experience,Long> {
}
