//package ErrorPractice;
//import java.io.*;
//import java.util.*;
//
//public class Example01 {
//
//	public static void main(String[] args) {
////			System.out.println("숫자를 입력하세요.");
////			Scanner in = new Scanner(System.in);
////			int num = in.nextInt();
////			try {
////				int a = 10/num;
////				System.out.println(a);
////			}catch(Exception e) {
////				System.out.println("올바른 숫자를 입력하세요.");
////				//System.out.println(e.getMessage());
////				e.printStackTrace();
////			}
////			System.out.println("try~catch블록의 외부 문장입니다.");
//		
////		try {
////			Integer in = new Integer("abc");
////			in.intValue();
////		}catch(ArithmeticException e) {
////			System.out.println("예외 발생 ArithmeticException " + e);
////		}catch(NumberFormatException e) {
////			System.out.println("예외 발생 NumberFormatException " + e);
////		}
////		System.out.println("try~catch문의 외부문장입니다.");
//		
////		Scanner in = new Scanner(System.in);
////		System.out.println("숫자를 입력하세요.");
////		int num = in.nextInt();
////		
////		int arr[] = new int[5];
////		
////		
////		try {
////			arr[num] = 10/num;
////			System.out.println(arr[num]);
////		}catch(ArithmeticException e) {
////			System.out.println("0이 아닌값을 입력하세요!");
//////			System.out.println(e.getMessage());
//////			System.out.println(e);
//////			e.printStackTrace();
////		}catch(ArrayIndexOutOfBoundsException e) {
////			System.out.println("올바르 배열 인덱스를 입력하세요!");
////			System.out.println(e.getMessage());
////			System.out.println(e);
////			e.printStackTrace();
////		}
//		
////		int a[] = new int[2];
////		try {
////			System.out.println("잘못된 요소에 접근: " + a[3]);
////		}catch(Exception e) {
////			System.out.println(e);
////		}finally {
////			System.out.println("실행될거야~");
////		}
//		
////		try {
////			check();
////		}catch(ArithmeticException e) {
////			System.out.println(e);
////		}
////		try {
////			check3();
////		}catch(NumberFormatException e) {
////			System.out.println(e);
////		} finally {
////			System.out.println("관계 무");
////		}
//		
////		System.out.println("숫자를 입력하세요");
////		Scanner in = new Scanner(System.in);
////		int num = in.nextInt();
////		try {
////		if(num < 0) throw new NumberFormatException("0보다 작습니다");
////		else System.out.println(num);
////		}catch(NumberFormatException e) {
////			System.out.println(e);
////		}
//	}
//	
//	
//	
//	
////	static void check() throws ArithmeticException{
////		System.out.println("내부 메서드");
////		int div = 5/0;
////	}
////	
////	static void check2(int num) throws NumberFormatException{
////		System.out.println("내부 메서드4");
////		Integer a = new Integer(num);
////	}
////	
////	static void check3() throws NumberFormatException{
////		System.out.println("내부2 메서드");
////		Integer a = new Integer("abc");
////		System.out.println(a.intValue());
////	}
//}

