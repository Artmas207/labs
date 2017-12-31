package lab_2_9;

public class PasswordAnalyzer {
    public static boolean isStrongPassword(String password){
        String regexp = "(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z]).{8,}";

        if(password.matches(regexp)){
            return true;
        }else{
            return false;
        }
    }
}
