package ba.edu.ssst;

public class IntegerFinder implements Runnable {
    private final int integer;

    public IntegerFinder(int interger) {
        this.integer = interger;
    }

    @Override
    public void run() {
        System.out.println("IN run WITHIN IntegerFinder {" + this.integer + "}");
    }
}
