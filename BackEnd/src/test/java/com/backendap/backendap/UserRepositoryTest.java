
package com.backendap.backendap;




import com.backendap.backendap.modelos.User;
import com.backendap.backendap.repositorio.UserRepository;
import static java.sql.DriverManager.println;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Rollback;





@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTest {
    @Autowired
    UserRepository repo;
    
   
   @Test
	public void testCreateUser() {
            PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
            String rawPassword = "argentina2022";
            String encodePassword=passwordEncoder.encode(rawPassword);
            User user= new User("gastongaitan@gmail.com", encodePassword);
            println("se ha construido");
            User savedUser=repo.save(user);
            assertThat(savedUser).isNotNull();
            assertThat(savedUser.getId()).isGreaterThan(0);
                

		
	}
    
}
