package pract10;

import pract10.dao.EmployeeDAO;
import pract10.dao.TaskDAO;
import pract10.entities.Task;

public class Main {

    public static void main(String[] args) {
        System.out.println(EmployeeDAO.selectAllEmployees());
        System.out.println(TaskDAO.selectAllTasks());
        System.out.println(EmployeeDAO.selectEmployeesByDepartment(2));
        TaskDAO.addTask(new Task("some task", 1));
        System.out.println(TaskDAO.selectTasksByEmployee(1));
        EmployeeDAO.deleteEmployee(1);
    }
}
