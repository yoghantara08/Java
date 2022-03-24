package belajar.inheritance_final_public_private;

// visibility
// 1. Public: Jika method atau attribute dalam public secara explisit, 
//    maka subclass tidak boleh mengurangi visibility
// 2. Private: Jika method atau attribute dalam private secara explisit,
//    maka subclass pun tidak dapat mengakses
// 3. Final: method atau attribute dengan final keyword akan diwariskan,
//    tetapi tidak bisa dioverride. dalam class yang sama bisa dioverload

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Saitama", 999);
        HeroIntelligent hero2 = new HeroIntelligent("Genos", 100);

        hero1.display();
        hero2.display();

        System.out.println(hero1.getHealth());
        System.out.println(hero2.getHealth());

        hero1.setHealth(9999);
        hero2.setHealth(200);

        hero1.display();
        hero2.display();

        hero2.setHealth("reset");
        hero2.display();
    }
}