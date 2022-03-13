class Person {
    // Field
    String name;
    String address;
    int age;
    final String country = "Indonesia";

    // Constructor
    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
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
    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", Nama saya " + name);
    }
    
}
