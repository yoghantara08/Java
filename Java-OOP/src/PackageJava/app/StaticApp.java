package PackageJava.app;

// Static Import
// Tidak perlu menuliskan class di depannya
import static PackageJava.data.Application.PROCESSORS;
import static PackageJava.data.Constant.*;
import PackageJava.data.Country;
import PackageJava.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(MathUtil.sum(1,2,3,5,6,7,8,9,10));

        Country.City city = new Country.City();
        city.setName("Denpasar");

        System.out.println(city.getName());

        System.out.println(PROCESSORS);
    }
}
