package exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {

    public static void main(String[] args) {



    }

    public static boolean copyFile(String file1, String file2) {
        List<String> file1Content = new ArrayList<>();
        Path file1Path = Paths.get(file1);
        Path file2Path = Paths.get(file2);
        try {
            file1Content = Files.readAllLines(file1Path);
            Files.write(file2Path, file1Content);
        } catch (IOException e) {
            return false;
        }catch (Exception e) {
            return false;
        }
        return  true;
    }

}
