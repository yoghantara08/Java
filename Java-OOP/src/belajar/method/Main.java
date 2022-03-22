package belajar.method;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Gustut", "201303");
        System.out.println(mahasiswa1.nama);
        
        mahasiswa1.show();
        mahasiswa1.setNama("Yoghantara");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String halo = mahasiswa1.sayHi("Halo");
        System.out.println(halo);
        
    }
}

class Mahasiswa {
    // Data member
    String nama;
    String NIM;
    
    // constructor
    Mahasiswa(String nama,String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }

    // 1. method tanpa return dan parameter
    void show(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM  : " + this.NIM);
    }

    // 2. method tanpa return dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }

    // 3. method dengan return tanpa parameter
    String getNama(){
        return this.nama;
    }
    String getNIM(){
        return this.NIM;
    }

    // 4. method dengan return dan parameter
    String sayHi(String massage){
      return massage + " " + this.nama;
    }

}