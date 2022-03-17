package PackageJava.data;

class SocialMedia {
    String name;

    // Tidak bisa dioverride class child
    final void login(String username, String password){

    }
}

// Tidak bisa di turunkan lagi
final class Facebook extends SocialMedia {
    
}

// ERROR 
// class FakeFacebook extends Facebook{

// }