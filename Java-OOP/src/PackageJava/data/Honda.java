package PackageJava.data;

public class Honda implements Car{

    public void drive() {
        System.out.println("Honda drive");
    }

    public int getTire() {
        return 4;
    }

    public String getBrand() {
        return "Brio";
    }
    
    public boolean isBig() {
        return true;
    }
}
