import java.util.Scanner;

public class ScannerInputUser {
    public static void main(String[] args) {
        int panjang, lebar, luas, tinggi, volume;
        
        try (Scanner userInput = new Scanner(System.in)) {
            // Luas
            System.out.println("Menghitung Luas");
            System.out.print("Panjang: ");
            panjang = userInput.nextInt();
            System.out.print("Lebar: ");
            lebar = userInput.nextInt();

            // Hasil Luas
            luas = panjang * lebar;
            System.out.println("Luas = " + luas);

            // Volume
            System.out.println("Menghitung Volume");
            System.out.print("Tinggi: ");
            tinggi = userInput.nextInt();

            // Hasil Volume
            volume = luas * tinggi;
            System.out.println("Volume = " + volume);
        }       
    }   
}
