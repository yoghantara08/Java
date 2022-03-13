class Person {
    // Field
    String name;
    String address;
    final String country = "Indonesia";

    // Method
    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", Nama saya " + name);
    }
}
