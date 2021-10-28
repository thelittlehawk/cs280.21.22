package ba.edu.ssst;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map osnovnaMapa = new HashMap<String, String>();
//        Map osnovnaMapa = new TreeMap<String, String>();
//        Map osnovnaMapa = new LinkedHashMap<>();

        // kljuc - vrijednost
        // key: value
        osnovnaMapa.put("Key A", "Value A");
        osnovnaMapa.put("Key B", "Value B");
        osnovnaMapa.put("Key B", "Value C");
        osnovnaMapa.put("Key C", "Value novi C");
        osnovnaMapa.put("Key D", "V alue D");

        System.out.println(osnovnaMapa);

        System.out.println(osnovnaMapa.get("Key A"));
        System.out.println(osnovnaMapa.get("Key C"));

        System.out.println("");
        System.out.println("Entry Set");
        for (Object element : osnovnaMapa.entrySet()) {
            System.out.println(element);
            System.out.println(element.getClass());
        }

        System.out.println("");
        System.out.println("Values");
        for (Object element: osnovnaMapa.values()) {
            System.out.println(element);
        }

        System.out.println("");
        System.out.println("Keys");
        for (Object element: osnovnaMapa.keySet()) {
            System.out.println(element);
        }
    }
}
