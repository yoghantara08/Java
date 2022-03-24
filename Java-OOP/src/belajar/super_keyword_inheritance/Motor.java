package belajar.super_keyword_inheritance;

public class Motor extends Kendaraan{
    String name = "Class Motor";
    int roda = 2;

    void display(){
        System.out.println(this.name);
        System.out.println("Super Keyword Roda : " + super.roda);
        this.setRoda(20);
        System.out.println("ini adalah set roda di this : " + this.roda);
    }

    int setRoda(int roda){
        return this.roda = roda;
    }
}
