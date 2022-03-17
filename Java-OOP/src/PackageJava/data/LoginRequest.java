package PackageJava.data;

// Parameter langsung berubah jadi field
// Tidak bisa extends class lain
// Hanya bisa implements (extends Interface)
public record LoginRequest(String username, String password) {
    
    public LoginRequest {
        System.out.println("Membuat Object LoginRequest");
    }

    // Method Overloading
    public LoginRequest(String username){
        this(username, "");
    }
    public LoginRequest(){
        this("" , "");
    }
}
