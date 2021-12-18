import java.util.Scanner;
public class UTS_200030184 {
    private static String next;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double meter, inch, foot, yard;

        System.out.println("APLIKASI KONVERSI JARAK");
        System.out.println("=======================");
        System.out.println("1. Meter --> Inch");
        System.out.println("2. Meter --> Foot");
        System.out.println("3. Meter --> Yard");
        System.out.println("4. Inch  --> Meter");
        System.out.println("5. Foot  --> Meter");
        System.out.println("6. Yard  --> Meter");
        System.out.println("7. Exit");
        System.out.println("Pilih menu : ");
        String menu = input.nextLine();

        switch (menu){
            case "1":
                System.out.print("Masukkan Meter : ");
                meter = input.nextDouble();
                double nMeterToInch = getMeterToInch(39.3701, meter);
                System.out.println("Jarak dalam Inch : " + nMeterToInch);
                break;

            case "2":
                System.out.print("Masukkan Meter : ");
                meter = input.nextDouble();
                double nMeterToFoot = getMeterToFoot(3.28084, meter);
                System.out.println("Jarak dalam Foot : " + nMeterToFoot);
                break;

            case "3":
                System.out.print("Masukkan Meter : ");
                meter = input.nextDouble();
                double nMeterToYard = getMeterToYard(1.09361, meter);
                System.out.println("Jarak dalam Yard : " + nMeterToYard);
                break;

            case "4":
                System.out.print("Masukkan Inch : ");
                inch = input.nextDouble();
                double nInchToMeter = getInchToMeter(inch, 39.3701);
                System.out.println("Jarak dalam Meter : " + nInchToMeter);
                break;

            case "5":
                System.out.print("Masukkan Foot : ");
                foot = input.nextDouble();
                double nFootToMeter = getFootToMeter(foot, 3.28084);
                System.out.println("Jarak dalam Meter : " + nFootToMeter);
                break;

            case "6":
                System.out.print("Masukkan Yard : ");
                yard = input.nextDouble();
                double nYardToFoot = getYardToMeter(yard, 1.09361);
                System.out.println("Jarak dalam Meter : " + nYardToFoot);
                break;

            case "7":
                System.out.println("Terimakasih");
            } 
        }
        static double getMeterToInch(double inch, double meter){
            double MeterToInch = inch * meter;
            return MeterToInch;
        }
        static double getMeterToFoot(double foot, double meter){
            double MeterToFoot = foot * meter;
            return MeterToFoot;
        }
        static double getMeterToYard(double yard, double meter){
            double MeterToYard = yard * meter;
            return MeterToYard;
        }
        static double getInchToMeter(double inch, double meter){
            double InchToMeter = inch / meter;
            return InchToMeter;
        }
        static double getFootToMeter(double foot, double meter){
            double FootToMeter = foot / meter;
            return FootToMeter;
        }
        static double getYardToMeter(double yard, double meter){
            double YardToMeter = yard / meter;
            return YardToMeter;
        }  
}

