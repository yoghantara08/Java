import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
    public static void main(String[] args) throws IOException{
        
        FileInputStream fileInput = null;
        FileOutputStream fileOutput = null;

        // 1. Membaca file ke console
        // Membuka file
        fileInput = new FileInputStream("input2.txt");

        // System.out.println((char)fileInput.read()); // i
        // System.out.println(fileInput.read()); // 110
        // System.out.println(fileInput.read()); // 105

        // Membaca file
        int data = fileInput.read();
        while(data != -1){
            System.out.print((char)data);
            data = fileInput.read();
        }
        
        // Menutup file
        fileInput.close();

        // 2. Try, Finally (Membaca dan menuliskan file ke dalam file output)
        try {
            // Membuka file
            fileInput = new FileInputStream("input3.txt");
            fileOutput = new FileOutputStream("output3.txt");

            // Membaca file
            int buffer = fileInput.read();
            while(buffer != -1){
                // Menulis ke file
                fileOutput.write(buffer);
                // Refresh dan read kata selanjutnya
                buffer = fileInput.read();
            }

        } finally {
            if(fileInput != null){
                fileInput.close();
            }
            if(fileOutput != null){
                fileOutput.close();
            }
        }

        // 3. Try with resources
        try (
            FileInputStream in = new FileInputStream("input.txt");
            FileOutputStream out = new FileOutputStream("output.txt")
            ){
            // Membaca file
            int data2 = in.read();
            while(data2 != -1){
                out.write((char)data2);
                data2 = in.read();
            }
        }

    }
}
