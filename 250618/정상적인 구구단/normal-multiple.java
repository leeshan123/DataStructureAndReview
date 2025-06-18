import java.io.*;

public class Main {
    public static void main(String[] args)throws Exception{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                if(j != N){
                    System.out.print(i+" * "+j+" = "+i*j+", ");
                }else{
                    System.out.print(i+" * "+j+" = "+i*j);
                }
            }

            System.out.println();
        }


    }
}