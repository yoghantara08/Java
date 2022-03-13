class Person {
    // Field
    String name;
    String address;
    int age;
    final String country = "Indonesia";

    // Constructor
    // Kalau parameter namanya sama kyk field (Variable Shadowing) itu akan menutupi akses ke Field
    // Pakai keyword this jika parameter dan nama field sama untuk mengakses ke field
    Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    // Constructor Overloading (Tipe parameter harus beda dan jumlah param berbeda)
    Person(){
        this(null);
    }
    Person(String paramName){
        this(paramName, null);
    }
    Person(int paramAge){
        age = paramAge;
    }

    // Method
    void sayHello(String name){
        System.out.println("Hello " + name + ", Nama saya " + this.name);
    }
    
}
