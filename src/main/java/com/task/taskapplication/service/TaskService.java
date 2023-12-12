package com.task.taskapplication.service;

import com.task.taskapplication.model.Task;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    public String ReqTask(int id, String desc, TaskRepository repo) {
        Task tas = new Task();
        tas.setId(id); // set id
        tas.setDesc(desc); // set desc
        tas.setCompleted(false); // false by default
        repo.arr.add(tas); // add task to the repository

        return tas.to_String();
    }
}
