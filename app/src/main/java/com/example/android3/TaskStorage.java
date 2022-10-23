package com.example.android3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

public class TaskStorage {
    private static final TaskStorage taskStorage = new TaskStorage();
    @Getter
    private final List<Task> tasks;

    private TaskStorage() {
        tasks = new ArrayList<>();
        for (int i=1; i <= 100; i++){
            Task task = new Task();
            task.setName("Task #" + i);
            task.setDone(i%3 == 0);
            tasks.add(task);
        }
    }
    public static TaskStorage getInstance(){
        return taskStorage;
    }

    public Task getTask(UUID taskId) {
        for(Task x : tasks)
        {
            if(x.getId().equals(taskId))
                return x;

        }
        return null;
    }
}
