package ba.edu.ssst;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("files//imena.txt");
        Scanner scanner = new Scanner(file);

        if(scanner.hasNextLine()) {
            System.out.println("Nije prazan!!!");
        }

        System.out.println("====================");

        ArrayList<String> imena = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String linija = scanner.nextLine();
            System.out.println(linija);

            String[] dijelovi = linija.split("a");
            // Chastity -> ["Ch", "stity"]
            // Chastity -> ["Chas", "i", "y"]

            String spoji = "";
            for (String dio:dijelovi) {
                spoji += dio;
            }

            imena.add(spoji);
        }

        System.out.println(imena);

        Collections.sort(imena);

        System.out.println(imena);

        try {
            FileWriter fileWriter = new FileWriter("files//probni_file.txt");
            fileWriter.write("Nesto\n");
            fileWriter.write("\n");
            fileWriter.write("\nNesto\tDrugo");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileWriter fileWriter = new FileWriter("files//sortiranaimena.txt");
            for (String ime: imena) {
                fileWriter.write(ime + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
