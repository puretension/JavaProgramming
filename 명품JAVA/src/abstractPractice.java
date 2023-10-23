//import java.util.Scanner;
//
////abstract class Shape{ 
////	abstract public void draw();
////}
////
////class Line extends Shape { 
////	public void draw() { 
////		System.out.print("Line");
////	}
////}
////
////class Rect extends Shape { 
////	public void draw() { 
////		System.out.print("Rect");
////	}
////}
//
//abstract class Calculator{ 
//	int reason;
//	public abstract int add(int a, int b);
//	public abstract int sub(int a, int b);
//	public abstract double average(int [] a);
////	 public default void showMy() {
////	        System.out.println("@@");
////	    }
//}
//
//class GoodCal extends Calculator{ 
//	public int add(int a, int b) { 
//		return a + b;
//	}
//	public int sub(int a,int b) { 
//		int c;
//		return c = (a>b) ? a-b:b-a;
//	}
//	public double average(int [] a) { 
//		int sum = 0;
//		for(int i = 0;i<a.length;i++)
//		{ 
//			sum += a[i];
//		}
//		return (double)sum/a.length;
//	}
//}
//
//
//public class abstractPractice {
//
//	public static void main(String [] args) {
//		GoodCal s = new GoodCal();
//		int answer;
//		answer = s.add(2, 1);
//		System.out.println(answer);
//		answer = s.sub(4, 2);
//		System.out.println(answer);
//		double dAnswer = s.average(new int [] {1,2,3});
//		System.out.println(dAnswer);
//	}
//}
