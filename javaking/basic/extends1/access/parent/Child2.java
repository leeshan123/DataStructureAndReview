package javaking.basic.extends1.access.parent;

public class Child2 extends Parent {

    public void call(){
        publicValue = 1;
        protectedValue = 1; //상속 관계 or 같은 패키지
        defaultValue =1;
        defaultMethod();
    }
}
