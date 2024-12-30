package javaking.mid1.lang.test;

public class testMain {
    public static void main(String[] args) {
        testclass test = new testclass(1);
        System.out.println(test);
        System.out.println(test.hashCode());
        test.setX(10);
        System.out.println(test);
        System.out.println(test.hashCode());


    }
}
