package belajar.latihan_inheritance;

public class Hero {
    String name;
    double attackPower, health;

    Hero(String nameInput, double attackInput, double healthInput){
        this.name = nameInput;
        this.attackPower = attackInput;
        this.health = healthInput;
    }

    // method attack
    void attack(Hero enemy){
        System.out.println("\n" + this.name + " is attacking " + enemy.name);
        enemy.takeDamage(this.attackPower);
        enemy.display();
    }

    // method take damage
    void takeDamage(double damage){
        System.out.println(this.name + " receive damage " + damage);
        this.health -= damage;
    }

    void display(){
        System.out.println("\nName   : " + this.name);
        System.out.println("Health : " + this.health);
        System.out.println("Power  : " + this.attackPower);
    }
}
