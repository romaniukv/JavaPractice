package pract3.task1.model.entities;

import java.util.ArrayList;
import java.util.Collections;

public class Store {

    private String name;
    private ArrayList<Department> departments = new ArrayList<>();

    private Department findDepartmentByName(String departmentName) {
        for (Department department: departments)
            if (department.getDepartmentName().compareTo(departmentName) == 0)
                return department;
        return null;
    }

    public void showStore() {
        System.out.println("Store: " + name + " {");
        for (Department department: departments)
            System.out.println(department);
        System.out.println("}");
    }

    public void createDepartment(String departmentName, String description, String typeOfGoods,
                                 ArrayList<String> services, String address) {
        departments.add(new Department(departmentName, description, typeOfGoods, services, address));
    }

    public void removeDepartment(String departmentName) {
        Department department = findDepartmentByName(departmentName);
        if (department != null)
            departments.remove(department);
    }

    public void addGoods(ArrayList<String> goods, String departmentName) {
        Department department = findDepartmentByName(departmentName);
        if (department != null)
            department.addGoods(goods);
    }

    public void sortDepartments() {
        Collections.sort(departments, (Department d1, Department d2) -> Integer.compare(d1.goods.size(), d2.goods.size()));
    }


    private class Department {
        private String departmentName;
        private String description;
        private String typeOfGoods;
        private String address;
        private ArrayList<String> services;
        private ArrayList<String> goods = new ArrayList<>();

        public Department(String departmentName, String description, String typeOfGoods, ArrayList<String> services, String address) {
            this.departmentName = departmentName;
            this.description = description;
            this.typeOfGoods = typeOfGoods;
            this.services = services;
            this.address = address;
        }


        public void addGoods(ArrayList<String> goods) {
            this.goods.addAll(goods);
        }

        public ArrayList<String> getGoods() {
            return goods;
        }

        public String getDepartmentName() {
            return departmentName;
        }

        @Override
        public String toString() {
            return "Department{" +
                    "departmentName='" + departmentName + '\'' +
                    ", description='" + description + '\'' +
                    ", typeOfGoods='" + typeOfGoods + '\'' +
                    ", address='" + address + '\'' +
                    ", services=" + services +
                    ", goods=" + goods +
                    '}';
        }
    }

}
