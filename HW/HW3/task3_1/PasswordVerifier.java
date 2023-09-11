package HW.HW3.task3_1;

public class PasswordVerifier {
    public void verify(String password) throws Exception {
        if (password.length() < 8) {
            throw new Exception("Password cannot has less than 8 chars");
        }
        boolean isDigit = false;
        boolean isUpperCase = false;
        for (char pas : password.toCharArray()) {
            if (Character.isDigit(pas)) {
                isDigit = true;
            } else if (Character.isUpperCase(pas)) {
                isUpperCase = true;
            }
        }
        if (!isDigit) {
            throw new Exception("There must be at least 1 digit in your password");
        }
        if (!isUpperCase) {
            throw new Exception("There must be at least 1 upper case letter in your password");
        }
    }
}
