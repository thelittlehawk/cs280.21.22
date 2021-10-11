package ba.edu.ssst;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int brojElemenata = 10;
        int[] niz = new int[brojElemenata];
        int[][] matrica = new int[10][10];
        matrica[0][0] = 10;
//        System.out.println(niz);

        ArrayList<String> brojevi = new ArrayList<>();
        brojevi.add("Prvi");
        brojevi.add("Drugi");
        brojevi.add("Treci");
        brojevi.add("Cetvrti");
        System.out.println(brojevi);

        brojevi.set(0, brojevi.get(0) + "...ali promjenjen.");
        System.out.println(brojevi);

        brojevi.remove(0);
        System.out.println(brojevi);

        int indexOfDrugi = brojevi.indexOf("Drugi");
        System.out.println("indexOfDrugi: " + indexOfDrugi);
        brojevi.set(indexOfDrugi, brojevi.get(indexOfDrugi) + "...ali promjenjen.");
        System.out.println(brojevi);

        int indexOfNema = brojevi.indexOf("Nema");
        System.out.println("indexOfNema: " + indexOfNema);

        ArrayList<String> nekiDrugiBrojevi = new ArrayList<>();
        nekiDrugiBrojevi.add("Peti");
        nekiDrugiBrojevi.add("Sesti");

        brojevi.addAll(nekiDrugiBrojevi);
        System.out.println(brojevi);

        ArrayList<Integer> praviBrojevi = new ArrayList<>();
        praviBrojevi.add(3);
        praviBrojevi.add(5);
        praviBrojevi.add(1);
        praviBrojevi.add(2);

        Collections.sort(brojevi);
        System.out.println(brojevi);
        Collections.reverse(brojevi);
        System.out.println(brojevi);

        Collections.sort(praviBrojevi);
        System.out.println(praviBrojevi);

        Collections.reverse(praviBrojevi);
        System.out.println(praviBrojevi);

        // Custom sort
        ArrayList<Integer> customSortBrojevi = new ArrayList<>();
        customSortBrojevi.add(10);
        customSortBrojevi.add(2);
        customSortBrojevi.add(3);
        customSortBrojevi.add(7);
        customSortBrojevi.add(-5);

        System.out.println("customSortBrojevi => " + customSortBrojevi);

        customSortBrojevi.sort((x, y) -> {
            // (x < y) ? -1 : ((x == y) ? 0 : 1)
            if (x < y) {
                return 1;
            } else {
                if (x == y) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });

        System.out.println("customSortBrojevi sortirani => " + customSortBrojevi);

//        boolean comparator(Integer element1, Integer element2) {
//
//        }


    }
}
