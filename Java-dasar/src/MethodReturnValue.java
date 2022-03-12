public class MethodReturnValue {
    public static void main(String[] args) {
        var hasilSum = sum(10, 20);
        System.out.println(hasilSum);
        System.out.println(sum(20,50));

        System.out.println(hitung(55, "+", 35));
        System.out.println(hitung(20, "-", 50));
    }

    static int sum(int value1, int value2){
        var total = value1 + value2;
        return total;
    }

    static int hitung(int value1, String operasi, int value2){
        switch(operasi){
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }
}
