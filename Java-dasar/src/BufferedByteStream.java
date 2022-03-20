import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedByteStream {
    public static void main(String[] args) throws IOException{
        
        long waktuStart, waktuFinish;
        
        // 1. Membaca dari file
        System.out.println("Membaca dari file");
        FileInputStream fileInput = new FileInputStream("input.txt");
        System.out.println(fileInput.available());

        // Menghitung waktu pembacaan
        waktuStart = System.nanoTime();
        System.out.println(fileInput.readAllBytes());
        waktuFinish = System.nanoTime();
        System.out.println("Waktu = " + (waktuFinish - waktuStart));
        fileInput.close();

        // 2. Membaca dari memory
        System.out.println("\nMembaca dari memory");
        FileInputStream byteInput = new FileInputStream("input.txt");
        BufferedInputStream bufferedInput = new BufferedInputStream(byteInput);

        bufferedInput.mark(500); // limit untuk dibaca
        // Mengitung waktu pembacaan
        waktuStart = System.nanoTime();
        System.out.println(bufferedInput.readAllBytes());
        waktuFinish = System.nanoTime();
        System.out.println("Waktu = " + (waktuFinish - waktuStart));
        
        // Baca ulang
        bufferedInput.reset();
        byte[] data = bufferedInput.readAllBytes();
        String dataString = new String(data);
        System.out.println(dataString);

        byteInput.close();
        bufferedInput.close();

        // 3. Menulis dengan buffered output
        FileOutputStream byteOutput = new FileOutputStream("output.txt");
        BufferedOutputStream bufferedOutput = new BufferedOutputStream(byteOutput);

        // Write data berupa byte
        bufferedOutput.write(data, 0, data.length);
        bufferedOutput.flush();

        byteOutput.close();
        bufferedOutput.close();
    }
}
