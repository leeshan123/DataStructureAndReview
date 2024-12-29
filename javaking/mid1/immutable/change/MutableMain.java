package javaking.mid1.immutable.change;

public class MutableMain {

    public static void main(String[] args) {
        MutaableObj obj = new MutaableObj(10);
        obj.add(20);

        //계산 이후에 기존 값은 사라짐.
        System.out.println("obj = " + obj.getValue());
    }


}
