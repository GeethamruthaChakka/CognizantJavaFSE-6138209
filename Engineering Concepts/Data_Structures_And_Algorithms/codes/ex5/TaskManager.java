
class TaskManager {
    Task head = null;

    // Add Task
    public void addTask(int id, String name, String status) {
        Task newTask = new Task(id, name, status);
        if (head == null) {
            head = newTask;
        } else {
            Task temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newTask;
        }
    }

    // Search Task
    public Task searchTask(int id) {
        Task temp = head;
        while (temp != null) {
            if (temp.taskId == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    // Traverse Tasks
    public void displayTasks() {
        Task temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.taskId + ", Name: " + temp.taskName + ", Status: " + temp.status);
            temp = temp.next;
        }
    }

    // Delete Task
    public void deleteTask(int id) {
        if (head == null) return;
        if (head.taskId == id) {
            head = head.next;
            return;
        }
        Task current = head;
        Task prev = null;
        while (current != null && current.taskId != id) {
            prev = current;
            current = current.next;
        }
        if (current != null) {
            prev.next = current.next;
        }
    }
}