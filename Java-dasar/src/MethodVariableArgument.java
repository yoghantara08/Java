public class MethodVariableArgument {
    public static void main(String[] args) {
        // Menggunakan Array
        int[] values = {80,80,69,75};
        sayCongrats("Gustut ", values);

        // Variable Arguments
        sayCongrats("Yoghantara", 80,60,90,100,20,80);
    }

    static void sayCongrats(String name, int... values){
        var total = 0;
        for(var value : values){
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat " + name + "Anda Lulus");
        } else {
            System.out.println("Maaf " + name + "Anda Tidak Lulus");
        }
    }
}
