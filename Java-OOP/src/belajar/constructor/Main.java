package belajar.constructor;


// class dengan constructor
class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;
    
    Mahasiswa(String inputNama,String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}

public class Main {
    public static void main(String[] args) {
       
        Mahasiswa mahasiswa1 = new Mahasiswa("Gustut","200030184","Sistem informasi");
        System.out.println(mahasiswa1);

        Mahasiswa mahasiswa2 = new Mahasiswa("Yoghantara","23213123","Teknik Informatika");
        System.out.println(mahasiswa2);

    }
}