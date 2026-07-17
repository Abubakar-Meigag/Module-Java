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


/*
1. Where did polymorphism remove conditional logic?
In TaskManagementSystem.java, task.getStatus() is called on every task without
checking its type. Each subclass (TimedTask, PriorityTask) overrides getStatus()
to add its own details, so no instanceof checks are needed.

2. Which responsibilities are shared vs specific?
Shared across all tasks (in Task): unique id, description, completion state, complete(), and getStatus().
Specific: TimedTask owns the deadline, PriorityTask owns the priority level, each extends getStatus() with their own extra info.

3. Where did encapsulation prevent misuse?
id is private final so nothing outside can change it. "completed" is private and only toggled through complete(),
which blocks marking an already-completed task again in Task.java. tasks[] and taskCount in TaskManager are private
so outside code can't corrupt the array.

4. If a new task type were added, how much existing code would change?
Almost nothing. You create a new class extending Task, override getStatus(),
and add it in main(). TaskManager, the display loops, and all existing classes stay untouched.

*/