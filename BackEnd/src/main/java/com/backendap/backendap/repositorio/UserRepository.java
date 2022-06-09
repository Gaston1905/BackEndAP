
package com.backendap.backendap.repositorio;

import com.backendap.backendap.modelos.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    

}