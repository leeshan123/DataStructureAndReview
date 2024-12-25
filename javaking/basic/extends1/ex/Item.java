package javaking.basic.extends1.ex;

public class Item {

    String name;
    int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;

    }

    void print(){
        System.out.println("오버라이딩할거야.");
        System.out.println("이름: "+name+" 가격: "+ price);
    }

    public int getPrice() {
        return price;
    }
}
