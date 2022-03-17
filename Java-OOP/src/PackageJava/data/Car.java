package PackageJava.data;

public interface Car extends HasBrand{
    // defaultnya sudah public abstract
    // public abstract void drive();
    // Mewajibkan kelas turunan untuk mengoverride method
    void drive();
    
    int getTire();

    default boolean isBig(){
        return false;
    };
}
