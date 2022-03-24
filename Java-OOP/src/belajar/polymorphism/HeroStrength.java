package belajar.polymorphism;

public class HeroStrength extends Hero{
    String type = "Strength";

    HeroStrength(String name){
        super(name);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type   : " + this.type);
    }
}
