package pract10.entities;

public class Task {

    private int id;
    private String description;
    private int staffId;

    public Task(String description, int staffId) {
        this.description = description;
        this.staffId = staffId;
    }

    public Task(int id, String description, int staffId) {
        this.id = id;
        this.description = description;
        this.staffId = staffId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", staffId=" + staffId +
                '}';
    }
}
