import java.util.*;
import java.lang.*;

//class AgeOverException extends Exception{ 
//	public AgeOverException(String message) { 
//		super(message);
//	}
//}
//
//public class EX20_2 {
//	//public static void 함수명(파라미터) throws 에러 
//	public static void validateAge(int age) throws AgeOverException{ 
//		try { 
//			//2. 메소드내 try에서 AgeOverException 에러 발생
//			if(age < 18) throw new AgeOverException("Age should be at least 18");
//		System.out.println("Age is valid");
//		}
//		catch(AgeOverException e) {
//		System.out.println("Exception thrown is validateAge method");
//		throw e; //3.예외 catch후 rethrow
//		}
//	}
//	public static void main(String[] args) {
//		try {
//			validateAge(17); //1. 메소드 실행
//		} catch(AgeOverException e) {
//			System.out.println("Age Validation Exception: " + e.getMessage());
//			e.printStackTrace(); //4.rethrow된 예외 catch
//		}
//	}
//}

//class AgeOverException extends Exception{ 
//	public AgeOverException(String message) { 
//		super(message);
//	}
//}
//
//class NameOverException extends Exception{
//	public NameOverException(String message) {
//		super(message);
//		}
//}
//
//public class EX20_2 {
//	//public static void 함수명(파라미터) throws 에러 
//	public static void validateAge(int age, String name) throws AgeOverException,NameOverException{
//		try {
//		if(age < 18) throw new AgeOverException("Age should be at least 18");
//		}catch(AgeOverException e) {
//			System.out.println("Exception thrown1 is validateAge method");
//			throw e;
//		}
//		try {
//		if(name.length() > 5) throw new NameOverException("Name length should not exceed 5 characters");
//		}catch(NameOverException e) {
//			System.out.println("Exception thrown2 is validateAge method");
//			throw e;
//		}
//		System.out.println("Age and name are valid");
//	}
//	public static void main(String[] args) {
//		try {
//			validateAge(17, "Jhonsnow"); //1. 메소드 실행
//		}
//		catch(AgeOverException e) {
//			System.out.println("Age Validation Exception: " + e.getMessage());
//			e.printStackTrace(); //4.rethrow된 예외 catch
//		} catch(NameOverException e) {
//			System.out.println("Name Error Exception: " + e.getMessage());
//			e.printStackTrace();
//		}
////		catch(Exception e) {
////			System.out.println("Exception: " + e.getMessage());
////			e.printStackTrace();
////		}
//		catch(Throwable e) {
//			System.out.println("Throwable: " + e.getMessage());
//			e.printStackTrace();
//		}
//	}
//}


//class AgeOverException extends Exception{ 
//	public AgeOverException(String message) {
//		super(message);
//	}
//}
//
//class NameErrorException extends Exception{
//	public NameErrorException(String message) {
//		super(message);
//	}
//}
//
//public class EX20_2{
//	
//	public static void validateAge(int age, String name) throws AgeOverException, NameErrorException{
//		if(age > 18) throw new AgeOverException("Age should be at least 18");
//		if(name.length() > 5) throw new NameErrorException("Name length should not exceed 5 characters");
//		System.out.println("Age and name are valid");
//	}
//	
//	public static void main(String[] args) {
//		try { 
//			validateAge(15, "JohnSnow");
//		} 
//		catch(AgeOverException e) {
//			System.out.println("Age Validation Exception: "+ e.getMessage());
//			e.printStackTrace();
//		}
//		catch(NameErrorException e) {
//			System.out.println("Name Error Exception: "+ e.getMessage());
//			e.printStackTrace();
//		}
////		catch(Exception e) {  
////			System.out.println("Exception: " + e.getMessage());
////			e.printStackTrace();
////		}
//		catch(Throwable t) {
//			System.out.println("Throwable: " + t.getMessage());
//			t.printStackTrace();
//		}
//	}
//}


