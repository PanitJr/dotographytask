package com.dotographytask.Task;



import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by panit on 4/5/2017.
 */

@Data
@Entity
@Document
public class Task {
    @Id
    public String id;

    @NotNull
    public String task;

    public String detail;

    public String status;

    public Task(String task,String status) {
        this.task = task;
        this.status = status;
    }
    @Override
    public String toString() {
        return this.task + " " +this.status;
    }
}
