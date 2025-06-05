import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        char[] sArr = s.toCharArray();

        for(int i=0; i<sArr.length; i++){
            if(i == 1 || i == sArr.length-2){
                sArr[i] = 'a';
            }
        }
        

        System.out.println(new String(sArr));


    }
}