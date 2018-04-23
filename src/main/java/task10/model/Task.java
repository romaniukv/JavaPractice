package task10.model;

public class Task {

    private int id;
    private String description;
    private int staff_id;

    public Task(int id, String description, int staff_id) {
        this.id = id;
        this.description = description;
        this.staff_id = staff_id;
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

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", staff_id=" + staff_id +
                '}';
    }
}
