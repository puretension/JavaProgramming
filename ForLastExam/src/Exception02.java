import java.util.*;

//public class Exception02 {
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		try {
//			Integer in = new Integer("abc");
//			in.intValue();
//		}
//		//
//		catch(ArithmeticException e) {
//			System.out.println("예외 발생 ArithmeticException " + e);
//		}
//		//NumberFormatException 문자열을 숫자로 변환할때 발생하는 에러 
//		catch(NumberFormatException e) {
//			System.out.println("예외 발생 NumberFormatException " + e);
//		}
//		System.out.println("try~catch문의 외부 문장입니다.");
//	}
//}

//public class Exception02 {
//public static void main(String[] args) {
//	Scanner in = new Scanner(System.in);
//	System.out.println("숫자를 입력하세요.");
//	int num = in.nextInt();
//	int arr[] = new int[5];
//	try {
//		arr[num] = 10/num;
//		System.out.println(arr[num]);
//		} 
//	catch(ArithmeticException e) {
//		System.out.println("0이 아닌 값을 입력하세요.");
//		System.out.println(e.getMessage());
//		}
//	catch(ArrayIndexOutOfBoundsException e) {
//		System.out.println("올바른 배열 인덱스를 입력하세요.");
//		System.out.println(e.getMessage());
//		}
//	}
//}

//public class Exception02 {
//public static void main(String[] args) {
//	int a[] = new int[2];
//	try {
//		System.out.println("잘못된 요소에 접근: " + a[3]);
//	} catch(Exception e) {
//		System.out.println("예외 발생 ArrayIndexOutOfBoundException " + e);
//	} finally {
//		System.out.println("finally는 항상 실행됩니다.");
//	}
//	}
//}
