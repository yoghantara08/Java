import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class BufferedCharStream {
    public static void main(String[] args) throws IOException{

        // Membaca file
        FileReader fileInput = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);
        bufferedReader.mark(500);

        // Membaca kedalam string
        String data = bufferedReader.readLine();
        System.out.println(data);

        // Membaca kedalam char
        bufferedReader.reset(); // reset() berfungsi untuk mereset huruf kedepan lagi
        char[] dataChar = new char[25];
        bufferedReader.read(dataChar, 0, 25);
        System.out.println(Arrays.toString(dataChar));
        
        // Membaca baris
        bufferedReader.reset();
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());

        // Menulis file
        FileWriter fileOutput = new FileWriter("output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileOutput);

        bufferedReader.reset();

        // Baris 1
        String baris1 = bufferedReader.readLine();
        bufferedWriter.write(baris1, 0, baris1.length());
        bufferedWriter.flush();

        // Menambah new line (enter)
        bufferedWriter.newLine();

        // Baris 2
        String baris2 = bufferedReader.readLine();
        bufferedWriter.write(baris2, 0, baris2.length());
        bufferedWriter.flush();

        fileInput.close();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
