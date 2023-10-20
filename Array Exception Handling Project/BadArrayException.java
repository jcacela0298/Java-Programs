package exceptionhandlingpackage;

public class BadArrayException extends Exception{
	
	public BadArrayException() {
		//this is a constructor
	}
	public BadArrayException(String message) {
		//this is the second constructor (parent exception string constructor)
		super(message);
	}
}