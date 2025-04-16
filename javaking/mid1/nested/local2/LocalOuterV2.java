package javaking.mid1.nested.local2;

public class LocalOuterV2 {

    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar = 1;


        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar=" + localVar);
                System.out.println("paramVar= "+ paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuterV2 = new LocalOuterV2();
        int x = 10;
        localOuterV2.process(x);
        System.out.println(x);
    }

}
