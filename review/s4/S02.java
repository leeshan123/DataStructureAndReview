package review.s4;

import java.util.*;

public class S02 {

    public List<Integer> solution(int n,int k,int[] arr){

        List<Integer> answer = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<k-1; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        int lt = 0;

        for(int i=k-1; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            answer.add(map.size());

            map.put(arr[lt],map.get(arr[lt])-1);
            if(map.get(arr[lt])==0)map.remove(arr[lt]);
            lt++;

        }


        return answer;
    }



    public static void main(String[] args) {
        S02 T = new S02();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }


        System.out.println(T.solution(n,k,arr));

    }

}