package PackageJava.util;

import PackageJava.data.LoginRequest;
import PackageJava.error.ValidationException;

public class ValidationUtil {

    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException{
        if(loginRequest.username() == null){
            throw new NullPointerException("Username is null");
        } else if(loginRequest.username().isBlank()){
            throw new ValidationException("Username is blank");
        }else if(loginRequest.password() == null){
            throw new NullPointerException("Password is null");
        } else if(loginRequest.password().isBlank()){
            throw new ValidationException("Password is blank");
        }
    }

}