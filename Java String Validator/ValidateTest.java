package stringvalidator;

public class ValidateTest {
    public static void main(String[] args) {
        boolean result = validation();
        System.out.println("Result: " + result);
    }

    public static boolean validation() {
        boolean result = JavaStringValidate.isValidInt("42");
        return result;
    }
}