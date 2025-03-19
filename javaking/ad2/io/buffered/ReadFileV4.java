package javaking.ad2.io.buffered;

import java.io.FileInputStream;
import java.io.IOException;

import static javaking.ad2.io.buffered.BufferedConst.FILE_NAME;
import static javaking.ad2.io.buffered.BufferedConst.FILE_SIZE;

public class ReadFileV4 {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(FILE_NAME);

        long stratTime = System.currentTimeMillis();

        byte[] bytes = fis.readAllBytes();
        fis.close();

        long endTime = System.currentTimeMillis();
        System.out.println("File created: " + FILE_NAME);
        System.out.println("File size: " + bytes.length/1024/1024 +"MB");
        System.out.println("Time taken: " + (endTime - stratTime) + "ms");
    }

}
