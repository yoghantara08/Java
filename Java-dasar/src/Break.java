public class Break {
    public static void main(String[] args) {
        var nilai = 1;
        while(true){
            System.out.println(nilai);
            nilai++;

            if (nilai > 10){
                break;
            }
        }
        System.out.println("Berhenti");
    }
}
