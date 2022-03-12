public class Switch {
    public static void main(String[] args) {
        // Switch Statement
        var nilai = "B";
        switch (nilai){
            case "A":
                System.out.println("Nilai A");
                break;
            case "B":
                System.out.println("Nilai B");
                break;
            case "C":
            case "D":
                System.out.println("Nilai C & D");
                break;
            default:
                System.out.println("Salah Memasukkan Nilai");
                break;

            }

        // Switch Lambda
        var lulus = nilai;
        switch (lulus) {
            case "A" -> System.out.println("Anda Lulus");
            case "B" -> System.out.println("Anda Lulus");
            case "C", "D" -> System.out.println("Gagal");
            default -> {
                System.out.println("Salah Memasukkan Nilai");
            }
        }

        // Yield
        String ucapan;
        ucapan = switch (lulus) {
            case "A": 
                yield "Anda Lulus";
            case "B": 
                yield "Anda Lulus";
            case "C", "D": 
                yield "Gagal";
            default: 
                yield "Salah Memasukkan Nilai";
        };
        System.out.println(ucapan);
    }
}
