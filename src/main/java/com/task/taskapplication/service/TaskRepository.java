package com.task.taskapplication.service;

import com.task.taskapplication.model.Task;
import lombok.Getter;
import lombok.Setter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@Setter
@Getter
public class TaskRepository {
    public ArrayList<Task> arr = new ArrayList<>(); // store the tasks
    public void writeTask() throws IOException {
        FileWriter fileWriter = new FileWriter("Tasks.json");
        PrintWriter printWriter = new PrintWriter(fileWriter);

        for (Task t : arr) {
            fileWriter.write(t.to_String()); // write Task to JSON file in json format
        }
    }
}
