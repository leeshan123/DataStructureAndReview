package javaking.mid1.nested.anonymous2.ex;

import java.util.Random;

public class Ex2MainRef {

    public static void hello(String s){
        System.out.println("프로그램 시작");

        if(s.equals("Dice")){
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        }else if(s.equals("Sum")){
            for(int i=0; i<3; i++){
                System.out.println("i = " + i);
            }
        }


        System.out.println("프로그램 종료");
    }


    public static void main(String[] args) {
        hello("Dice");
        hello("Sum");

    }


}
