package javaking.basic.poly.car1;

import javaking.basic.poly.car1.K3Car;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량 선택(k3)
        K3Car k3Car = new K3Car();
        Car car = k3Car;
        driver.setCar(car);
        driver.drive();

        Model3Car model3Car = new Model3Car();
        Car car1 = model3Car;
        driver.setCar(car1);
        driver.drive();
    }

}
