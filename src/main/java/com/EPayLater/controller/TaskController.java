package com.EPayLater.controller;

import com.EPayLater.model.Task;
import com.EPayLater.service.TaskService;
import jakarta.persistence.EntityNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("tasks")
public class TaskController {

    @Autowired
    TaskService taskService;
    private static final Logger logger = LoggerFactory.getLogger(TaskController.class);

    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks() {
        List<Task> tasks = taskService.getAllTasks();
        logger.info("Retrieved {} tasks.", tasks.size());
        return ResponseEntity.ok(tasks);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
        Task task = taskService.getTaskById(id);
        if(task!=null) {
            logger.info("Retrieved task with ID: {}", id);
            return ResponseEntity.status(HttpStatus.OK).body(task);
        }

        throw new EntityNotFoundException();
    }

    @PostMapping
    public ResponseEntity<String> createTask(@RequestBody Task task) {
        Task createdTask = taskService.createTask(task);
        logger.info("Created task with ID: {}", createdTask.getTaskId());
        return ResponseEntity.status(HttpStatus.CREATED).body("task created successfully");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateTask(@PathVariable Long id, @RequestBody Task task) {
        Task updatedTask = taskService.updateTask(id, task);
        logger.info("Updated task with ID: {}", id);
        return ResponseEntity.status(HttpStatus.OK).body("Task Updated Successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        logger.info("Deleted task with ID: {}", id);
        return ResponseEntity.noContent().build();
    }
}
