//package 명품JAVA;
//
//import java.util.ArrayList;
//import java.util.Random;
//
//public class Wrapper {
//	
//	public static void main(String[] args) {
//	
//		//1. 다양한 방법으로 Integer 클래스 객체 생성 
//		Integer num1 = new Integer(10);
//		Integer num2 = new Integer("20");
//		Integer num3 = 30;
//		
//		System.out.println(num1 + num2 + num3);
//		
//		//2. int 데이터 타입을 Integer클래스로 변환함 
//		int num4 = 40;
//		Integer num5 = Integer.valueOf(num4);
//		System.out.println(num5); //출력결과: 40
//		
//		//3. Integer 객체와 int 데이터 타입 비교 
//		Integer num6 = 60;
//		if(num4 == num6)
//			System.out.println("같은 숫자");
//		else 
//			System.out.println("다른 숫자");
//		
//		ArrayList<Integer>numList = new ArrayList<>();
//		numList.add(1);
//		numList.add(2);
//		
//		System.out.println(numList);
		
//		//1. 문자열을 문자 배열로 변환하기 
//		String str = "Hello, world!";
//		char [] chars = str.toCharArray();
//		for(char c: chars) { 
//			System.out.print(c + " ");
//		}
//		System.out.println();
//		
//		//2. 문자열에서 특정 문자 개수 세기
//		String str2 = "Java programming language";
//		char target = 'a';
//		int cnt = 0;
//		for(int i = 0;i<str2.length();i++)
//			if(str2.charAt(i) == target)
//				cnt++;
//		System.out.printf("문자열 \"%s\"에서 문자 '%c'의 개수: %d\n", str2,target,cnt);
//		
//		//3. 대소문자 변환하기 
//		char ch = 'A';
//		System.out.println(Character.toLowerCase(ch));
//		System.out.println(Character.toUpperCase(ch));
//		
//		//4.숫자 문자 공백 등의 문자인지 판별하기 
//		char c1 = 'A', c2 = '3', c3 = ' ';
//		System.out.println(Character.isLetter(c1));
//		System.out.println(Character.isDigit(c2));
//		System.out.println(Character.isWhitespace(c3));
		
		
//		Integer i = new Integer(10); //old way
//		Integer x = Integer.valueOf(10);
//		
//		//Wrapper 객체에 들어있는 기본 타입 알아내기
//		int ii = i.intValue(); //ii = 10;
//		Double d = Double.valueOf(3.14);
//		double dd = d.doubleValue(); //3.14
//		
//		Boolean b = Boolean.valueOf(true);
//		boolean bb= b.booleanValue();
//		
//		Character ch = Character.valueOf('a');
//		char c = ch.charValue();
//		
//		int k = Integer.parseInt("123");
//		boolean s = Boolean.parseBoolean("true");
//		double z = Double.parseDouble("3.14");
//		
//		String s1 = Integer.toString(k);
//		String s2 = Integer.toHexString(k);
//		String s3 = Double.toString(z);
//		String s4 = Character.toString('a');
//		String s5 = Boolean.toString(true);
//		
//		System.out.println(Character.toLowerCase('A'));
		
//		char c1 = '4';
//		char c2 = 'F';
//		
//		if(Character.isDigit(c1))
//			System.out.println(c1 + "는 숫자");
//		if(Character.isAlphabetic(c2))
//			System.out.println(c2 + "는 영문자");
//			
//		System.out.println(Integer.parseInt("-123"));
//		System.out.println(Integer.toHexString(28)); //2진수 문자열 
//		System.out.println(Integer.toBinaryString(28)); //16진수 문자열 
//		System.out.println(Integer.bitCount(28)); //2진수의 1의 개수 
//		
//		Double d = Double.valueOf(3.14);
//		System.out.println(d.toString());
//		System.out.println(Double.parseDouble("3.14"));
//		
//		boolean s = (4>3);
//		
//		System.out.println(Boolean.toString(s));
//		System.out.println(Boolean.parseBoolean("true"));
//		
//		int n = 10;
//		Integer intObject = n;
//		System.out.println("intObject = " + intObject);
//		
//		int m = intObject + 10;
//		System.out.println("m = " + m);
//		
//		Random rand1 = new Random();
//		int num1 = rand1.nextInt(10);
//		System.out.println(num1);
//		
//		Random rand2 = new Random();
//		int num2 = rand2.nextInt(6) + 1;
//		System.out.println(num2); //1~6
//		
//		Random rand3 = new Random();
//		StringBuilder sb = new StringBuilder();
//		for(int i = 0;i<5;i++)
//		{ 
//			int num3 = rand3.nextInt(26) + 97;
//			sb.append((char) num3);
//		}
//		String kk = sb.toString();
//		sb.setLength(0);
//		System.out.println(kk);
//	}
//
//}
