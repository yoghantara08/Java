package belajar.super_keyword_inheritance;

public class Main {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan();
        Mobil mobil = new Mobil();
        Motor motor = new Motor();

        kendaraan.setRoda(10);
        kendaraan.display();
        mobil.display();
        motor.display();
        
    }
}
