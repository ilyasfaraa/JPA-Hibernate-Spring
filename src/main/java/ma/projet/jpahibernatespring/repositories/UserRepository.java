package ma.projet.jpahibernatespring.repositories;

import ma.projet.jpahibernatespring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    User findByUsername(String userName);
}
