public class Operator {
    public static void main(String[] args) {
        // Operasi Matematika
        int a = 20;
        int b = 12;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Augmented Assignment (Operasi ke dirinya sendiri dan assign nilai)
        int c = 10;

        System.out.println("Augmented Assignment");
        System.out.println(c += 10);
        System.out.println(c -= 10);
        System.out.println(c *= 10);
        System.out.println(c /= 10);
        System.out.println(c %= 10);

        // Unary Operator
        int d = 15;
        int e = -10;
        
        d++;
        e--;

        System.out.println("Unnary Operator");
        System.out.println(d);  
        System.out.println(e);
        System.out.println(!true);


    }
}
