package taskManagementSystem;

import modules.Task;
import modules.TaskManager;
import modules.TimedTask;
import modules.PriorityTask;


class TaskManagementSystem {
    public static void main(String[] args) {

        TaskManager manager = new TaskManager();

        manager.addTask(new Task("Buy groceries"));
        manager.addTask(new Task("Clean the house"));
        manager.addTask(new TimedTask("2026-07-18", "Start Launch Module"));
        manager.addTask(new PriorityTask(1, "Fix the bug"));
        manager.addTask(new PriorityTask(2, "Write unit tests"));

        manager.completeTask(1);
        manager.completeTask(3);

        System.out.println("-Pending-");
        for (Task task : manager.getTasksByStatus(false)) {
            System.out.println("[" + task.getId() + "] " + task.getDescription() + " | " + task.getStatus());
        }

        System.out.println("-Completed-");
        for (Task task : manager.getTasksByStatus(true)) {
            System.out.println("[" + task.getId() + "] " + task.getDescription() + " | " + task.getStatus());
        }
    }
}
