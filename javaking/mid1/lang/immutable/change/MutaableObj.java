package javaking.mid1.lang.immutable.change;

public class MutaableObj {

    private int value;

    public MutaableObj(int value) {
        this.value = value;
    }

    public void add(int addValue){
        value = value + addValue;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


}
