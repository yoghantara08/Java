package belajar.super_keyword_inheritance;

public class Kendaraan {
    String name = "Class Kendaraan";
    int roda = 5;

    int setRoda(int roda){
       return this.roda = roda;
    }

    void display(){
        System.out.println(this.name);
        System.out.println("Roda : " + this.roda);
    }
}
