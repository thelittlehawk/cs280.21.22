package ba.edu.ssst;

import java.util.ArrayList;

public class FindInteger implements Runnable {
    private ArrayList<Integer> integers;
    private int target;

    public FindInteger(ArrayList<Integer> integers, int target) {
        this.integers = integers;
        this.target = target;
    }

    @Override
    public void run() {
        for (Integer i : integers) {
            if(i == target) {
                System.out.print(target + " ");
            }
        }
        System.out.println();
    }
}
