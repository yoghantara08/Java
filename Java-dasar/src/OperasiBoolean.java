public class OperasiBoolean {
    public static void main(String[] args) {
        // && (AND) harus true keduanya untuk hasilnya true
        // || (OR) cukup satu true untuk hasilnya true
        // ! (Negation) Membalikan true ke false dan sebaliknya

        var absen = 60;
        var UAS = 80;

        var lulusAbsen = absen >= 70;
        var lulusUas = UAS >= 75;

        var lulus = lulusAbsen && lulusUas;
        System.out.println(lulus);
        
        if (lulus == true) {
            System.out.println("Anda LULUS!");
        } else {
            System.out.println("Anda TIDAK LULUS!");
        }
    }
}
