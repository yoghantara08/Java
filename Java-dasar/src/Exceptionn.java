import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exceptionn {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};

        Scanner userInput = new Scanner(System.in);
        FileInputStream fileInput = null;

        System.out.print("Nilai array ke: ");
        int index = userInput.nextInt();
    
        // Exception handling (try, catch)
        System.out.println("Handling out of bound");
        try {
            System.out.printf("Index ke-%d, adalah %d\n", index, array[index]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }

        // runtime error jika file tidak ada
        System.out.println("\nHandling IO not found");
        try {
            fileInput = new FileInputStream("input.txt");
        } catch (IOException e) {
            System.err.println(e);
        }

        // Menggabungkan dua exception
        System.out.println("\nMenggabungkan dua buah exception");
        try {
            System.out.printf("Index ke-%d, adalah %d\n\n", index, array[index]);
            fileInput = new FileInputStream("input.txt");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Index array tidak ada");
        } catch (IOException e){
            System.err.println("File tidak ditemukan");
        }

        // Finally
        System.out.println("\nMenambahkan Finally");
        try {
            System.out.printf("Index ke-%d, adalah %d\n\n", index, array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Index array tidak ada");
        } finally {
            System.out.println("Ini finally");
        }

        System.out.println("Akhir dari program");
    }
}
