package com.kodilla.patterns.prototype;

import java.util.List;
import java.util.ArrayList;

public final class TaskList {
    final private String name;
    List<Task> tasks = new ArrayList<>();

    public TaskList(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        String s = "    List [" + name + "]";
        for (Task task : tasks) {
            s = s + "\n" + task.toString();
        }
        return s;
    }
}
