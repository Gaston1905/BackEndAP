package com.gaitan.SpringAuthentication.repository;

import com.gaitan.SpringAuthentication.domain.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill,Long> {
}
