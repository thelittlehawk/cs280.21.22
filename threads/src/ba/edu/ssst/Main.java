package ba.edu.ssst;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    private static ArrayList<Integer> integers = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
//        Random random = new Random();
//        for(int i = 0 ; i < 1000000 ; i++) {
//            integers.add(random.nextInt(1000000));
//        }
//
//        long startTimeWithoutThreads = System.nanoTime();
//        withoutThreads();
//        System.out.println("Without threads: " + ((System.nanoTime() - startTimeWithoutThreads) / 1000000));
//
//
//        long startTimeWithThreads = System.nanoTime();
//        withThreads();
//        System.out.println("With threads :" + ((System.nanoTime() - startTimeWithThreads) / 1000000));

        BigInteger bi1 = new BigInteger("0");
        BigInteger bi2 = new BigInteger("1000000000000000000");
        System.out.println(bi1.add(bi2));
    }

    private static void withThreads() throws InterruptedException {
        Thread t1 = new Thread(new FindNumber(new ArrayList<Integer>(integers.subList(0, 500000)), 100));
        Thread t2 = new Thread(new FindNumber(new ArrayList<Integer>(integers.subList(500000, 1000000)), 100));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }

    private static void withoutThreads() {
        for (Integer i : integers ) {
            if(i == 100) {
                System.out.println(i);
            }
        }
        System.out.println("DONE");
    }
}
