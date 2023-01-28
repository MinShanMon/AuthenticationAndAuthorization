package oscar.authentication.testAuth;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import oscar.authentication.testAuth.model.Role;
import oscar.authentication.testAuth.model.User;
import oscar.authentication.testAuth.service.UserService;

@SpringBootApplication
public class TestAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestAuthApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
	@Bean
	CommandLineRunner run(UserService userService){
		return args -> {
			// userService.saveRole(new Role(null, "ROLE_USER"));
			// userService.saveRole(new Role(null, "ROLE_MANAGER"));
			// userService.saveRole(new Role(null, "ROLE_ADMIN"));
			// userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

			// userService.saveUser(new User(null, "John Travolta", "john", "1234", new ArrayList<>()));
			// userService.saveUser(new User(null, "Will Smith", "will", "1234", new ArrayList<>()));
			// userService.saveUser(new User(null, "Jin Carry", "jim", "1234", new ArrayList<>()));
			// userService.saveUser(new User(null, "Arnold Schwarzenegger", "arnold", "1234", new ArrayList<>()));

			// userService.addRoleToUser("john", "ROLE_USER");
			// userService.addRoleToUser("john", "ROLE_MANAGER");
			// userService.addRoleToUser("will", "ROLE_MANAGER");
			// userService.addRoleToUser("jim", "ROLE_ADMIN");
			// userService.addRoleToUser("ARNOLD", "ROLE_SUPER_ADMIN");
			// userService.addRoleToUser("arnold", "ROLE_ADMIN");
			// userService.addRoleToUser("arnold", "ROLE_USER");			
		};
	}

}
