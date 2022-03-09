public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        // Tipe Data Primitif 
        // diawali huruf kecil
        // memiliki default value 0

        // Tipe Data Bukan Primitif (Object)
        // default value null bukan 0
        Integer iniInteger; 
        iniInteger = 200;

        Character C = 'C';
        Byte iniByte = 100;

        System.out.println(iniInteger);
        System.out.println(C);
        System.out.println(iniByte);

        // Konversi
        int age = 10;
        Integer ageObject = age;
        System.out.println(ageObject);

        Integer iniObject = 200;
        short iniShort = iniObject.shortValue();
        System.out.println(iniShort);
    }
}
