//package StringPractice;
//import java.util.Scanner;
//
////function lcm(a, b) {
////	  return (a * b) / gcd(a, b)
////	}
//// a>b
////	function gcd(a, b) {
////	  let r
////	  while (b != 0) {
////	    r = a % b
////	    a = b
////	    b = r
////	  }
////	  return a
////	}
//
//
//public class gcdLcmCode {
//	
//	static int gcd(int a, int b) { 
//		int temp;
//		if(a < b)
//		{ 
//			temp = a;
//			a = b;
//			b = temp;
//		}
//		int r;
//		while(b!= 0)
//		{ 
//			r = a%b;
//			a =b;
//			b =r;
//		}
//		return a;
//	}
//	
//	public static void main(String [] args) { 
//		Scanner in = new Scanner(System.in);
//		
//		int a = in.nextInt();
//		int b = in.nextInt();
//		System.out.println("두 수의 최대공약수: " + gcd(a,b));
//		System.out.println("두 수의 최소공배수: " + a*b/(gcd(a,b)));
//	}
//	
//}
