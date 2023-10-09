package ss17_IO_BinaryFile_Serialization.CopyFlieBinary;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copyFileByBinary {
    public static void main(String[] args) {
        String sourFile = "D:\\codegym\\module2\\module2_a0523i1\\src\\ss17_IO_BinaryFile_Serialization\\CopyFlieBinary\\fileData.CSV";
        String copyFile = "D:\\codegym\\module2\\module2_a0523i1\\src\\ss17_IO_BinaryFile_Serialization\\MannageProductByFiles\\Data\\product.CSV";
        try (FileReader reader = new FileReader(sourFile);
             FileWriter writer = new FileWriter(copyFile)) {

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
