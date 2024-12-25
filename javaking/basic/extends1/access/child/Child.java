package javaking.basic.extends1.access.child;

import javaking.basic.extends1.access.parent.Parent;

public class Child extends Parent {

    public void call(){
        publicValue = 1;
        protectedValue = 1; //상속 관계 or 같은 패키지
//        defaultValue =1; 다른패키지 접근 불가,
//        privateValue = 1;

        publicMethod();
        protectedMethod();
//        defaultMethod();
//        privateMethod();
        printParent();

    }
}
