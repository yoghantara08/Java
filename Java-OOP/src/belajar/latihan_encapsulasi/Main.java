package belajar.latihan_encapsulasi;

class Player{
    private String name;
    private int baseHealth;
    private int baseAttack;
    private Armor armor;
    private Weapon weapon;
    private int level;
    private int incrementHealth;
    private int incrementAttack;

    public Player(String name){
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 100;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementAttack = 20;
    }

    public void display(){
        System.out.println("\nPlayer     : " + this.name);
        System.out.println("Level      : " + this.level);
        System.out.println("Max Health : " + this.maxHealth());
        System.out.println("Attack     : " + this.getAttackPower());
        System.out.println("Armor      : " + this.armor.getName());
        System.out.println("Weapon     : " + this.weapon.getName());
    }

    private void levelUp(){
        this.level++;
    }

    public void setArmor(Armor armor){
        this.armor = armor;
    }
    
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public int maxHealth(){
        return this.baseHealth + this.level*this.incrementHealth + this.armor.getAddHealth();
    }

    public int getAttackPower(){
        return this.baseAttack + this.level*this.incrementAttack + this.weapon.getAttack();
    }

}

class Weapon {
    private String name;
    private int attack;

    public Weapon(String name, int attack){
        this.name = name;
        this.attack = attack;
    }

    public int getAttack(){
        return this.attack;
    }

    public String getName(){
        return this.name;
    }
}

class Armor{
    private String name;
    private int strength;
    private int health;

    public Armor(String name, int strength, int health){
        this.name = name;
        this.strength = strength;
        this.health = health;
    }

    public int getAddHealth(){
        return this.strength*10 + this.health;
    }

    public String getName(){
        return this.name;
    }
}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Tono");
        Armor armor1 = new Armor("Baju Besi", 5, 100);
        Weapon weapon1 = new Weapon("Pedang",10);
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);
        
        Player player2 = new Player("Rizal");
        Armor armor2 = new Armor("Jubah", 2, 100);
        Weapon weapon2 = new Weapon("Pistol",20);
        player2.setArmor(armor2);
        player2.setWeapon(weapon2);


        player1.display();
        player2.display();
    }
}
