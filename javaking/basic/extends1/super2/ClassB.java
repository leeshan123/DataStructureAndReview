package javaking.basic.extends1.super2;

import javax.swing.plaf.PanelUI;

public class ClassB extends ClassA{

    public ClassB(int a){
        this(a,0);
        System.out.println("ClassB 생성자 a=" + a);
    }

    public ClassB(int a , int b){
//        super();
        System.out.println("ClassB 생성자 a=" + a +" b=" + b);
    }
}
