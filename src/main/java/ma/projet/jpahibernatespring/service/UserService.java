package ma.projet.jpahibernatespring.service;

import ma.projet.jpahibernatespring.entities.Role;
import ma.projet.jpahibernatespring.entities.User;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName(String userName);
    Role findUserByRoleName(String roleName);
    void addRoleToUser(String username, String roleName);
    User authenticate(String userName, String password);


}
