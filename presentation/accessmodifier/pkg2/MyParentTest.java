package presentation.accessmodifier.pkg2;

import presentation.accessmodifier.pkg1.MyParent;

class MyChild extends MyParent {

    @Override
    public void printMembers() {
//        System.out.println("prv = " + prv); //에러
//        System.out.println("dft = " + dft); //에러
        System.out.println("prt = " + prt); //OK
        System.out.println("pub = " + pub); //OK
    }
}


public class MyParentTest {
    public static void main(String[] args) {

        MyParent p = new MyParent();

//        System.out.println("prv = " + p.prv); //에러
//        System.out.println("dft = " + p.dft); //에러
//        System.out.println("prt = " + p.prt); //에러
        System.out.println("pub = " + p.pub); //OK

    }
}
