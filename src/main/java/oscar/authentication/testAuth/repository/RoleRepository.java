package oscar.authentication.testAuth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import oscar.authentication.testAuth.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
    Role findByName(String name);
}
