package ba.edu.ssst;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            File file = new File("ed.csv");
            Scanner s = new Scanner(file);
            Map<String, ArrayList<Employee>> deps = new HashMap<>();

            while (s.hasNextLine()) {
                String line = s.nextLine();

                String[] parts = line.split(",");
                try{
                    Integer salaryFromParts = Integer.parseInt(parts[4]);
                    String departmentFromParts = parts[3];
                    Employee newEmployee = new Employee(
                            parts[1],
                            parts[2],
                            salaryFromParts);

                    // da li ima u mapi, departmentFromParts
                    // ako nema, dodaj i napravi ArrayList sa Employee
                    // ako ima, dodaj Employee

                    if (!deps.containsKey(departmentFromParts)) {
                        deps.put(departmentFromParts, new ArrayList<>());
                    }
                    deps.get(departmentFromParts).add(newEmployee);

                } catch (Exception e) {
                    System.out.println("Poblem sa: " + line);
                }
            }

            for (Map.Entry<String, ArrayList<Employee>> entry: deps.entrySet()) {
                System.out.println("Department: " + entry.getKey());
                Collections.sort(entry.getValue());
                Collections.reverse(entry.getValue());

                System.out.println("Max salary employees: ");
                for (int i = 0; i < entry.getValue().size(); i++) {
//                    if(entry.getValue().get(0).getSalary() == entry.getValue().get(i).getSalary()){
//                    if(entry.getValue().get(0).getSalary().equals(entry.getValue().get(i).getSalary())){
                    if(entry.getValue().get(0).equals(entry.getValue().get(i))){
                        System.out.println(entry.getValue().get(i));
                    }
                }
                System.out.println("");
                System.out.println("");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
