package belajar.super_keyword_inheritance;

public class Mobil extends Kendaraan{
    String name = "Class Mobil";
    int roda = 4;

    void display(){
        System.out.println("Super Keyword Name : " + super.name);
        this.setRoda(55); // karena di this tidak ada, maka cari ke super
        System.out.println("Roda : " + super.roda);
    }
}
