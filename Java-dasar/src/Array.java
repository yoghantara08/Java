import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // Manual (Jumlah array harus ditentukan)
        String[] arrayString;
        arrayString = new String[2];
        arrayString[0] = "Gustut";
        arrayString[1] = "Yoghantara";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        
        String[] arrayString2 = new String[4];
        arrayString2[0] = "Tes";

        // Array Initializer (Otomatis menghitung panjang array)
        // 1.
        int[] arrayInt = new int[] {
            1,2,3,4,5
        };
        // 2.
        int[] arrayInt2 = {
            2,4,6,8
        };

        System.out.println(arrayInt[2]);
        System.out.println(arrayInt2[1]);

        // Operasi di Array
        // 1. Mengambil data array
        // array[index]

        // 2. Mengubah data array
        // array[index] = value

        // 3. Mengambil panjang array
        int[] arr = {
            1,5,6,2,6,8,2,4
        };
        System.out.println("Panjang Array: " + arr.length);

        // Nested Array
        int[][] nomor = {
            {1,2,3,4,5},
            {2,4,6,8},
            {1,3,5},
        };

        System.out.println(nomor[1][2]);

        // 4. Mengcopy array
        int[] arrayAngka1 = { 1, 2, 3, 4, 5};
        int[] arrayAngka2 = new int[5];

        System.out.println("Array sebelum di copy");
        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);
        printArray(arrayAngka1);
        printArray(arrayAngka2); // reference beda

        for(int i = 0; i < arrayAngka1.length; i++){
            arrayAngka2[i] = arrayAngka1[i];
        }

        System.out.println("Array sesudah di copy");
        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2); // reference beda
        printArray(arrayAngka1);
        printArray(arrayAngka2);

        // 5. copyOf
        // mengcopy dan menentukan panjang arraynya
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1, 5); 
        System.out.println(arrayAngka3); // reference beda
        printArray(arrayAngka3);

        // 6. copyOfRange
        // mencopy dari range
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1, 2, 5);
        System.out.println(arrayAngka4); // reference beda
        printArray(arrayAngka4);

        // 7. Fill Array
        // mengisi array dengan value yang sama
        int[] arrayAngka5 = new int[5];
        printArray(arrayAngka5);

        Arrays.fill(arrayAngka5, 1); // semua isi array berisikan 1
        printArray(arrayAngka5);

        // 8. Komparasi Array
        // Membandingkan dua buah array, untuk percabangan
        int[] arrayAngka6 = {1,2,3,4,5};
        int[] arrayAngka7 = {1,2,3,4,5,6};
        if(Arrays.equals(arrayAngka6, arrayAngka7)){
            System.out.println("SAMA");
        } else {
            System.out.println("BEDA");
        }

        // 9. Membandingkan array yang lebih besar
        System.out.println(Arrays.compare(arrayAngka6, arrayAngka7));

        // 10. Membandingkan index yang berbeda // yang pertama kali ketemu
        System.out.println(Arrays.mismatch(arrayAngka6, arrayAngka7));

        // 11. Sort array
        int[] arrayAngka8 = {1,6,3,2,7,4,7,9};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);

        // 12. Search array
        int angka = 3;
        int posisi = Arrays.binarySearch(arrayAngka8, angka);
        System.out.println("Angka ketemu di index ke: " + posisi);
    }

    private static void printArray(int[] dataArray) {
        System.out.println(Arrays.toString(dataArray));
    }
}
