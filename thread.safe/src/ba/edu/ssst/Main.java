package ba.edu.ssst;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	    Storage.getInstance();

        StringWorker sw1 = new StringWorker();
        StringWorker sw2 = new StringWorker();
        StringWorker sw3 = new StringWorker();

        Thread t1 = new Thread(sw1);
        Thread t2 = new Thread(sw2);
        Thread t3 = new Thread(sw3);

        t1.start();
        t2.start();
        t3.start();

        t1.join(); t2.join(); t3.join();

        System.out.println(Storage.getInstance().dajArray());
        System.out.println("Program has completed execution!");
    }
}
