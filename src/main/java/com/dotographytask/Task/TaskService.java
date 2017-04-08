package com.dotographytask.Task;

import java.util.List;

/**
 * Created by panit on 4/5/2017.
 */
public interface TaskService {
    List<Task> findAll();
    Task findById(String id);
    Task create(Task task);
    Task update(Task task);
    void delete(String id);
}
