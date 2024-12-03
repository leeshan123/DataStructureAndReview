package javaking.basic.static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data3 data1 = new Data3("A");
        System.out.println("A count=" + data1.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count=" + data2.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count=" + data3.count);
        
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);

    }


}
