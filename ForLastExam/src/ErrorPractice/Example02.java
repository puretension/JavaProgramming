//package ErrorPractice;
//import java.util.*;
//
//class MyException extends Exception{
//	String str1;
//	MyException(String str2){
//		str1 = str2;
//	}
//	public String toString() {
//		return ("MyException 발생: " +str1);
//	}
//}
//
//class InvalidException extends Exception{
//	public InvalidException(String s) {
//		super(s);
//	}
//}
//
//
//public class Example02 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////	try {
////		System.out.println("try 블록입니다.");
////		throw new MyException("MyException 클래스 호출됩니다.");
////	}catch(MyException e) {
////		e.printStackTrace();
////	}
//	
//	Example02 obj = new Example02();
//	try {
//		obj.check(60);
//	}catch(InvalidException e) {
//		System.out.println(e.getMessage());
//		System.out.println(e);
//		e.printStackTrace();
//	}
//		
//	}
//	void check(int weight) throws InvalidException{
//	if(weight < 100) throw new InvalidException("InvalidException 클래스 호출됩니다.");
//	}
//
//}
