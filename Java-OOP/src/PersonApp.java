public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Tes", "Foo");
        Person person2 = new Person("Yoghantara", "Denpasar");
        // Person person3;
        // person3 = new Person();

        // Manipulasi Field
        person1.name = "Gustut";
        person1.address = "Bali";
        // person1.country = "Jakarta"; // Error Karena Final (Const)

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        // Method
        person1.sayHello("Budi");
        person2.sayHello("Galang");

    }
    
}
