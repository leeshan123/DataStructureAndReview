package javaking.ad2.io.buffered;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLOutput;

import static javaking.ad2.io.buffered.BufferedConst.FILE_NAME;
import static javaking.ad2.io.buffered.BufferedConst.FILE_SIZE;

public class CreateFileV1 {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(BufferedConst.FILE_NAME);

        long stratTime = System.currentTimeMillis();

        for(int i=0; i< FILE_SIZE; i++){
            fos.write(1);
        }
        fos.close();

        long endTime = System.currentTimeMillis();
        System.out.println("File created: " + FILE_NAME);
        System.out.println("File size: " + FILE_SIZE/1024/1024 +"MB");
        System.out.println("Time taken: " + (endTime - stratTime) + "ms");
    }

}
