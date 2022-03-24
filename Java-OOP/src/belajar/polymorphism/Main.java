package belajar.polymorphism;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Ucup");
        HeroStrength hero2 = new HeroStrength("Garou");
        
        hero1.display();
        hero2.display();

        // Polymorphic
        Hero hero3 = new HeroIntelligent("Tatsumaki");
        hero3.display();

        Hero hero4 = new HeroAgility("Flash");
        hero4.display();

        HeroAgility hero5 = new HeroAgility("Batman");
        hero5.display();
        hero5.showOff();

        // tidak bisa
        // HeroAgility heroagi = new Hero("Gak bisa");
        // heroagi.display();

        // Array list 
        // Semua Hero di anggap sebagai tipe HERO
        Hero[] kumpulanHero = new Hero[5];
        kumpulanHero[0] = hero1;
        kumpulanHero[1] = hero2;
        kumpulanHero[2] = hero3;
        kumpulanHero[3] = hero4;
        kumpulanHero[4] = hero5; // casting

        kumpulanHero[0].display();
        kumpulanHero[1].display();
        kumpulanHero[2].display();
        kumpulanHero[3].display();
        kumpulanHero[4].display();

        // aplikasinya
        hero1.attack(hero3);
        hero5.attack(hero2);
        hero3.attack(hero5);
    }
}
