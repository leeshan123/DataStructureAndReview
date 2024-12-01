package presentation.accessmodifier.pkg1;

public class MyParent{
    private int prv; //같은 클래스
    /*default*/ int dft; // 같은 패키지
    protected  int prt; // 같은 패키지 + 자손(다른 패키지)
    public int pub; //접근제한 없음.

    public void printMembers(){
        System.out.println("prv = " + prv); //OK
        System.out.println("dft = " + dft); //OK
        System.out.println("prt = " + prt); //OK
        System.out.println("pub = " + pub); //OK
    }
}
/*publc*/ class MyParentTest {
    public static void main(String[] args) {
        MyParent p = new MyParent();
//        System.out.println("prv = " + p.prv); //에러
        System.out.println("dft = " + p.dft); //OK
        System.out.println("prt = " + p.prt); //OK
        System.out.println("pub = " + p.pub); //OK
    }
}
