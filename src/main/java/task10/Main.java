package task10;

import task10.dao.TaskDAO;

public class Main {

    public static void main(String[] args) {
        System.out.println(TaskDAO.selectAllStaff());
        System.out.println(TaskDAO.selectAllTasks());
    }
}
