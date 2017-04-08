package com.dotographytask.TaskTest;

import com.dotographytask.Task.Task;
import com.dotographytask.Task.TaskRepository;
import com.dotographytask.Task.TaskServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by panit on 4/7/2017.
 */
@RunWith(SpringRunner.class)
public class TaskServiceImplTest {
    @MockBean
    private TaskRepository taskRepository;
    @Test
    public void findAll () throws Exception{
        given(taskRepository.findAll()).willReturn(Collections.emptyList());
        TaskServiceImpl userService = new TaskServiceImpl(taskRepository);
        List<Task> userList = userService.findAll();
        assertThat(userList).hasSize(0);
        verify(taskRepository, times(1)).findAll();
    }
    @Test
    public void findById() throws Exception {
        TaskServiceImpl taskService = new TaskServiceImpl(taskRepository);
        taskService.findById("abc");
        verify(taskRepository, times(1)).findById("abc");
    }

    @Test
    public void create() throws Exception {
        Task task = new Task("TestTask","pending");
        TaskServiceImpl taskService = new TaskServiceImpl(taskRepository);
        taskService.create(task);
        verify(taskRepository, times(1)).save(task);
    }

    @Test
    public void update() throws Exception {
        Task task = new Task("TestTask","pending");
        TaskServiceImpl taskService = new TaskServiceImpl(taskRepository);
        taskService.update(task);
        verify(taskRepository, times(1)).save(task);
    }

    @Test
    public void delete() throws Exception {
        TaskServiceImpl taskService = new TaskServiceImpl(taskRepository);
        taskService.delete("abc");
        verify(taskRepository, times(1)).delete("abc");
    }

}
