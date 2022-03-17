package PackageJava.app;

import PackageJava.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {
        
        // Anonymous Class
        HelloWorld english = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override
            public void sayHello(String name) {
               System.out.println("Hello " + name);
            }
        };

        english.sayHello();
        english.sayHello("Gustut");

        // 2
        HelloWorld indonesia = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Halo");
            }

            @Override
            public void sayHello(String name) {
               System.out.println("Halo " + name);
            }
        };

        indonesia.sayHello();
        indonesia.sayHello("Gustut");
    }
}
