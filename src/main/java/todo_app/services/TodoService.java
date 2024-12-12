package todo_app.services;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import todo_app.models.Todo;
import todo_app.repositories.TodoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAll(){
        return todoRepository.findAll();
    }

    public Todo save(Todo todo) {
       Todo response = todoRepository.save(todo);
        return response;
    }

    public Object findAll(Sort deadline) {
        return todoRepository.findAll();
    }

    public Optional<Todo> findById(Long id) {
        return todoRepository.findById(id);
    }

    public void delete(Todo todo) {
        todoRepository.delete(todo);
    }
}
