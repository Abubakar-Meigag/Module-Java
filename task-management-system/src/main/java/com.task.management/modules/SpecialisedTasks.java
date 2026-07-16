

class TimedTask extends Task {

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

class PriorityTask extends Task {

    private int priority;

    public PriorityTask(int priority, String description) {
        super(description);
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String getStatus() {
        String level = priority == 1 ? "High" : priority == 2 ? "Medium" : "Low";
        return super.getStatus() + ", Priority: " + level;
    }

}