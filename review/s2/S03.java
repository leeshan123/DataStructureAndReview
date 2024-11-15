package review.s2;

import java.util.Scanner;

public class S03 {

    //1:가위, 2:바위, 3:보
    public void solution(int n, int[] arr1,int[] arr2){
        for(int i=0; i< n; i++){
            if(arr1[i] == arr2[i]){
                System.out.println("D");
            }else if(arr1[i] == 1 && arr2[i] ==3 || arr1[i] == 2 && arr2[i] ==1 || arr1[i] == 3 && arr2[i] ==2){
                System.out.println("A");
            }else System.out.println("B");

        }

    }

    public static void main(String[] args) {
        S03 T = new S03();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for(int i=0; i<n; i++){
            arr1[i] = scan.nextInt();
        }

        for(int i=0; i<n; i++){
            arr2[i] = scan.nextInt();
        }

        T.solution(n,arr1,arr2);


    }

}
