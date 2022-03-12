public class Continue {
    public static void main(String[] args) {
        for (var nilai = 1; nilai <= 100; nilai++){
            if(nilai % 2 == 0){
                continue;
            }

            System.out.println("Angka Ganjil: " + nilai);
        }
    }
}
