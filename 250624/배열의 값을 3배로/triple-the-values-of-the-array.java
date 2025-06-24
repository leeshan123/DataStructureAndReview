import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] matrix = new int[3][3];

        for(int i=0; i<3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j=0; j<3; j++){
                matrix[i][j] = Integer.parseInt(st.nextToken())*3;
                System.out.print(matrix[i][j]+" ");
            }

            System.out.println();
        }



    }
}