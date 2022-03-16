package PackageJava.app;

import PackageJava.data.Animal;
import PackageJava.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Roti";
        animal.run();
    }
}
