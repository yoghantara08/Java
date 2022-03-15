class Parent {
    String name;
    void doIt(){
        System.out.println("Do it in parent");
    }
}

class Child extends Parent{
    // Variable Hidding
    String name;

    // Method Overriding
    void doIt(){
        System.out.println("Do it in child");
    }

}