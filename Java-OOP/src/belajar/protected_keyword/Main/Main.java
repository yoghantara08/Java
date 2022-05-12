package belajar.protected_keyword.Main;

import belajar.protected_keyword.Hero.HeroStrength;

public class Main {
  public static void main(String[] args) {
    
    HeroStrength hero1 = new HeroStrength("Gustut");
  
    hero1.display();

    hero1.setName("Yoghantara");

    hero1.display();
  }
}
