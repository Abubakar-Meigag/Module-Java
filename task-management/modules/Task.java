package modules;

public class Task {

    private static int indexId = 1;
    private final int id;
    private String description;
    private boolean completed;

    public Task(String description) {
        this.id = indexId++;
        this.description = description;
        this.completed = false;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void complete() {
        if(completed){
            System.out.println("Task has been completed");
            return;
        }
        completed = true;
    }

    public String getStatus(){
        return completed ? "Completed" : "Pending";
    }
}