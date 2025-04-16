package javaking.mid1.nested.anonymous2.test;

public class AnonymousMain {

    public static void main(String[] args) {
        Hello hello = new Hello() {
            @Override
            public void Hello() {
                System.out.println("하이 방가방가");
            }
        };
        hello.Hello();
    }
}
