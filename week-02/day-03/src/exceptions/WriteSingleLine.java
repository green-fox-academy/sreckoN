package exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {

    public static void main(String[] args) {

        writeNameIntoAFile();

    }

    public static void writeNameIntoAFile() {
        List<String> name = new ArrayList<>();
        name.add("Srecko Nikolic");
        try {
            Path filePath = Paths.get("my-file.txt");
            Files.write(filePath, name);
        } catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
