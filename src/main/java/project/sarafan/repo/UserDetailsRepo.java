package project.sarafan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import project.sarafan.domain.User;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}
