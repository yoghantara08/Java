package PackageJava.app;

import PackageJava.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        
        Company company = new Company();
        company.setName("Grya Batan Poh");

        Company.Employee employee = company.new Employee();
        employee.setName("Gustut");

        System.out.println(company.getName());
        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        // Company 2
        Company company2 = new Company();
        company2.setName("Flexa");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Yoghantara");

        System.out.println(company2.getName());
        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());
    }
}
