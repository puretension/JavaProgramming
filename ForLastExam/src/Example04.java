import java.util.*;

//public class Example04 {
//	static void check() throws ArithmeticException{
//		System.out.println("내부 메서드");
//		int div = 5/0;
//	}
//	public static void main(String[] args) {
//		try { 
//			check();
//		}
//		catch(ArithmeticException e) {
//			System.out.println("예외 발생 " + e);
//		}
//	}
//}

//public class Example04{
//	static void check(int num) throws NumberFormatException {
//		if(num < 0) throw new NumberFormatException("0보다 작습니다.");
//		else System.out.println(num);
//	}
//	
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		int num = in.nextInt();
//		try { 
//			check(num);
//		} catch(NumberFormatException e) {
//			System.out.println("예외 발생 " + e);
//		}
//	}
//}


//public class Example04{
////	static void check(int num) throws NumberFormatException {
////		if(num < 0) throw new NumberFormatException("0보다 작다");
////		else System.out.println(num);
////	}
//	
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		int num = in.nextInt();
//		try {
//			if(num < 0) throw new NumberFormatException();
//			else System.out.println(num);
////			check(num);
//		}catch(NumberFormatException e) {
//			System.out.println("예외 발생: " + e);
//		}
//	}
//}