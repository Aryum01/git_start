package java_Advanced.esempi.checkpoint.prova1;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Task {
    private String description;
    private OffsetDateTime expiration;
    private boolean completed;
    private int id;

    public Task(String description, OffsetDateTime expiration, boolean completed) {
        this.description = description;
        this.expiration = expiration;
        this.completed = completed;
        this.id = new Random().nextInt();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OffsetDateTime getExpiration() {
        return expiration;
    }

    public void setExpiration(OffsetDateTime expiration) {
        this.expiration = expiration;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Task [description=" + description + ", expiration="
                + expiration.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")) + ", completed=" + completed
                + ", id="
                + id + "]";
    }

}
