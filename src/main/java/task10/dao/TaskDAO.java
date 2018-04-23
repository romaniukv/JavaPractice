package task10.dao;

import task10.model.Staff;
import task10.model.Task;
import task10.utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TaskDAO {

    private static final String SELECT_ALL_STAFF = "SELECT * FROM staff;";
    private static final String SELECT_ALL_TASKS = "SELECT * FROM tasks;";

    public static List<Staff> selectAllStaff() {
        List<Staff> staffList = new ArrayList<>();
        ResultSet rs = null;
        try(Connection connection = DBConnection.getConnection()) {
            PreparedStatement ps = connection.prepareStatement(SELECT_ALL_STAFF);
            rs = ps.executeQuery();
            while (rs.next()) {
                staffList.add(new Staff(rs.getInt("id"), rs.getString("last_name"), rs.getString("first_name"),
                        rs.getString("position"), rs.getInt("department_id")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return staffList;
    }

    public static List<Task> selectAllTasks() {
        List<Task> tasks = new ArrayList<>();
        ResultSet rs = null;
        try(Connection connection = DBConnection.getConnection()) {
            PreparedStatement ps = connection.prepareStatement(SELECT_ALL_TASKS);
            rs = ps.executeQuery();
            while (rs.next()) {
                tasks.add(new Task(rs.getInt("id"), rs.getString("description"),
                        rs.getInt("staff_id")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return tasks;
    }

}
