package ba.edu.ssst;

import java.util.ArrayList;

public class Storage {
    private static Object obj = new Object();
    private static Storage instance;
    private ArrayList<String> names;

    private Storage() {
        this.names = new ArrayList<>();
    }

    synchronized public static Storage getInstance() {
        if (instance == null) instance = new Storage();
        return instance;
    }

    public void addToArray(String newElement) {
        this.names.add(newElement);
    }

    public void changeElementInArray(int index, String newElement) {
        synchronized(obj) {
            this.names.set(index, newElement);
        }
    }

    public String getElementFromArray(int index) {
        synchronized (obj) {
            return this.names.get(index);
        }
    }

    public ArrayList<String> dajArray() {
        return this.names;
    }
}
