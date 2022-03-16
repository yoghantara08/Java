package PackageJava.app;

import PackageJava.data.City;


public class LocationApp {
    public static void main(String[] args) {
        // var location = new Location(); // ERR karena abstract

        var city = new City();
        city.name = "Denpasar";

        System.out.println(city.name);
    }
}
