package dio.me.secondchallenge.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import dio.me.secondchallenge.domain.model.Task;
import dio.me.secondchallenge.domain.repository.TaskRepository;
import dio.me.secondchallenge.service.TaskService;


@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;


    public TaskServiceImpl(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    @Override
    public Task findById(Integer id) {
        return taskRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Task create(Task taskToCreate) {
        if (taskToCreate.getIdTask() != null && taskRepository.existsById(taskToCreate.getIdTask()) ){
            throw new IllegalArgumentException("Task already exists", null);
        }

        return taskToCreate;
    }
    

}
