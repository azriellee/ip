package task;

public class Event extends Task {
    private String from;
    private String to;
    public Event(String task, String from, String to) {
        super(task);
        this.from = from;
        this.to = to;
    }

    public String formatDate(String from, String to) {
        return "(" + "from: " + from + "to:" + to + ")";
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + formatDate(this.from, this.to);
    }
}
