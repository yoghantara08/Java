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

    public String toString(){
        return "Product name: " + name + ", Price:" + price;
    }

    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if (! (obj instanceof Product)){
            return false;
        }
        Product product = (Product) obj;
        if(this.price != product.price){
            return false;
        }

        if(this.name != null){
            return this.name.equals(product.name);
        } else{
            return product.name == null;
        }
    }
}
