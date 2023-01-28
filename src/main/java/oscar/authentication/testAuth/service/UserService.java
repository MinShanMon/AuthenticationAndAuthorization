package oscar.authentication.testAuth.service;

import java.util.List;

import org.springframework.stereotype.Service;

import oscar.authentication.testAuth.model.Role;
import oscar.authentication.testAuth.model.User;


public interface UserService {
    User saveUser(User user);

        Role saveRole(Role role);
        void addRoleToUser(String username, String roleName);

        User getUser(String username);

        List<User> getUsers();
}
