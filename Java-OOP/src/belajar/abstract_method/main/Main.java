package belajar.abstract_method.main;

import belajar.abstract_method.hero.HeroAgility;
import belajar.abstract_method.hero.HeroIntelligent;
import belajar.abstract_method.hero.HeroStrength;

public class Main {
	
	public static void main(String[] args) {
		
		// membuat object dari kelas non-abstract
		HeroIntelligent hero1 = new HeroIntelligent("Otong");
		hero1.display();

		HeroAgility hero2 = new HeroAgility("Mario");
		hero2.display();

		hero1.levelUp();
		hero2.levelUp();
		hero1.display();
		hero2.display();

		HeroStrength hero3 = new HeroStrength("Ucup");
		hero3.levelUp();
		hero3.display();
	}
}
