package com.todo;

import java.util.Scanner;

public class ToDoApp {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("\nTo-Do List:");
            taskManager.displayTasks();
            System.out.println("\nCommands: [add] [complete] [remove] [exit]");
            System.out.print("Enter command: ");
            command = scanner.nextLine();

            if (command.equals("add")) {
                System.out.print("Enter task description: ");
                String description = scanner.nextLine();
                taskManager.addTask(description);
            } else if (command.equals("complete")) {
                System.out.print("Enter task number to complete: ");
                int index = Integer.parseInt(scanner.nextLine()) - 1;
                taskManager.completeTask(index);
            } else if (command.equals("remove")) {
                System.out.print("Enter task number to remove: ");
                int index = Integer.parseInt(scanner.nextLine()) - 1;
                taskManager.removeTask(index);
            } else if (command.equals("exit")) {
                break;
            } else {
                System.out.println("Invalid command.");
            }
        }
        scanner.close();
    }
}
