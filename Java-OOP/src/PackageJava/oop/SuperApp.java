package PackageJava.oop;

public class SuperApp {
    public static void main(String[] args) {
        // Parent
        var shape = new SuperKeyword();
        System.out.println(shape.getCorner());

        // Child
        var rectangle = new Rectangle();
        System.out.println(rectangle.getCorner()); // overriding
        System.out.println(rectangle.getParentCorner()); // super
    }
}
