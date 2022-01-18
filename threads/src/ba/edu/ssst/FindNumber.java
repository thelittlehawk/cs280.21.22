package ba.edu.ssst;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FindNumber implements Runnable {
    private final int target;
    private final ArrayList<Integer> integers;

    public FindNumber(ArrayList<Integer> integers, int i) {
        this.target = i;
        this.integers = integers;
    }


    @Override
    public void run() {
        for (Integer i : integers ) {
            if(i == target) {
                System.out.println(i);
            }
        }
        System.out.println("DONE");
    }
}
