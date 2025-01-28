package javaking.ad2.io.file.copy;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateCopyFile {

    private static final int FILE_SIZE = 200 * 1024 * 1024; //200MB

    public static void main(String[] args) throws IOException {
        String filneName = "javaking/ad2/io/temp/copy.dat";
        long startTime = System.currentTimeMillis();
        FileOutputStream fos = new FileOutputStream(filneName);
        byte[] buffer = new byte[FILE_SIZE];
        fos.write(buffer);
        fos.close();

        long endTime = System.currentTimeMillis();
        System.out.println("File created: " + filneName);
        System.out.println("File size: " + FILE_SIZE  / 1024/1024 +"MB");
        System.out.println("Time taken: " + (endTime - startTime) + "ms");

    }


}
