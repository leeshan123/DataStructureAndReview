package javaking.ad2.io.file;

import java.nio.file.Files;
import java.nio.file.Path;

public class NewFilesMain {

    public static void main(String[] args) {
        Path file = Path.of("javaking/ad2/io/temp/example.txt");
        Path directory = Path.of("javaking/ad2/io/temp/exampleDir");

        System.out.println("File exists:  " + Files.exists(file));


    }
    
}
