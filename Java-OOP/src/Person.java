class Person {
    // Field
    String name;
    String address;
    final String country = "Indonesia";

    // Constructor
    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

    // Method
    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", Nama saya " + name);
    }
    
}
