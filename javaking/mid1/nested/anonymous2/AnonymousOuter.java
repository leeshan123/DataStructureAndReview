package javaking.mid1.nested.anonymous2;

import javaking.mid1.nested.local2.Printer;

import java.lang.reflect.Field;

public class AnonymousOuter {

    private int outInstanceVar = 3;

    public void process(int paramVar){

        int localVar = 1; //지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.

        //인터페이스를 구현과 생성을 같이 함
        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                //인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println("localVar=" + localVar);
                System.out.println("paramVar= " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }

        };

        printer.print();
        System.out.println("printer.class=" + printer.getClass());

    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);

    }

}
