package review.s4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class S04 {

    public int solution(String a,String b){

        int answer = 0;

        Map<Character,Integer> am = new HashMap<>();
        Map<Character,Integer> bm = new HashMap<>();

        for(char x : b.toCharArray()){
            bm.put(x,bm.getOrDefault(x,0)+1);
        }
        int L = b.length()-1;
        for(int i=0; i<L; i++){
            am.put(a.charAt(i),am.getOrDefault(a.charAt(i),0)+1);
        }
        int lt = 0;

        for(int rt = L; rt<a.length(); rt++){
            am.put(a.charAt(rt),am.getOrDefault(a.charAt(rt),0)+1);
            if(am.equals(bm)) answer++;
            am.put(a.charAt(lt),am.get(a.charAt(lt))-1);
            if(am.get(a.charAt(lt))==0) am.remove(a.charAt(lt));
            lt++;
        }






        return answer;
    }



    public static void main(String[] args) {
        S04 T = new S04();
        Scanner scan = new Scanner(System.in);

        String s1 = scan.next();
        String s2 = scan.next();


        System.out.println(T.solution(s1,s2));

    }

}