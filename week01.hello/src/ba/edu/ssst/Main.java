package ba.edu.ssst;

public class Main {

    public static void main(String[] args) {
        System.out.println("Prvi program u JAVIi");
        System.out.print(10);
        System.out.println(" - nece ici u novi red");

        int i = 1;
        System.out.println("Ispis prvih " + 10 + " brojeva. " + 0.123);

        for (i = 1 ; i < 10 ; i++) {
            System.out.print(i + ", ");
        }

        i = 1;
        while (i < 10) {
            System.out.print(i + ", ");
            i++;
        }
        System.out.println("======");

        Person p = new Person("Fname", "Lname");
        System.out.println(p);

        p.setPetName("Cuko");
    }
}

