import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ScannerStringTokenizer {
    public static void main(String[] args) throws IOException{   
        
        FileReader fileInput = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);

        Scanner scanner = new Scanner(bufferedReader);

        // Untuk mengecek ada kata selanjutnya atau tidak
        System.out.println(scanner.hasNext()); // true

        // Untuk membaca kata, dengan pemisah/delimeter spasi
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        
        // Kalau tidak ada kata lagi maka akan false
        System.out.println(scanner.hasNext());

        // Menggunakan delimiter tertentu
        System.out.println("\nMenggunakan delimiter tertentu");
        FileReader fileInput2 = new FileReader("input2.txt");
        bufferedReader = new BufferedReader(fileInput2);
        bufferedReader.mark(200);

        scanner.close();

        scanner = new Scanner(bufferedReader);
        scanner.useDelimiter(","); // Pemisah dengan ,

        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }

        // Menggunakan String tokenizer
        System.out.println("\nMenggunakan String Tokenizer");
        bufferedReader.reset();

        // Baris 1
        String data = bufferedReader.readLine();
        System.out.println(data);

        StringTokenizer stringToken = new StringTokenizer(data, ",");
        while(stringToken.hasMoreTokens()){
            System.out.println(stringToken.nextToken());
        }

        // baris 2
        data = bufferedReader.readLine();
        System.out.println(data);

        stringToken = new StringTokenizer(data, " " /* delimiter berdasarkan di file input */);
        while(stringToken.hasMoreTokens()){
            System.out.println(stringToken.nextToken());
        }

        scanner.close();
        fileInput.close();
        fileInput2.close();
        bufferedReader.close();
    }
}
