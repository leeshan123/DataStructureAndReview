package javaking.mid1.nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV3 {

    public static void hello(Process process){
        System.out.println("프로그램 시작");

        process.run();

        System.out.println("프로그램 끝");
    }



    public static void main(String[] args) {


        hello(new Process(){
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        });
        hello(new Process(){
            @Override
            public void run() {
                for(int i=0; i<5;  i++){
                    System.out.println("i = " + i);
                }
            }
        });
    }

}
