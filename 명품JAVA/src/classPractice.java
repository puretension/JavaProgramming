//import java.util.Scanner;
//
////생성자와 this 연습하기
////class Book{ 
////	String title;
////	String author;
////	
////	Book(String title, String author){ 
////		this.title = title;
////		this.author = author;
////	}
////	
////	Book(String title){ 
////		this(title, "작자미상");
////	}
////	Book() { 
////		this("blank", "blank");
////		System.out.println("빈 생성자 호출됨");
////	}
////	
////}
//
////Circle 객체 배열 만들기 
//class Circle{ 
//	int radius;
//	Circle(int radius){ 
//		this.radius = radius;
//	}
//	double getArea() { 
//		return 3.14*radius*radius;
//	}
//}
//
//class Book{ 
//	String name;
//	String title;
//	Book(String title, String name){ 
//		this.title = title;
//		this.name = name;
//	}
//}
////
//public class classPractice {
//	
//
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
////		Circle a [] = new Circle[5];
////		for(int i = 0;i<a.length;i++)
////		{ 
//////			a[i].radius = i;
////			a[i] = new Circle(i);
////		}
////		for(int i = 0;i<a.length;i++)
////			System.out.print((int)a[i].getArea() + " ");
//		
//		Book [] p = new Book[2];
//		for(int i = 0;i<p.length;i++)
//		{ 
//			System.out.print("제목>>");
//			String title = in.next();
//			System.out.print("저자>>");
//			String name = in.next();
//			p[i] = new Book(title, name);
//		}
//		for(int i = 0;i<p.length;i++)
//			System.out.println("(" + p[i].title + p[i].name + ")");
//	}
//
//}
