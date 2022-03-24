package belajar.latihan_inheritance;

public class HeroIntelligent extends Hero{
    String type = "Intelligent";

    HeroIntelligent(String nameInput, double attackInput, double healthInput) {
        super(nameInput, attackInput, healthInput);
    }
    
    @Override
    void display(){
        super.display();
        System.out.println("Type   : " + this.type);
    }
    
    @Override
    void takeDamage(double damage){
        System.out.println(this.name + " receive double damage " + damage + " --> " + damage * 2 );
        this.health -= damage * 2;
    }
}
