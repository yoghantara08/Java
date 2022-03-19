import java.util.Arrays;

public class ArrayLatihan {
    public static void main(String[] args) {
        int[] arrayAngka1 = {2,5,6,1,3,7,4};
        int[] arrayAngka2 = {1,0,7,8,4,6,3};
        int[] arrayAngka3 = {50,24,64,2,50,42,7,48,22,1,9,17,30};
        int[] arrayAngka4 = {20,50,40,30,10,15,25,70,60,75,5};

        // 1. Menggabungkan dua buah array
        int[] arrayHasil = new int[arrayAngka1.length + arrayAngka2.length];
        
        // Menambahkan Array pertama ke array baru
        for(int i = 0; i < arrayAngka1.length; i++){
            arrayHasil[i] = arrayAngka1[i];
        }
        // Menambahkan Array kedua setelah menambahkan array pertama
        for(int i = 0; i < arrayAngka2.length; i++){
            arrayHasil[i + arrayAngka1.length] = arrayAngka2[i];
        }
        printArray(arrayAngka1, "Array 1");
        printArray(arrayAngka2,"Array 2");
        printArray(arrayHasil,"Array Hasil tambah");

        // 2. Sorting reverse
        // Sort dahulu lalu balikkan array
        printArray(arrayAngka3, "Array 3");
        reverseArray1(arrayAngka3);
        printArray(arrayAngka3, "Reversed 1");
        
        printArray(arrayAngka4, "Array 4");
        reverseArray2(arrayAngka4);
        printArray(arrayAngka4, "Reversed 2");
    }

    // Method Membalikkan Array
    private static void reverseArray1(int[] dataArray){
        // Sort data array
        Arrays.sort(dataArray);
        printArray(dataArray, "Sorted");
        // Buat array buffer (copyOf)
        int[] arrayBuffer = Arrays.copyOf(dataArray, dataArray.length);
        // Reverse Array
        for(int i = 0; i < dataArray.length; i++){
            dataArray[i] = arrayBuffer[(arrayBuffer.length - 1) - i];
        }
    }
    private static void reverseArray2(int[] dataArray){
        Arrays.sort(dataArray);
        printArray(dataArray, "Sorted");
        int buffer;

        for(int i = 0; i < dataArray.length / 2; i++){
            buffer = dataArray[i];
            dataArray[i] = dataArray[(dataArray.length - 1) - i];
            dataArray[(dataArray.length - 1) - i] = buffer;
        }
    }

    private static void printArray(int[] dataArray, String message){
        System.out.println(message + ": " + Arrays.toString(dataArray));
    }
}
