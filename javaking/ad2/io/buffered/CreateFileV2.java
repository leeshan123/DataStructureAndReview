package javaking.ad2.io.buffered;

import java.io.FileOutputStream;
import java.io.IOException;

import static javaking.ad2.io.buffered.BufferedConst.*;

public class CreateFileV2 {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(BufferedConst.FILE_NAME);

        long stratTime = System.currentTimeMillis();

        byte[] buffer = new byte[BUFFER_SIZE];
        int bufferIndex = 0;

        for(int i=0; i< FILE_SIZE; i++){
            buffer[bufferIndex++] = 1;

            //버터가 가득차면 쓰고, 버터를 비운다.
            if(bufferIndex == BUFFER_SIZE){
                fos.write(buffer);
                bufferIndex = 0;
            }
        }

        //끝 부분에 오면 남아 있는 버퍼 사용하기
        if(bufferIndex > 0){
            fos.write(buffer,0, bufferIndex);
        }

        fos.close();

        long endTime = System.currentTimeMillis();
        System.out.println("File created: " + FILE_NAME);
        System.out.println("File size: " + FILE_SIZE/1024/1024 +"MB");
        System.out.println("Time taken: " + (endTime - stratTime) + "ms");
    }

}
