package javaking.mid1.nested.inner2;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner();
        inner.print();

        System.out.println("innerClass = " + inner.getClass());

    }
}
