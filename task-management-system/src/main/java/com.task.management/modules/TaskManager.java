

class TaskManager{

    private static final int MAX_TASKS = 10;

    private Task[] tasks;
    private int taskCount;

    public TaskManager() {
        this.tasks = new Task[MAX_TASKS];
        this.taskCount = 0;
    }

    public void addTask(Task task){
        tasks[taskCount] = task;
        taskCount++;
    }

    public void completeTask(int id) {
        for (int i = 0; i < taskCount; i++) {
            if (tasks[i].getId() == id) {
                tasks[i].complete();
                return;
            }
        }
        System.out.println("Task not found");
    }

    public Task[] getTasksByStatus(boolean completed){
        int count = 0;
        for (int i = 0; i < taskCount; i++) {
            if (tasks[i].isCompleted() == completed) count++;
        }
        Task[] result = new Task[count];
        int index = 0;
        for (int i = 0; i < taskCount; i++) {
            if (tasks[i].isCompleted() == completed){
                result[index++] = tasks[i];
            }
        }
        return result;
    }
}