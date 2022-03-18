package PackageJava.app;

import PackageJava.data.LoginRequest;
import PackageJava.error.ValidationException;
import PackageJava.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) throws ValidationException {

        // ERROR
        // LoginRequest loginRequest = new LoginRequest(null, "");
        // Valid
        LoginRequest loginRequest = new LoginRequest("Gustut", "Pass");

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid"); 
        } catch (ValidationException | NullPointerException err) {
            System.out.println("Data tidak valid : " + err.getMessage());
        } finally {
            System.out.println("Finally selalu di eksekusi");
        }
        
        // try {
        //     ValidationUtil.validate(loginRequest);
        //     System.out.println("Data valid"); 
        // } catch (ValidationException err) {
        //     System.out.println("Data tidak valid : " + err.getMessage());
        // } catch (NullPointerException n){
        //     System.out.println("Data null : " + n.getMessage());
        // }

        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);
        
    }

}
