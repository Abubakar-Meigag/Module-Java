package modules;

public class TimedTask extends Task {

    private String deadline;

    public TimedTask(String deadline, String description) {
        super(description);
        this.deadline = deadline;
    }

    public String getDeadline() {
        return deadline;
    }

    @Override
    public String getStatus() {
        return super.getStatus() + ", Deadline: " + deadline;
    }
}