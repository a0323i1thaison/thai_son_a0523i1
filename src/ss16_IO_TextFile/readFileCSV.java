package ss16_IO_TextFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFileCSV {
    public static void main(String[] args) {
        String filePath = "src/ss16_IO_TextFile/readFile.CSV";

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] fields = line.split(",");

                if (fields.length >= 3) {
                    int id = Integer.parseInt(fields[0].trim());
                    String code = fields[1].trim();
                    String name = fields[2].trim();

                    System.out.println("ID: " + id);
                    System.out.println("Code: " + code);
                    System.out.println("Name: " + name);
                    System.out.println();
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
