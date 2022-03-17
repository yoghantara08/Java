package PackageJava.data;

// Outer Class
public class Company {
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    // Inner Class
    public class Employee {

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        
        // Keuntungan Inner Class
        // Dapat mengakses outer class
        public String getCompany(){
            return Company.this.getName(); // atau .name
        }
    }
}
