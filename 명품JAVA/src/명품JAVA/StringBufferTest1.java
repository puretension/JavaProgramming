//package 명품JAVA;
//
//
//public class StringBufferTest1 {
//	public static void main(String [] args) { 
//		StringBuffer sb1 = new StringBuffer("Hello Java");
//		StringBuffer sb2 = new StringBuffer("처음 시작하는 자바");
//		StringBuffer sb3 = new StringBuffer();
//		System.out.println(sb3.capacity()); //기본 용량이 16
//		System.out.println(sb3.length()); //기본 길이는 0
//		
//		System.out.println("문자열 => " + sb1);
//		System.out.println("문자열 길이 => " + sb1.length());
//		
//		System.out.println("버퍼를 포함하는 길이 => " + sb1.capacity());
//		sb1.append("12345678910111213141516");
//		System.out.println("문자열 길이@@ => " + sb1.length());
//		System.out.println("버퍼를 포함하는 용량@@ => " + sb1.capacity());
//		System.out.println("버퍼에 들어있는 내용 => " + sb2);
//		
//		System.out.println("문자열 끼워넣기 => " + sb2.insert(8, "Power "));
//		System.out.println("버퍼의 8번째 문자 => " + sb2.charAt(8));
//		
//		sb2.setCharAt(5, '되');
//		System.out.println("5번째 값을 '되'로 변경 => " + sb2);
//		
//		sb2.setLength(5);
//		System.out.println("버퍼의 새로운 값 => " + sb2);
//		System.out.println("문자열의 역순 출력하기 => " + sb2.reverse());
//	}
//}
