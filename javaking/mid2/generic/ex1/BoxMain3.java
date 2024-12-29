package javaking.mid2.generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); //생성 시점에 T의 타입 결정
        integerBox.set(10);
//        integerBox.set("문자100"); //Integer 타입만 허용, 컴파일 오류
        Integer integer = integerBox.get();// Integer 타입 반환(캐스팅 X)
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
//        stringBox.set(10); //String 타입만 허용, 컴파일 오류
        String s = stringBox.get();
        System.out.println("s = " + s);




    }

}
