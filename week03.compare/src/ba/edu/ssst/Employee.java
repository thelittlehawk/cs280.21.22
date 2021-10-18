package ba.edu.ssst;

public class Employee implements Comparable<Employee> {
    private String fullName;
    private Integer salary;

    public Employee(String fullName, int salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                '}';
    }

    private String getFullName() {
        return this.fullName;
    }

    private int getSalary() {
        return this.salary;
    }

//    @Override
//    public int compareTo(Object o) {
//        return this.fullName.compareTo(
//                (
//                  (Employee) o
//                ).getFullName()
//        );
//    }

//    @Override
//    public int compareTo(Employee e) {
//        return this.fullName.compareTo(e.getFullName());
//    }

//    @Override
//    public int compareTo(Employee e) {
//        return this.salary.compareTo(e.getSalary());
//    }

    @Override
    public int compareTo(Employee e) {
        if (this.salary < e.getSalary()) {
            return -1;
        } else {
            if (this.salary == e.getSalary()) {
                return 0;
            } else {
                return 1;
            }
        }
    }
}
