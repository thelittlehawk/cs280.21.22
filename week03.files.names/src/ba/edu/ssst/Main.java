package ba.edu.ssst;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        File f = new File("names.txt");
        Scanner s = new Scanner(f);

        ArrayList<OurName> imena = new ArrayList<>();
        while (s.hasNextLine()) {
            String linija = s.nextLine();
            String[] parts = linija.split(",");
            OurName oname = new OurName(parts[0], parts[1]);
            imena.add(oname);
        }

        FileWriter fw = new FileWriter("formatedName.txt");
        for (OurName on : imena) {
            fw.write(on.toString());
            fw.write("\n");
        }
        fw.close();
    }
}
