package com.dotographytask.Task;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by panit on 4/5/2017.
 */
@RestController
public class TaskController {
    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/api/tasks")
    public List<Task> getAll() {
        return taskService.findAll();
    }

    @GetMapping("/api/task/{id}")
    public Task get(@PathVariable("id") String id) {
        return taskService.findById(id);
    }

    @PostMapping("/api/task")
    public Task create(@Valid @RequestBody Task task){
        return taskService.create(task);
    }

    @PutMapping("/api/task/{id}")
    public Task updateStatus(@Valid @RequestBody Task task){
        return taskService.update(task);
    }

    @DeleteMapping("/api/task/{id}")
    public void delete(@PathVariable("id") String id){taskService.delete(id);}

}
