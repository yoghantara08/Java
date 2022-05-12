package belajar.protected_keyword.Hero;

public class HeroStrength extends Hero{

  public HeroStrength(String name) {
    super(name);
  }

  public void display(){
    System.out.println("name: " + this.name);
  }
  
  public void setName(String name){
    super.setName(name);
  }
}
