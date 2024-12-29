package javaking.mid1.immutable.test;

public class js {

    public static void main(String[] args) {
        String a = "박준순";
        String b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        b = "지드래곤";

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

    }

}
