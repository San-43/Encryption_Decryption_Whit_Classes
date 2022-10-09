package encryptdecrypt.resourceUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class FileUtils {

    static String getDataFromFile(String path) {
        try {
            return new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e) {
            System.out.println("Error: cannot read file: " + e);
        }
        return "";
    }

    static void exportDataToFile(String data, String path) {
        File file = new File(path);
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(data);
        } catch (IOException e) {
            System.out.println("Error occurred! Some problems with output file" + e);
        }
    }
}
