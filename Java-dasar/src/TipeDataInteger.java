public class TipeDataInteger {
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


        System.out.println(iniByte);
        System.out.println(iniShort);
        System.out.println(iniInteger);
        System.out.println(iniLong);
        System.out.println(iniLong2);
        System.out.println(decimalInt);
        System.out.println(hexaDecimal);
        System.out.println(binaryDecimal);
        System.out.println(balance);
        System.out.println(sum);
    }
}
