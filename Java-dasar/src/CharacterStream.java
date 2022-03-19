import java.io.*;

public class CharacterStream {
    public static void main(String[] args) throws IOException{

        // 1. Membuka file
        // byte stream -> FileInputStream
        // Character stream -> FileReader
        FileInputStream byteFileInput = new FileInputStream("character.txt");
        FileReader charFileInput = new FileReader("character.txt");

        FileOutputStream byteFileOutput = new FileOutputStream("outputByte.txt");
        FileWriter charFileOutput = new FileWriter("outputChar.txt");

        // 2. Membaca file

        // Byte file
        System.out.println("Byte File");
        int buffer = byteFileInput.read();
        while(buffer != -1){
            // Menulis file
            System.out.print((char)buffer);
            byteFileOutput.write(buffer);
            buffer = byteFileInput.read();
        }
        
        // Char file
        System.out.println("\nChar File");
        buffer = charFileInput.read();
        while(buffer != -1){
            // Menulis file
            System.out.print((char)buffer);
            charFileOutput.write(buffer);
            buffer = charFileInput.read();
        }

        // 3. Menutup file
        byteFileInput.close();
        charFileInput.close();
        byteFileOutput.close();
        charFileOutput.close();
        
    }
}
