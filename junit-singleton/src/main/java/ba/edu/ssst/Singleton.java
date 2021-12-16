package ba.edu.ssst;

import java.util.ArrayList;

public class Singleton {
    private static Singleton instance = null;
    private ArrayList<Department> departments;

    private Singleton() {
        departments = new ArrayList<>();
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public ArrayList<Department> getDepartments() {
        return this.departments;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }
}
