package PackageJava.app;

public class EqualsApp {
    public static void main(String[] args) {
        
        String first = "Gustut";
        first = first + " " + "Yoghantara";
        System.out.println(first);

        String second = "Gustut Yoghantara";
        System.out.println(second);

        // Hasilnya False karena object yang berbeda
        System.out.println(first == second);

        // Membandingkan isi yang sama
        System.out.println(first.equals(second));
    }
}
