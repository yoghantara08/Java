package belajar.protected_keyword.Hero;

public abstract class Hero {
  protected String name; // hanya bisa diakses subclass dari hero
  private int level;

  public Hero(String name) {
    this.name = name;
    this.level = 1;
  }

  public abstract void display();

  protected String getName(){
    String str = "name: " + this.name + '-' + this.level;
    return str;
  }

  protected void setName(String name){
    this.name = name;
  }
}
