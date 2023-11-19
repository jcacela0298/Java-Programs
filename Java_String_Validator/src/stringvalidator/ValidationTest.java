package stringvalidator;

public class ValidationTest {
    public static void main(String[] args) {
        boolean result = validation();
        System.out.println("Result: " + result);
    }

    public static boolean validation() {
        boolean result = StringValidation.isValidInt("42");
        return result;
    }
}