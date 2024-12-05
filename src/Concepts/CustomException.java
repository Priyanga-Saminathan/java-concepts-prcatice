package Concepts;
import java.lang.Exception;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String str){
		super(str);
	}
}
public class CustomException {
	public static void validate(int n) throws InvalidAgeException {
		if(n<18) {
			throw new InvalidAgeException("Age is invalid");
		}
	}
	public static void main(String args[]) {
		try {
			validate(13);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
