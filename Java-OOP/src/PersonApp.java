public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person();
        Person person2 = new Person();
        Person person3;
        person3 = new Person();
        
        // Manipulasi Field
        person1.name = "Gustut";
        person1.address = "Bali";
        // person1.country = "Jakarta"; // Error Karena Final (Const)

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        
        
        System.out.println(person2);
        System.out.println(person3);
    }
    
}
