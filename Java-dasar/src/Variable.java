public class Variable {
    public static void main(String[] args) {
        // dapat di deklarasi tanpa diisi value
        String nama;
        nama = "Gustut Yoghantara";

        // dapat di deklarasi langsung diisi value
        int umur = 30;
        
        System.out.println(nama);
        System.out.println(umur);

        // Override Variable
        nama = "Ricky Tegar";
        System.out.println(nama);

        // Kata kunci var (otomatis mendeteksi tipe data)
        var name = "Yoghantara";
        var age = 20;
        var benar = true;

        System.out.println(name);
        System.out.println(age);
        System.out.println(benar);

        // var yg tidak boleh / error
        // var company;
        // company = "Amazon";

        // Kata kunci Final (sama kyk const di js) tidak bisa diubah
        final String namaPanjang = "Ida Bagus Ketut Yoghantara"; 
        System.out.println(namaPanjang);
    }
}
