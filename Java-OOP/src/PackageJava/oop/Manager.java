package PackageJava.oop;

class Manager extends Employee{
    String company;
    
    // Constructor 
    Manager(String name){
        super(name);
    }
    Manager(String name, String company){
        super(name);
        this.company = company;
    }

    @Override
    void sayHello(String name){
        System.out.println("Hi " + name + ", Saya Manager " + this.name);
    }
}

// Bisa buat di file yang berbeda
class Pegawai extends Manager {
    // Class Child harus memanggil satu constructor (yg ada parameter)
    // Class child tidak perlu memanggil constructor jika di class parent mendeklarasikan default constructor
    Pegawai(String name) {
        super(name);
    }

    // Method Overriding
    @Override
    void sayHello(String name){
        System.out.println("Hallo " + name + ", Saya Pegawai " + this.name);
    }
}