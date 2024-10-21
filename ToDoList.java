import java.util.ArrayList;
import java.util.Scanner;

class ToDoList {
    private ArrayList<String> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Added: " + task);
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            String removedTask = tasks.remove(index);
            System.out.println("Removed: " + removedTask);
        } else {
            System.out.println("Invalid index");
        }
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in your to-do list.");
        } else {
            System.out.println("Your tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.println("\nCommands: add, remove, view, exit");
            command = scanner.nextLine();

            switch (command) {
                case "add":
                    System.out.println("Enter task to add:");
                    String task = scanner.nextLine();
                    toDoList.addTask(task);
                    break;
                case "remove":
                    System.out.println("Enter task number to remove:");
                    int index = scanner.nextInt() - 1;
                    scanner.nextLine(); // consume newline
                    toDoList.removeTask(index);
                    break;
                case "view":
                    toDoList.viewTasks();
                    break;
                case "exit":
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid command.");
            }
        } while (!command.equals("exit"));

        scanner.close();
    }
}
