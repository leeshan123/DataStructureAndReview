package javaking.ad2.io.buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import static javaking.ad2.io.buffered.BufferedConst.*;

public class ReadFileV3 {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        BufferedInputStream bis = new BufferedInputStream(fis, BUFFER_SIZE);

        long stratTime = System.currentTimeMillis();

        int fileSize = 0;
        int data;
        while((data = bis.read()) != -1){
            fileSize++;
        }
        bis.close();

        long endTime = System.currentTimeMillis();
        System.out.println("File created: " + FILE_NAME);
        System.out.println("File size: " + FILE_SIZE/1024/1024 +"MB");
        System.out.println("Time taken: " + (endTime - stratTime) + "ms");
    }

}
