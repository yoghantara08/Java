import java.util.Scanner;

public class ExceptionMethod {
    public static void main(String[] args) {
        // Merantaikan Exception

        int[] arrayData = {2,5,4,10};
        try (Scanner userInput = new Scanner(System.in)) {
            System.out.print("Data ke: ");
            int indexInput = userInput.nextInt();

            // Exception biasa
            System.out.println("Exception Biasa");
            try {
                System.out.printf("Data dari array ke-%d adalah %d\n", indexInput, arrayData[indexInput]);
            } catch (Exception e) {
                System.err.println(e);
            }

            // Exception di dalam Method / Function
            System.out.println("\nException di dalam Method");
            int data = ambilDataDariArray(arrayData, indexInput);
            System.out.printf("Data dari array ke-%d adalah %d\n\n", indexInput, data);

            // Exception throws by method
            System.out.println("Exception throws by Method");
            int data2 = 0;
            try {
                data2 = ambilData(arrayData, indexInput);
            } catch (Exception e) {
                System.err.println(e);
            }
            System.out.printf("Data dari array ke-%d adalah %d\n\n", indexInput, data2);
        }

        System.out.println("Akhir dari program");
    }

    // Exception throws by method
    private static int ambilData(int[] array, int index) throws Exception {
        int hasil = array[index];
        return hasil;
    }

    // Exception di dalam Method / Function
    private static int ambilDataDariArray(int[] array, int index){
        int hasil = 0;
        try {
            hasil = array[index];
        } catch (Exception e) {
            System.err.println(e);
        }

        return hasil;
    }

}
