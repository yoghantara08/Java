import java.io.FileInputStream;
import java.io.IOException;

public class IO_Stream {
    public static void main(String[] args) throws IOException{
        
        try (FileInputStream fileInput = new FileInputStream("input.txt")) {
            System.out.println((char)fileInput.read());
            System.out.println((char)fileInput.read());
            System.out.println((char)fileInput.read());
            System.out.println((char)fileInput.read());
            System.out.println((char)fileInput.read());
            System.out.println((char)fileInput.read());
        }
    }
}
