package PackageJava.app;

import PackageJava.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        
        // Tidak direkomendasikan untuk menggunakan Try Catch
        connectDatabase("Gustut", null);
        System.out.println("Sukses");

    }

    public static void connectDatabase(String username, String password){
        if(username == null || password == null){
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
}
