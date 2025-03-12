package com.todolist;

import java.util.*;

public class Main {
    private static Manage taskManager = new Manage();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.println("Welcome to the To-Do List Application!");
        System.out.println("Commands: add, delete, complete, show, exit");

        while (true) {
            System.out.print("Enter a command: ");
            userInput = scanner.nextLine().trim();

            switch (userInput.toLowerCase()) {
                case "add":
                    System.out.print("Enter the task description: ");
                    String description = scanner.nextLine();
                    taskManager.addTask(description);
                    break;
                case "delete":
                    System.out.print("Enter the task number to delete: ");
                    try {
                        int taskToRemove = Integer.parseInt(scanner.nextLine());
                        taskManager.deleteTask(taskToRemove);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid number.");
                    }
                    break;
                case "complete":
                    System.out.print("Enter the task number to mark as completed: ");
                    try {
                        int taskToComplete = Integer.parseInt(scanner.nextLine());
                        taskManager.markTaskAsDone(taskToComplete);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid number.");
                    }
                    break;
                case "show":
                    taskManager.displayTasks();
                    break;
                case "exit":
                    System.out.println("Thank you for using the To-Do List App. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid command. Please use add, delete, complete, show, or exit.");
            }
        }
    }
}
