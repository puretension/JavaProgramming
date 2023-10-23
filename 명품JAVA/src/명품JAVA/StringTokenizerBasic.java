//package 명품JAVA;
//
//import java.util.StringTokenizer;
//
//public class StringTokenizerBasic {
//
//	public static void main(String [] args) { 
////		String query = "name=kitae&addr=seoul&age=21";
////		StringTokenizer st = new StringTokenizer(query, "&");
////		StringTokenizer st2 = new StringTokenizer(query, "&=");
////		StringTokenizer st3 = new StringTokenizer(query, "&=",true);
////		
////		int count = st3.countTokens();
////		System.out.println("token 개수 = " + count);
////		for(int i = 0;i<count;i++)
////		{ 
////			String token = st3.nextToken();
////			System.out.println(token);
////		}
////		StringTokenizer x = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/");
////		int count = x.countTokens();
//////		for(int i = 0;i<count;i++)
//////		{ 
//////			String token = x.nextToken();
//////			System.out.println(token);
//////		}
////		while(x.hasMoreTokens())
////		{ 
////			System.out.println(x.nextToken());
////		}
//		int sum = 0;
//		StringTokenizer x = new StringTokenizer("2+3+5+66+88+323", "+");
//		while(x.hasMoreTokens()) { 
//			sum += Integer.parseInt(x.nextToken());
//		}
//		System.out.println(sum);
//	}
//}
