package belajar.inheritance;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "Saitama";
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "King";
        hero2.display();
        
        HeroIntelligent hero3 = new HeroIntelligent();
        hero3.name = "Tatsumaki";
        hero3.display();
    }
}
