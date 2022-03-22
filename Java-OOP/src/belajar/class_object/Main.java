package belajar.class_object;

public class Main {
    public static void main(String[] args) {
      
      // Instansiasi / membuat object
      Mahasiswa mahasiswa1 = new Mahasiswa();
      mahasiswa1.nama = "Gustut";
      mahasiswa1.NIM = "200030184";
      mahasiswa1.jurusan = "Sistem Informasi";
      mahasiswa1.IPK = 3.75;
      mahasiswa1.umur = 20;

      System.out.println(mahasiswa1.nama);
      System.out.println(mahasiswa1.NIM);
      System.out.println(mahasiswa1.jurusan);
      System.out.println(mahasiswa1.IPK);
      System.out.println(mahasiswa1.umur);

    }
}

// membuat class sebagai template
class Mahasiswa {
  String nama;
  String NIM;
  String jurusan;
  double IPK;
  int umur;
}