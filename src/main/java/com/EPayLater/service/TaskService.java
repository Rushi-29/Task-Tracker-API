package com.EPayLater.service;

import com.EPayLater.model.Task;
import com.EPayLater.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.InputMismatchException;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    TaskRepository taskRepository;

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskById(Long id) {
        {
            return taskRepository.findByTaskId(id);
        }
//        throw new InputMismatchException();
    }

    public Task updateTask(Long id, Task task) {
        Task existingTask = taskRepository.findByTaskId(id);

        if(existingTask!=null) {

            existingTask.setTitle(task.getTitle());
            existingTask.setDescription(task.getDescription());
            existingTask.setDueDate(task.getDueDate());

            return taskRepository.save(existingTask);
        }
        throw new InputMismatchException();
    }

    public void deleteTask(Long id) {
        Task existingTask1 = taskRepository.findByTaskId(id);

        if(existingTask1!=null) {

            taskRepository.deleteById(id);
        }
        throw new InputMismatchException();

//        taskRepository.deleteById(id);
    }
}
