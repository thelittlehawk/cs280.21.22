package com.company;

public class OurWrapper<GenericT extends Number> {
    private GenericT number;

    public OurWrapper(GenericT number) {
        this.number = number;
    }

    public Number sum(GenericT newNum) {
        return this.number + newNum;
    }
}
