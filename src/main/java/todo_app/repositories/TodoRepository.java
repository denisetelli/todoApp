package todo_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import todo_app.models.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
