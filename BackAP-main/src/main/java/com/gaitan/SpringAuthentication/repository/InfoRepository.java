package com.gaitan.SpringAuthentication.repository;

import com.gaitan.SpringAuthentication.domain.Info;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfoRepository extends JpaRepository<Info,Long> {
}
