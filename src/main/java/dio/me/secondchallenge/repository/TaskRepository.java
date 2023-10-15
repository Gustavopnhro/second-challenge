package dio.me.secondchallenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dio.me.secondchallenge.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
    
}
