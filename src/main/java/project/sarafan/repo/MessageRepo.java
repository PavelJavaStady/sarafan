package project.sarafan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import project.sarafan.domain.Message;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
