package com.gaitan.SpringAuthentication.repository;

import com.gaitan.SpringAuthentication.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Long> {
}
