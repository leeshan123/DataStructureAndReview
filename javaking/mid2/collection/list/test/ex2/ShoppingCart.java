package javaking.mid2.collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Item> list = new ArrayList<>();
    public void addItem(Item item) {
        list.add(item);
    }

    public void displayItems() {
        int sum =0;
        System.out.println("장바구니 상품 출력");
        for (Item item : list) {
            System.out.println("상품명: "+item.getName()+", 합계: "+item.getTotalPrice());
            sum += item.getTotalPrice();
        }
        System.out.println("전체 가격 합: "+ sum);
    }
}
