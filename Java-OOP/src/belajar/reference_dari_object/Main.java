package belajar.reference_dari_object;

class Buku {
    String judul;
    String penulis;

    Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }

    void display(){
        System.out.println("Judul   : " + judul);
        System.out.println("Penulis : " + penulis);
    }
}


public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Filosofi Teras", "Tono");
        buku1.display();

        // Menampilkan address
        String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressBuku1);
        
        // Assigment object
        Buku buku2 = buku1; // membuat reference kedua variable menunjuk ke object / reference yg sama
        buku2.display();
        
        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressBuku2);

        // Karena buku1 dan buku2 berada pada address / reference yang sama
        buku1.judul = "Stoicism";
        buku1.display();
        buku2.display();

        // memasukkan object kedalam method 
        fungsi(buku2); // reference juga sama
        buku1.display();
        buku2.display();
    }

    public static void fungsi(Buku dataBuku){
        String address = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println(address);
        dataBuku.penulis = "Rojer";
    }
}
