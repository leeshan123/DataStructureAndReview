package javaking.mid2.generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);
//        Integer retult = (Integer) GenericMethod.objMethod(i); 이게 싫은거

        //타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
//        System.out.println("result = " + result);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        GenericMethod.<Double>numberMethod(20.0);


    }

}
