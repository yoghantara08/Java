package belajar.inheritance_final_public_private;

// public ini akan terbuka untuk semuanya
public class HeroIntelligent extends Hero{

    HeroIntelligent(String name, double health) {
        super(name, health);
    }

    // kalau di parent public, maka subclass juga harus public
    public void display(){
        System.out.println("\nName    : " + this.name);
        System.out.println("Health  : " + this.getHealth());
    }
}
