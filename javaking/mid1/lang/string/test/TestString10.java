package javaking.mid1.lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] split = fruits.split(",");
        String result = String.join("->",split);

        System.out.println(result);

    }
}
