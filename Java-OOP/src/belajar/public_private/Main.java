package belajar.public_private;

class Mahasiswa {
    String name; // default, bisa diakses diluar class
    public int umur; // public, bisa diakses diluar class
    private String NIM; // private, hanya bisa diakses didalam class
    private int kehadiran;

    Mahasiswa(String name,int umur,String NIM){
        this.name = name;
        this.umur = umur;
        this.NIM = NIM;

    }

    // default modifier access
    void display(){
        hadir(); // contoh akses method private
        System.out.println("\nNama      : " + this.name);
        System.out.println("Umur      : " + this.umur);
        System.out.println("NIM       : " + this.NIM); // bisa diakses
        System.out.println("Kehadiran : " + this.kehadiran);
    }

    // public
    public void ubahNama(String newName){
        this.name = newName;
    }

    // private
    private void hadir(){
        this.kehadiran += 1;
    }
}

public class Main {
    public static void main(String[] args) {

        Mahasiswa mahasiswa1 = new Mahasiswa("Rama",20,"201340067");

        // default
        System.out.println(mahasiswa1.name); // membaca data
        mahasiswa1.name = "Ricky"; // menulis data
        System.out.println(mahasiswa1.name); // membaca data

        // public
        System.out.println(mahasiswa1.umur); // membaca data
        mahasiswa1.umur = 21; // menulis data
        System.out.println(mahasiswa1.umur); // membaca data

        // private (tidak bisa diakses)
        // System.out.println(mahasiswa1.NIM); // membaca data
        // mahasiswa1.NIM = "20023023"; // menulis data
        // System.out.println(mahasiswa1.NIM); // membaca data

        // methods

        // default
        mahasiswa1.display();

        // public
        mahasiswa1.ubahNama("Galang");
        mahasiswa1.display();

        // private (tidak bisa diakses)
        // mahasiswa1.ubahNIM("202130213");
        
    }
}
