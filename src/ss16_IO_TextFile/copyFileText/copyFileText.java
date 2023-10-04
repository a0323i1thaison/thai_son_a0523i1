package ss16_IO_TextFile.copyFileText;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class copyFileText {
    public static void main(String[] args) {
        String sourceFile = "src/ss16_IO_TextFile/copyFileText/File.CSV";
        String targetFile = "src/ss16_IO_TextFile/copyFileText/FileCopy.CSV";
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
