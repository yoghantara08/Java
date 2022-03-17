package PackageJava.app;

import PackageJava.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();
        System.out.println(category.getId());
        System.out.println(category.isExpensive());

        category.setId("ID");
        System.out.println(category.getId());
        category.setExpensive(true);
        System.out.println(category.isExpensive());
    }
}
