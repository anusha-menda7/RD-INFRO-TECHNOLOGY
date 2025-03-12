package com.todolist;

import java.util.ArrayList;
import java.util.List;

public class Manage {
    private List<Task> taskList;

    public Manage() {
        taskList = new ArrayList<>();
    }

    public void addTask(String description) {
        taskList.add(new Task(description));
        System.out.println("Task added: " + description);
    }

    public void deleteTask(int taskNumber) {
        if (taskNumber > 0 && taskNumber <= taskList.size()) {
            System.out.println("Task removed: " + taskList.get(taskNumber - 1).getDescription());
            taskList.remove(taskNumber - 1);
        } else {
            System.out.println("Invalid task number. Please try again.");
        }
    }

    public void markTaskAsDone(int taskNumber) {
        if (taskNumber > 0 && taskNumber <= taskList.size()) {
            taskList.get(taskNumber - 1).completeTask();
            System.out.println("Task marked as completed: " + taskList.get(taskNumber - 1).getDescription());
        } else {
            System.out.println("Invalid task number. Please try again.");
        }
    }

    public void displayTasks() {
        if (taskList.isEmpty()) {
            System.out.println("Your To-Do List is empty.");
        } else {
            System.out.println("Here is your To-Do List:");
            for (int i = 0; i < taskList.size(); i++) {
                System.out.println((i + 1) + ". " + taskList.get(i).toString());
            }
        }
    }
}