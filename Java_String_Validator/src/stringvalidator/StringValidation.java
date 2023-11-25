package stringvalidator;

public class StringValidation {
	public static boolean isValidInt(String testIntval) {
		if (testIntval == null) {
			return false;
		} else {	 
			try{
				int number = java.lang.Integer.parseInt(testIntval);
				return true;
			} catch (NumberFormatException e) {
			return false;
			}
		}
	}
}
