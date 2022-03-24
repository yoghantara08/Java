package belajar.inheritance_final_public_private;

public class Hero {
    public String name;
    private double health;

    Hero(String name, double health){
        this.name = name;
        this.health = health;
    }

    // getter
    public double getHealth(){
        return this.health;
    }

    // setter
    final void setHealth(double health){
        this.health = health;
    }

    // bisa di overload
    final void setHealth(String mode){
        if(mode.equals("reset")){
            this.health = 100;
        }
    }

    public void display(){
        System.out.println("\nName    : " + this.name);
        System.out.println("Health  : " + this.health);
    }
}
