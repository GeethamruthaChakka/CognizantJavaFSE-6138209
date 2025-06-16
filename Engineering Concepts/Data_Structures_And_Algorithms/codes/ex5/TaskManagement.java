
public class TaskManagement {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.addTask(1, "Design UI", "Pending");
        manager.addTask(2, "Build Backend", "In Progress");
        manager.addTask(3, "Write Tests", "Pending");

        System.out.println("All Tasks:");
        manager.displayTasks();

        System.out.println("\nSearching for Task with ID 2:");
        Task found = manager.searchTask(2);
        if (found != null) {
            System.out.println("Found: " + found.taskName + ", Status: " + found.status);
        } else {
            System.out.println("Task not found.");
        }

        System.out.println("\nDeleting Task with ID 1...");
        manager.deleteTask(1);

        System.out.println("\nUpdated Task List:");
        manager.displayTasks();
    }
}
