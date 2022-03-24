package belajar.subclass_constructor;

public class Hero {
    String name;
    double defencePower;

    // constructor
    Hero(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    // overloading
    Hero(String name){
        this.name = name;
    }

    // method
    void display(){
        System.out.println("Name    : " + this.name);
        System.out.println("Defence : " + this.defencePower);
    }
}
