package Number;

public class KonversiNumber{

    public static void main(String[] args) {
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