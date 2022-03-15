package PackageJava.data;

public class Product {
    public String name;
    public int price;

    // hanya bisa diakses di turunannya dan di package yang sama
    // protected String name; 
    // protected int price;

    // private = hanya bisa diakses di classnya saja
    // private String name; 
    // private int price;
    

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }
}
