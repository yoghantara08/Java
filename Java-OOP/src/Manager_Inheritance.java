class Manager_Inheritance {
    String name;

    void sayHello(String name){
        System.out.println("Hi " + name + ", Saya Manager " + this.name);
    }
    
}

// Bisa buat file berbeda
class Pegawai extends Manager_Inheritance {
    // Method Overriding
    void sayHello(String name){
        System.out.println("Hallo " + name + ", Saya Pegawai " + this.name);
    }
}