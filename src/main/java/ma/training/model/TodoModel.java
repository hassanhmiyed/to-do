package ma.training.model;

import java.util.Date;

public class TodoModel {
    private long id;
    private String description;
    private Date creationDate;
    private boolean isDone;

    public TodoModel(String description, Date creationDate, boolean isDone) {
        this.description = description;
        this.creationDate = creationDate;
        this.isDone = isDone;
    }

    public TodoModel(long id, String description, Date creationDate, boolean isDone) {
        this.id = id;
        this.description = description;
        this.creationDate = creationDate;
        this.isDone = isDone;
    }

    public TodoModel(long id, String description, boolean isDone) {
        this.id = id;
        this.description = description;
        this.isDone = isDone;
    }

    public TodoModel(long id, String description) {
        this.id = id;
        this.description = description;
    }

    public TodoModel(String description) {
        this.description = description;
    }

    public TodoModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
