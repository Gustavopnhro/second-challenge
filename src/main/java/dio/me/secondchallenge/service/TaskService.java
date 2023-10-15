package dio.me.secondchallenge.service;

import org.springframework.stereotype.Service;

import dio.me.secondchallenge.domain.model.Task;

@Service
public interface TaskService {
    
    Task findById(Integer id);

    Task create(Task taskToCreate);
}
