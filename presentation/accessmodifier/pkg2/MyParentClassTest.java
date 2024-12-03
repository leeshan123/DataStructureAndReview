package presentation.accessmodifier.pkg2;

import presentation.accessmodifier.pkg1.MyParent;
//import presentation.accessmodifier.pkg1.MyParentClass;
//
//class MyChildClass extends MyParentClass {
//
//}







public class MyParentClassTest {
    public static void main(String[] args) {

        MyParent p = new MyParent();

//        System.out.println("prv = " + p.prv); //에러
//        System.out.println("dft = " + p.dft); //에러
//        System.out.println("prt = " + p.prt); //에러
        System.out.println("pub = " + p.pub); //OK

    }
}
