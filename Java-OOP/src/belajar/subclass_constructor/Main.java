package belajar.subclass_constructor;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Saitama",999); // constructor superclass
        hero1.display();

        HeroStrength hero2 = new HeroStrength("Nami",100); // constructor subclass
        hero2.display();

        HeroStrength hero3 = new HeroStrength("Superman");
        hero3.display();
    }
}
