package ba.edu.ssst;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> integers = new ArrayList<>();


        Random random = new Random();
        // 1_000_000 == 1000000
        for (int i = 0; i < 10_000_000; i++) {
            integers.add(random.nextInt(1_000_000));
        }
        System.out.println("TOTAL NUMBERS IN ARRAY LIST: " + integers.size());

        System.out.println("WITHOUT THREADS");
        long startTime = System.nanoTime();
        findNumber(integers, 100);
        System.out.println("Execution time: " + (System.nanoTime() - startTime) / 1_000_000);

        System.out.println();
        System.out.println("WITH THREADS");
        long startTimeWithThreads = System.nanoTime();
        findNumberWithThreads(integers, 100);
        System.out.println("Execution time: " + (System.nanoTime() - startTimeWithThreads) / 1_000_000);
    }

    private static void findNumberWithThreads(ArrayList<Integer> integers, int target) throws InterruptedException {
        FindInteger findInteger1 = new FindInteger(new ArrayList<>(integers.subList(0, 5_000_000)), target);
        FindInteger findInteger2 = new FindInteger(new ArrayList<>(integers.subList(5_000_000, 10_000_000)), target);

        Thread t1 = new Thread(findInteger1);
        Thread t2 = new Thread(findInteger2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

    private static void findNumber(ArrayList<Integer> integers, int target) {
        for (Integer i : integers) {
            if(i == target) {
                System.out.print(target + " ");
            }
        }
        System.out.println();
    }
}
