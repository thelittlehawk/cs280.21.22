package ba.edu.ssst;

import java.util.*;

public class Main {

    static void Elementi() {
        Map<String, ArrayList<Integer>> brojevi = new HashMap<>();

        brojevi.put("Odd", new ArrayList<>());
        brojevi.put("Even", new ArrayList<>());

        brojevi.get("Even").add(2);
        brojevi.get("Even").add(0, 100);
        brojevi.get("Even").add(4);
        brojevi.get("Even").add(6);
        brojevi.get("Even").add(8);

        System.out.println("Even brojevi:");
        for (Integer broj: brojevi.get("Even")) {
            System.out.println(broj);
        }

        System.out.println("");
        System.out.println("");
        System.out.println("Keys");
        System.out.println(brojevi.keySet());
    }

    public static void main(String[] args) {
//        Elementi();
        Maps();
    }

    private static void Maps() {
        Map<Integer, String> brojevi = new LinkedHashMap<>();
        brojevi.put(1, "!");
        brojevi.put(4, "$");
        brojevi.put(2, "@");
        brojevi.put(3, "#");
        brojevi.put(5, "%");
        System.out.println(brojevi);
    }
}
