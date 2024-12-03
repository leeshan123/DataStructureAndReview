package javaking.basic.static1;

public class Data3 {
    public String name;
    public static int count; //스태틱

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
