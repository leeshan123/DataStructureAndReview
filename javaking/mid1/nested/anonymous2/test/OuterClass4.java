package javaking.mid1.nested.anonymous2.test;

public class OuterClass4 {

    public void myMethod() {

        class LocalClass {
            void hello(){
                System.out.println("로컬헬로우");
            }
        }
        LocalClass local = new LocalClass();
        local.hello();

    }


}
