package belajar.latihan_inheritance;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Tatsumaki", 30, 100);
        HeroStrength hero2 = new HeroStrength("Garou", 10, 150);
        HeroIntelligent hero3 = new HeroIntelligent("Sulivan", 50, 90);
        
        hero1.display();
        hero2.display();

        hero1.attack(hero2);
        hero2.attack(hero1);
        hero2.attack(hero3);
    }
}
