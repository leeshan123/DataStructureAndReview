package review.s4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class S01 {

    public char solution(int n,String s){

        char[] arr = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        char answer = ' ';
        int max=0;

        for(char x : arr){
//            if(!map.containsKey(x)){
//                map.put(x,map.getOrDefault(x,1));
//            }else map.put(x,map.get(x)+1);
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(char key : map.keySet()){
            if(map.get(key)>max){
                max = map.get(key);
                answer = key;
            }
        }


        return answer;
    }



    public static void main(String[] args) {
        S01 T = new S01();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String s = scan.next();


        System.out.println(T.solution(n,s));

    }

}