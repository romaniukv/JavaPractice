package pract10.dao;

import pract10.entities.Task;
import pract10.utils.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TaskDAO {

    private static final String SELECT_ALL_TASKS = "SELECT * FROM tasks;";
    private static final String CREATE_TASK = "INSERT INTO tasks (description, staff_id) VALUES(?, ?);";
    private static final String SELECT_TASKS_BY_STAFF = "SELECT * FROM tasks WHERE staff_id = ?;";
    private static final String DELETE_TASKS_BY_STAFF = "DELETE FROM tasks WHERE staff_id = ?;";

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

    public static void addTask(Task task) {
        ResultSet rs = null;
        try(Connection connection = DBConnection.getConnection()) {
            PreparedStatement ps = connection.prepareStatement(CREATE_TASK, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, task.getDescription());
            ps.setInt(2, task.getStaffId());
            ps.execute();
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                task.setId(rs.getInt(1));
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
    }

    public static List<Task> selectTasksByEmployee(int employeeId) {
        List<Task> tasks = new ArrayList<>();
        ResultSet rs = null;
        try(Connection connection = DBConnection.getConnection()) {
            PreparedStatement ps = connection.prepareStatement(SELECT_TASKS_BY_STAFF);
            ps.setInt(1, employeeId);
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

    public static int deleteTasksByEmployee(int employeeId) {
        try(Connection connection = DBConnection.getConnection()) {
            PreparedStatement ps = connection.prepareStatement(DELETE_TASKS_BY_STAFF);
            ps.setInt(1, employeeId);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
