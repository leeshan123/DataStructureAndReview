package review.s2;

import java.util.Scanner;

public class S04_01 {

    public void solution(int n){
        int a=1,b=1, c;
        System.out.print(a+" "+b+" ");
        for(int i=2; i<n; i++){
            c = a+b;
            System.out.print(c+" ");
            a=b;
            b=c;

        }

    }

    public static void main(String[] args) {
        S04_01 T = new S04_01();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        T.solution(n);


    }

}