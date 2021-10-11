package ba.edu.ssst;

public class Main extends Object {

    void types() {
        int broj = 1; // -127 do 128

        Integer brojKlasa = 10;
        brojKlasa.toString();
        long veciBroj = 32000;

//        float decimalFlaot = 1.123;
        double decimalDouble = 3.345;
        Double decimalDoubleClass = 1.23;

        boolean flag = true; // false
    }

    public void classTypes() {
        Person p = new Person("My name", "Last name");
        p.getFirstName();
        p.getLastName();
        System.out.println(p);

        Employee e = new Employee("Emp name", "Emp last", 1000);
        System.out.println(e);

        Employee m1 = new Manager("Manager name 1", "Manager last name 1");
        Person m2 = new Manager("Manager name 2", "Manager 2 last name", 500);
        Manager m3 = new Manager("Manager name 3 ", "Manager 3 last name", 850);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }

    public static void main(String[] args) {
        int[] brojevi = new int[10];
        brojevi[0] = 0;
        brojevi[1] = 1;
        brojevi[2] = 2;
        brojevi[3] = 3;

        int[] brojevi2 = { 1, 2, 3 };

        int element = 100;
        int[] brojevi3 = new int[element];

        System.out.println(brojevi);
        System.out.println(brojevi2);
        System.out.println(brojevi3);

        Person[] persons = new Person[4];
        persons[0] = new Person("F1", "L1");
        persons[1] = new Person("F2", "L2");
        persons[2] = new Employee("F2", "L2", 1000);
        persons[3] = new Manager("F2", "L2");

        for (int i = 0; i < persons.length; i++) {
            Person p = persons[i];
            System.out.println(p); // System.out.println(persons[i]);
        }

        for (Person p: persons) {
            System.out.println(p);
        }
    }
}
