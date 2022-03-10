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
    }
}
