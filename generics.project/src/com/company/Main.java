package com.company;

public class Main {

//    public static void main(String[] args) {
//        OurWrapper<Integer> ow1 = new OurWrapper(10);
//        OurWrapper<Double> ow2 = new OurWrapper(10.1);
//        OurWrapper<String> ow3 = new OurWrapper("Something Random");
//
//        ow1.sum(10);
//        ow2.sum(10.1);
//        ow3.sum(" 2022");
//    }

    public static void main(String[] args) {
	    OurWrapper<Integer> ow1 = new OurWrapper(10);
        OurWrapper<Double> ow2 = new OurWrapper(10.1);

        ow1.sum(10);
        ow2.sum(10.1);
    }
}
