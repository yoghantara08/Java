package PackageJava.app;

import PackageJava.data.Avanza;
import PackageJava.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        car.drive();
        System.out.println(car.getTire());
    }
}
