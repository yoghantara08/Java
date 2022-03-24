package belajar.polymorphism;

public class HeroAgility extends Hero{
    String type = "Agility";

    HeroAgility(String name){
        super(name);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type   : " + this.type);
    }

    void showOff(){
        System.out.println("Saya Hero Agility");
    }
}
