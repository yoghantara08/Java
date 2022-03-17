package PackageJava.app;

import PackageJava.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Gustut", "Password");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Gustut"));
        System.out.println(new LoginRequest("Yoghantara", "Rahasia"));
    }
}
