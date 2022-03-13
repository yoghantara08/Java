class Manager_Inheritance {
    String name;
    String company;

    void sayHello(String name){
        System.out.println("Hi " + name + ", Saya Manager " + this.name);
    }
    
    // Constructor 
    Manager_Inheritance(String name){
        this.name = name;
    }
    Manager_Inheritance(String name, String company){
        this.name = name;
        this.company = company;
    }
}

// Bisa buat file berbeda
class Pegawai extends Manager_Inheritance {
    // Class Child harus memanggil satu constructor (yg ada parameter)
    // Class child tidak perlu memanggil constructor jika di class parent mendeklarasikan default constructor
    Pegawai(String name) {
        super(name);
    }

    // Method Overriding
    void sayHello(String name){
        System.out.println("Hallo " + name + ", Saya Pegawai " + this.name);
    }
}