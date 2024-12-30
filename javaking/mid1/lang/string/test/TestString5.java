package javaking.mid1.lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        System.out.println(str.substring(0,str.lastIndexOf(ext)));
        System.out.println(str.substring(str.lastIndexOf(ext)));
    }

}
