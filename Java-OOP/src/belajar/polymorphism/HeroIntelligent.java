package belajar.polymorphism;

public class HeroIntelligent extends Hero{
    String type = "Intelligent";

    HeroIntelligent(String name){
        super(name);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type   : " + this.type);
    }
}
