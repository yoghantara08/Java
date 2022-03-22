package belajar.latihan;

// player
class Player {
    String name;
    double health;
    int level;
    // objects member / data member
    Weapon weapon;
    Armor armor;

    // constructor
    Player(String name, double health){
        this.name = name;
        this.health = health;
    }

    // ATTACK
    void attack(Player opponent){
        double attackPower = this.weapon.attackPower;
        
        System.out.println(this.name + " attacking " + opponent.name + " with power " + attackPower);
        opponent.defence(attackPower);
    }

    // DEFENCE
    void defence(double attackPower){
        double damage;
        if(this.armor.defencePower < attackPower){
            damage = attackPower - this.armor.defencePower;
        } else {
            damage = 0;
        }

        this.health -= damage;
        System.out.println(this.name + " gets damage " + damage);
    }

    // EQUIPMENT
    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    
    void equipArmor(Armor armor){
        this.armor = armor;
    }

    // DISPLAY
    void display(){
        System.out.println("\nName    : " + this.name);
        System.out.println("Health  : " + this.health + "hp");
        this.weapon.display();
        this.armor.display();
    }
}

// senjata
class Weapon {
    double attackPower;
    String name;

    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("Weapon  : " + this.name + "\nAttack  : " + this.attackPower);
    }
}

// armor
class Armor {
    double defencePower;
    String name;

    Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    void display(){
      System.out.println("Armor   : " + this.name + "\nDefence : " + this.defencePower);
    }
}

public class Main {
    public static void main(String[] args) {

        // membuat object player
        Player player1 = new Player("Gustut", 100);
        Player player2 = new Player("Yoghantara", 90);
        // membuat object weapon
        Weapon pedang = new Weapon("Pedang",15);
        Weapon batu = new Weapon("Batu",3);

        // membuat object armor
        Armor bajuBesi = new Armor("Baju Besi",20);
        Armor kaos = new Armor("Kaos",5);
        
        // equip senjata dan armor
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player1.display();

        player2.equipWeapon(batu);
        player2.equipArmor(kaos);
        player2.display();

        // PERTEMPURAN
        System.out.println("\nPERTEMPURAN");
        player1.attack(player2);
        System.out.println(player2.name + " Health : " + player2.health + "\n");

        player2.attack(player1);
        System.out.println(player1.name + " Health : " + player1.health + "\n");
    }
}
