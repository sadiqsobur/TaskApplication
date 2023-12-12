package com.task.taskapplication.controller;

import com.task.taskapplication.model.Task;
import com.task.taskapplication.service.TaskRepository;
import com.task.taskapplication.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private TaskService taskServ;

    public TaskController(TaskService taskServ)
    {
        this.taskServ = taskServ;
    }

    private final TaskRepository repo = new TaskRepository();

    public String reqTask(@RequestParam int id, @RequestParam String desc) {
        return taskServ.ReqTask(id, desc, repo);
    }

    @PostMapping("/submit")
    public void postTask(@RequestBody Task t) { // request JSON for task body
        repo.getArr().add(t);
        System.out.println("Task added successfully.");
    }
}
