package com.dotographytask.Task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by panit on 4/5/2017.
 */
@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public Task findById(String id) {
        return taskRepository.findById(id);
    }

    @Override
    public Task create(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task update(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public void delete(String id) {
         taskRepository.delete(id);
    }
}
