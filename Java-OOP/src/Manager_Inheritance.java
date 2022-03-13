class Manager_Inheritence {
    String name;

    void sayHello(String name){
        System.out.println("Hi " + name + ", Nama Saya " + this.name);
    }
    
}

// Bisa buat file berbeda
class Pegawai extends Manager_Inheritence {

}