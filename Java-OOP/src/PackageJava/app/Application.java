package PackageJava.app;

import PackageJava.data.Product;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("PC", 15_000_000);
        System.out.println(product.name); 
        System.out.println(product.price); 
    }
}
