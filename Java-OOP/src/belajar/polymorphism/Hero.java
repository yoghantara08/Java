package belajar.polymorphism;

public class Hero {
    String name;

    Hero(String name){
        this.name = name;
    }

    void display(){
        System.out.println("\nName   : " + this.name);
    }

    void attack(Hero enemy){
        System.out.println("\n"+this.name + " menyerang " + enemy.name);
    }
}
