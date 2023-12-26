package ss16_IO.bt;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        String sourceFile = "";
        String targetFile = "";

        try (FileReader reader = new FileReader(sourceFile);
             FileWriter writer = new FileWriter(targetFile)) {

            int character;
            int characterCount = 0;

            while ((character = reader.read()) != -1) {
                writer.write(character);
                characterCount++;
            }

            System.out.println("File copied successfully.");
            System.out.println("Number of characters copied: " + characterCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
