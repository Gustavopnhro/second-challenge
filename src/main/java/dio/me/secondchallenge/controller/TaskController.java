package dio.me.secondchallenge.controller;


import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import dio.me.secondchallenge.domain.model.Task;
import dio.me.secondchallenge.service.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> findById(@PathVariable Integer id){
        var task = taskService.findById(id);

        return ResponseEntity.ok(task);
    }

    @PostMapping
    public ResponseEntity<Task> create(@RequestBody Task task){
        var taskCreated = taskService.create(task);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").build(taskCreated.getIdTask());
        return ResponseEntity.created(location).body(taskCreated);
    }

}
