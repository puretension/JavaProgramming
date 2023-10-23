//package StringPractice;
//
//import java.util.Scanner;
//import java.util.HashMap;
//
//
//public class StringPractice1 {
//	
//	static String printInversion(String str) { 
//		String result = "";
//		StringBuffer sb = new StringBuffer();
//		
////		for(int i = str.length()-1;i>=0;i--)
////		{ 
////			char ch = str.charAt(i);
////			result += ch;
////		}
//		
//		for(int i = str.length()-1;i>=0;i--)
//		{ 
//			sb.append(str.charAt(i));
//		}
//		
//		return sb.toString();
//		//return result;
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//문제1. 문자열 뒤집기 
////	String myName = "James Bond";
////	String reverseName = "";
////	for(int i = myName.length()-1;i>=0;i--)
////	{ 
////		char a = myName.charAt(i);
////		reverseName += a;
////	}
////	System.out.print(reverseName);
//	
//	//2개의 문자열을 입력받는다 
//	//StringBuffer로 2개의 문자열을 합친값을 넣어준다
//	//StringBuffer를 문자열로 변환해!! split함수로 분리해주고, String Array에 넣어준다
//	//String 배열의 각각의 문자열을 첫글자만 대문자로 바꾸어 빈 StringBuffer에 넣어준다.
//	
//		
////	Scanner in = new Scanner(System.in);
////	System.out.print("Enter the first string: ");
////	String a = in.nextLine();
////	System.out.print("Enter the second string: ");
////	String b = in.nextLine();
////	
////	StringBuffer input = new StringBuffer(a).append(" ").append(b);
////	StringBuffer result = new StringBuffer();
////	
////	String [] stringArray = input.toString().split(" ");
////	
////	for(int i = 0;i<stringArray.length;i++)
////	{ 
////		String word = stringArray[i];
////		if(word.length() > 0)
////		{ 
////			result.append(Character.toUpperCase(word.charAt(0)))
////			.append(word.substring(1,word.length())).append(" ");
////		}
////	}
////	System.out.println("String with first letter capitalized: " + result.toString().trim());
////	
////		
////		//문제2. 문자열 개수 counting -> 입력 문자열에서 알파벳, 숫자, 공백 개수 구하라 
////		int alpha = 0, num = 0, space = 0;
////		Scanner in = new Scanner(System.in);
////		String str = in.nextLine();
////		char ch;
////		String k = "";
////		for(int i = 0;i<str.length();i++)
////		{ 
////			ch = str.charAt(i);
////			if(ch == ' ')
////				space++;
////			else if(Character.toUpperCase(ch) >= 'A' && Character.toUpperCase(ch) <= 'Z')
////				alpha++;
////			else if(ch >= '0' && ch <= '9')
////				num++;
////		}
////		System.out.print(alpha + " " + num + " " + space + "\n");
//		
//		//회문 확인
//		//문자열을 입력받고 split함수를 사용하여 공백을 기준으로 StringArr에 넣어준다
//		//StringArr의 각각의 문자를 빈 문자열 tempOriginal에 하나씩 삽입해준다
//		//기존의 것을 전부 대문자로 바꿔준다 
//		
////		Scanner in = new Scanner(System.in);
////		String original = in.nextLine();
////	
////		String [] stringArr = original.split(" ");
////		
////		String tempOriginal = "";
////		for(int i = 0;i<stringArr.length;i++)
////			tempOriginal += stringArr[i];
////
////		original = tempOriginal.toUpperCase();
////		
////		String reverse = "";
////	
////		for(int i = original.length()-1; i>=0;i--)
////		{ 
////			char x = original.charAt(i);
////			reverse += x;
////		}
////		
////		if(original.equals(reverse))
////			System.out.println("회문입니다.");
////		else System.out.println("not 회문");
//		
//		Scanner in = new Scanner(System.in);
//		String str = "I am going to climb mountin to walk 145km and it would take more than 2 hours and 35 minutes";
//		String [] strArray = str.split(" ");
//		StringBuffer sb = new StringBuffer();
//		sb.append("[");
//		for(int i = 0;i<strArray.length;i++)
//		{ 
//			boolean flag = false;
//			String x = strArray[i];
//			for(int j = 0;j<x.length();j++)
//			{
//				 if(Character.isDigit(x.charAt(j)))
//				 {
//					 flag = true;
//					 sb.append(x.charAt(j));
//				 }
//			}
//			if(flag) sb.append(", ");
//		}
//		sb.delete(sb.toString().length()-2, sb.toString().length());
//		sb.append("]");
//		System.out.println(sb.toString());
//	}
//
//}
