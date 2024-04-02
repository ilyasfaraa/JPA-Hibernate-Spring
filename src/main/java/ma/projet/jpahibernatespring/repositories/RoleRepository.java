package ma.projet.jpahibernatespring.repositories;

import ma.projet.jpahibernatespring.entities.Role;
import ma.projet.jpahibernatespring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByRoleName(String roleName);
}
