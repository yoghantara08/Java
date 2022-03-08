package Number;

public class Integer {

    public static void main(String[] args) throws Exception {
        // integer
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInteger = 1000000;
        long iniLong = 1000000;
        long iniLong2 = 1000000L; // L = Long

        // Kode : Literals
        int decimalInt = 25;
        int hexaDecimal = 0xA132B; // 0x
        int binaryDecimal = 0b01010101; // 0b

        // Kode : Underscore
        long balance = 1_000_000_000L;
        int sum = 60_000_000;

        // Konversi Tipe Data Number
        // Widening Casting (Otomatis): byte -> short -> int -> long -> float -> double
        byte Byte = 10;
        short Short = Byte;
        int Int = Short;
        long Long = Int;
        float Float = Long;
        double Double = Float;

        // Narrowing Casting (Manual): double -> float -> long -> int -> short -> byte
        float Float2 = (float) Double;
        long Long2 = (long) Float2;
        int Int2 = (int) Long2;
        short Short2 = (short) Int2;
        byte Byte2 = (byte) Short2;

    }
    
}