package com.task.taskapplication.model;

import lombok.Getter;
import lombok.Setter;

public class Task {

    @Getter
    @Setter
    private int id; // task id

    @Getter
    @Setter
    private String desc; // task description

    @Getter
    @Setter
    private boolean completed; // completion status, true if complete, false if incomplete

    public String to_String() {
        return "{ \"id\":\"" + id + "\", \"desc\":\"" + desc + "\", \"completed\":\"" + completed + "\" }";
    }
}
