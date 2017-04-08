package com.dotographytask.Task;

/**
 * Created by panit on 4/5/2017.
 */

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface TaskRepository extends MongoRepository<Task,String> {
    List<Task> findAll();
    Task findById(String id);
}
