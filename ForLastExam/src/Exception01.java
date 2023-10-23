import java.util.*;

//public class Exception01{
//	public static void main(String [] args) {
//		try { 
//			int a = 0;
//			int b = 5/a;
//		}
//		catch(ArithmeticException e) {
//			System.out.println("0으로 나눕니다.");
//		}
//		System.out.println("try~catch문의 외부 문장입니다.");
//	}
//}

//public class Exception01{
//	public static void main(String [] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		int num1 = in.nextInt();
//		
//		try {
//			int num2 = 10/num1;
//			System.out.println(num2);
//		}
//		catch(Exception e) {
//			System.out.println("올바른 숫자를 입력하세요.");
//			System.out.println(e.getMessage()); //getMessage(요약된 메시지 반환)
//			e.printStackTrace(); //printStackTrace(시스템 스택 추적을 오류 출력 스트림으로 출력)
//			System.out.println("e출력: " + e); //e 설명
//			return;
//		}
//		finally {
//			System.out.println("실행?");
//		}
//		System.out.println("try~catch블록의 외부 문장입니다.");
//	}
//}


//public class Exception01 {
//public static void main(String[] args) {
//try {
//Integer in = new Integer("abc");
//in.intValue(); }
//catch(ArithmeticException e) {
//System.out.println("예외 발생 ArithmeticException " + e); }
//catch(NumberFormatException e) {
//System.out.println("예외 발생 NumberFormatException " + e); }
//System.out.println("try~catch문의 외부 문장입니다."); }
//}