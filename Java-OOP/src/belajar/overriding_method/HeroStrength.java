package belajar.overriding_method;

public class HeroStrength extends Hero{
    double defencePower;

    // Overriding Method
    void display(){
        System.out.println("Hero Strength");
        System.out.println("Hero Name : " + this.name);
        System.out.println("Defence Power : " + this.defencePower);
    }
}
