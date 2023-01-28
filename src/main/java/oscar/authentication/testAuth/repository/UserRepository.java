package oscar.authentication.testAuth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import oscar.authentication.testAuth.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    User findByUsername(String Username);
}
