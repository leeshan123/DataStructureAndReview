package review.s1;

import java.util.Scanner;

public class S10 {

    public int[] solution(String s,char c){
        int[] arr = new int[s.length()];
        int count = 0;
        char[] cArr = s.toCharArray();

        for(int i=0; i<s.length();i++){
            if(!(cArr[i] == c)){
                count++;
                arr[i] = count;
            }else {
                count  = 0;
                arr[i] = count;
            }
        }

        for(int i=s.length()-1; i>=0; i--){
            if(!(cArr[i] == c)){
                count++;
                if(arr[i] > count) {
                    arr[i] = count;
                }
            }else {
                count  = 0;
                arr[i] = count;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        S10 T = new S10();
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        char c = scan.next().charAt(0);


        for (int x : T.solution(s, c)) {
            System.out.print(x+" ");
        }


    }

}
