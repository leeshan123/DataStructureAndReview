package javaking.mid1.nested.local2;

public class LocalOuterV1 {

    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar = 1;


        class LocalPrinter {
            int value = 0;

            public void printData(){
                System.out.println("value = " + value);
                System.out.println("localVar=" + localVar);
                System.out.println("paramVar= "+ paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuterV1 = new LocalOuterV1();
        int x = 10;
        localOuterV1.process(x);
        System.out.println(x);
    }

}
