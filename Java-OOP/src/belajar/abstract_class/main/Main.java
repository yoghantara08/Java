package belajar.abstract_class.main;

import belajar.abstract_class.hero.HeroIntelligent;
import belajar.abstract_class.hero.HeroAgility;

public class Main {
	
	public static void main(String[] args) {
		
		// membuat object dari kelas non-abstract
		HeroIntelligent hero1 = new HeroIntelligent("Otong");
		hero1.display();

		HeroAgility hero2= new HeroAgility("Mario");
		hero2.display();

		// membuat object dari kelas abstract
		// Hero hero3 = new Hero("Mario");
		// hero3.display();
	}
}
