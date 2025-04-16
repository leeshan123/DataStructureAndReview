package javaking.mid1.nested.anonymous2.ex;

import java.util.Random;

public class Ex3MainRefAnswer {

    public static void main(String[] args) {
        class Dice implements Process {

            @Override
            public void run() {


                //코드 조각 시작
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
                //코드 조각 종료

            }
        }

        class Sum implements Process {

            @Override
            public void run() {

                //코드 조각 시작
                for(int i=0; i<3; i++){
                    System.out.println("i = " + i);
                }
                //코드 조각 종료

            }
        }


        hello(new Dice());
        hello(new Sum());

    }

    public static void hello(Process process){
        System.out.println("프로그램 시작");

        //코드 조각 시작
        process.run();

        System.out.println("프로그램 종료");
    }



}


