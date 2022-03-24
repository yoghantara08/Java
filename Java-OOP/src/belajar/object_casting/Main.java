package belajar.object_casting;

public class Main {
    public static void main(String[] args) {
		
		// object dengan class HeroIntel
		HeroIntelligent hero1 = new HeroIntelligent("Ucup",100);

		hero1.display();
		hero1.castMagic();
		
		// up casting
		Hero heroUp = (Hero) hero1;

		heroUp.display();

		// ada field dan method yang hilang
		// System.out.println(heroUp.type);
		// heroUp.castMagic();

		Hero heroReg = new Hero("Otong",100);

		heroReg.display();

		// down casting dari Superclass ke subclass, tidak bisa

		// HeroAgility heroDown = (HeroAgility) heroReg;

		// heroDown.display();

		// kita coba dari intel ke hero biasa lalu kita balikan ke intel

		HeroIntelligent hero2 = (HeroIntelligent) heroUp;

		// berhasil di down casting, dengan syarat bentuk awalnya adalah sama
		hero2.display();
		System.out.println(hero2.type);
		hero2.castMagic();
	}
}
