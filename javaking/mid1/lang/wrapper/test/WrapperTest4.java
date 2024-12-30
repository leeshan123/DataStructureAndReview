package javaking.mid1.lang.wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";
        Integer interger1 = Integer.valueOf(str);
        int intValue = interger1;
        Integer integer2 = intValue;

        System.out.println("interger1 = " + interger1);
        System.out.println("intValue = " + intValue);
        System.out.println("integer2 = " + integer2);


    }
}
