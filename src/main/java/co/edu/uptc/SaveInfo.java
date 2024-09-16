package co.edu.uptc;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
public class SaveInfo {
    
    public void writeListToFile(ArrayList<ArrayList<Object>> list, String filePath) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(filePath))) {
            for (Object line : list) {
                writer.write(line.toString());
                writer.newLine();
            }
        }
    }
}
