package ba.edu.ssst;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        IntegerFinder _if1 = new IntegerFinder(1);
        IntegerFinder _if2 = new IntegerFinder(2);
        IntegerFinder _if3 = new IntegerFinder(3);

        Thread t1 = new Thread(_if1);
        Thread t2 = new Thread(_if2);
        Thread t3 = new Thread(_if3);
        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

//        Thread.sleep(1500);

        System.out.println("PROGRAM COMPLETED!");
    }
}
