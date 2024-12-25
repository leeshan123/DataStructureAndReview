package javaking.basic.extends1.overriding;

public class GasCar extends Car {

    public void move(){
        System.out.println("가스차를 빠르게 이동합니다.");
    }

    public void fillUp(){
        System.out.println("기름을 주유합니다.");
    }
}
