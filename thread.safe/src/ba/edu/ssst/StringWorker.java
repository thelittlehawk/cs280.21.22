package ba.edu.ssst;

public class StringWorker implements Runnable {
    @Override
    public void run() {
        Storage.getInstance().addToArray("StringWorker");
    }
}
