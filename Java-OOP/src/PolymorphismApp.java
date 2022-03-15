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
        if (employee instanceof Pegawai){
            Pegawai pegawai = (Pegawai) employee;
            System.out.println("Hello Pegawai " + pegawai.name);
        } else if (employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
