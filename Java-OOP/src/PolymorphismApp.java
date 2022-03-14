public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Yoghantara");
        employee.sayHello("Galang");

        employee = new Manager("Gustut");
        employee.sayHello("Ricky");

        employee = new Pegawai("Bagus");
        employee.sayHello("Krisdit");

        sayHello(new Employee("Ketut"));
        sayHello(new Manager("Ida"));
        sayHello(new Pegawai("Rama"));
    }

    static void sayHello(Employee employee){
        System.out.println("Hello " + employee.name);
    }
}
