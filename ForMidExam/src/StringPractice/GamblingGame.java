//package StringPractice;
//
//import java.util.Scanner;
//import java.util.Random;
//
//class Person{ 
//	String name;
//	StringBuffer sb = new StringBuffer();
//	public Person(String name) { 
//		this.name = name;
//	}
//	public String toString() { 
//		return this.name;
//	}
//	public void randNum() { 
//		sb.setLength(0);
//		for(int i = 0;i<3;i++)
//		{ 
//			int number = (int)(Math.random() * 3 + 1);
//			sb.append(number);
//		}
//		for(int i = 0;i<3;i++)
//		{ 
//			System.out.print(sb.charAt(i) + " ");
//		}
//	}
//		boolean check() {
//		if(sb.charAt(0) == sb.charAt(1) && sb.charAt(1) == sb.charAt(2))
//			return true;
//		else return false;
//		}
//}
//
//public class GamblingGame {
//	
//	static void run() { 
//		Scanner in = new Scanner(System.in);
//	
//		System.out.print("1번째 선수 이름>>");
//		String aName = in.next();
//		Person a = new Person(aName);
//		
//		System.out.print("2번째 선수 이름>>");
//		String bName = in.next();
//		Person b = new Person(bName);
//		in.nextLine();
//		String repeat;
//		while(true) { 
//			System.out.print("[" + a.name + "]:<Enter>");
//			repeat = in.nextLine();
//			a.randNum();
//			if(a.check()) { 
//				System.out.println(a + "님이 이겼습니다!");
//				break;
//			}
//			else System.out.println("아쉽군요!");
//			System.out.print("[" + b.name + "]:<Enter>");
//			repeat = in.nextLine();
//			b.randNum();
//			if(b.check()) { 
//				System.out.println(b + "님이 이겼습니다!");
//				break;
//			}
//			else System.out.println("아쉽군요!");
//		}
//		
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		run();
//	}
//
//}
