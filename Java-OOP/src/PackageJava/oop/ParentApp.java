package PackageJava.oop;

public class ParentApp {
    public static void main(String[] args) {
        
        Child child = new Child();
        child.name = "Gustut";
        child.doIt(); // child
        System.out.println(child.name); // Gustut

        Parent parent = child;
        parent.doIt(); // child
        System.out.println(parent.name); // null (Variable Hiding) 
        // yg diakses bukan yg child tetapi yg di parent
        // tidak ada istilah field overriding

        parent.name = "Yoghantara";
        System.out.println(parent.name);
    }
}
