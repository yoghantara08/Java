package belajar.encapsulasi;

class Data {
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    public Data(){
        this.intPublic = 0;
        this.intPrivate = 10;
    }

    void display(){
        System.out.println(intPublic);
        System.out.println(intPrivate);
        System.out.println(doublePrivate);
    }

    // getter
    public int getIntPrivate(){
        return this.intPrivate;
    }

    // setter
    public void setDoublePrivate(double value){
        this.doublePrivate = value;
    }
}

class Lingkaran{
    private double diameter;

    Lingkaran(double diameter){
        this.diameter = diameter;
    }

    // setter
    public void setJari2(double jari2){
        this.diameter = jari2 * 2;
    }

    // getter
    public double getJari2(){
        return this.diameter / 2;
    }

    public double getLuas(){
        return 3.14 * diameter * diameter / 4;
    }
}

public class Main {
    public static void main(String[] args) {
        
        Data object = new Data();

        // read and write dengan public
        object.intPublic = 15;
        System.out.println("Public : " + object.intPublic);

        // read only (menggunakan GETTER)
        int angka = object.getIntPrivate();
        System.out.println("Getter : " + angka);

        // write only (menggunakan SETTER)
        object.setDoublePrivate(1.50);

        object.display();

        // getter & setter
        Lingkaran lingkaran = new Lingkaran(5);
        System.out.println("Jari-jari : " + lingkaran.getJari2());
        lingkaran.setJari2(12);
        System.out.println("Jari-jari : " + lingkaran.getJari2());
        System.out.println("Luas : " + lingkaran.getLuas());
    }
}
