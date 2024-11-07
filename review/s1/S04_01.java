package review.s1;

import java.util.ArrayList;
import java.util.Scanner;

public class S04_01 {

    public ArrayList<String> solution(int n, String[] sArr){

        ArrayList<String> answer = new ArrayList<>();
        for (String s : sArr) {
            String tmp = new StringBuilder(s).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        S04_01 T = new S04_01();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] sArr = new String[n];
        for(int i=0; i<n;i++) {
            sArr[i] = scan.next();
        }

        for (String s : T.solution(n,sArr)) {
            System.out.println(s);
        }


    }

}
