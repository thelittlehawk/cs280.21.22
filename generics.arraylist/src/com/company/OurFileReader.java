package com.company;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;

public class OurFileReader<T extends ICreateFromString> {
    Class<T> type;
    private String[] lines;

    public OurFileReader(String[] lines, Class<T> type) {
        this.lines = lines;
        this.type = type;
    }

    public ArrayList<T> process() {
        ArrayList<T> returnArray = new ArrayList<>();
        for (String line:lines) {
            String[] elements = line.split(", ");

            T t = null;
            try {
                t = type.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
            t.createFromStrings(elements);
            returnArray.add(t);
        }
        return returnArray;
    }
}
