package PackageJava.data;

public abstract class Animal {
    public String name;

    // Memaksa class child untuk override abstract method
    // Class child menjadi wajib untuk membuat method ini
    public abstract void run();
}
