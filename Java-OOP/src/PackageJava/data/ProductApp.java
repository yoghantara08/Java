package PackageJava.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 12_000_000);
        System.out.println(product.name);
        System.out.println(product.price);
        System.out.println(product);
    }
}
