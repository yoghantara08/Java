import java.util.Arrays;

public class ArrayPassByReference {
    public static void main(String[] args) {
        
        int[] arrayAngka1 = { 1,2,3,4,5 };
        int[] arrayAngka2 = new int[5];

        // Memory masih berbeda
        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);

        arrayAngka2 = arrayAngka1;
        // Memory menjadi sama
        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);

        System.out.println("Array 1: " + Arrays.toString(arrayAngka1));
        System.out.println("Array 2: " + Arrays.toString(arrayAngka2));

        // Kedua array berubah karena memorynya sama
        arrayAngka1[0] = 100;
        arrayAngka2[4] = 400;
        System.out.println("Array 1: " + Arrays.toString(arrayAngka1));
        System.out.println("Array 2: " + Arrays.toString(arrayAngka2));

        ubahArray(arrayAngka1);
        System.out.println("Array 1: " + Arrays.toString(arrayAngka1));
        System.out.println("Array 2: " + Arrays.toString(arrayAngka2));
    }

    // Method yang argumentnya adalah reference, pass by reference
    // bukan pass by value
    private static void ubahArray(int[] dataArray){
        dataArray[1] = 125;
    }
}
