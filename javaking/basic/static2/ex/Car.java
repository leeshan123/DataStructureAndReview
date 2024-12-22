package javaking.basic.static2.ex;

public class Car {

    String carName;
    static int quantity;

    public Car(String carName) {
        System.out.println("차량구입, 이름: " + carName);
        this.carName = carName;
        quantity++;
    }


    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + quantity);
    }
}
