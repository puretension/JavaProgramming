//import java.lang.*;
//
//class InvalidException extends Exception {
//	public InvalidException(String s) {super(s); }
//}
//public class testMode {
//	
//	static void check(int weight) throws InvalidException { 
//		if (weight < 100) {
//		throw new InvalidException("InvalidException 클래스 호출입니다."); 
//		}
//	}
//	
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		testMode obj = new testMode();
//		try { obj.check(60);
//		}
//		catch(InvalidException ex) {
//		System.out.println("예외 처리입니다. "); 
//		System.out.println(ex.getMessage());
//		} 
//	}
//}
//
