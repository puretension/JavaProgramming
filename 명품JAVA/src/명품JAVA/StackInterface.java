//package 명품JAVA;
//
//import java.util.Scanner;
//
//
//interface Stack{ 
//	int length();
//	int capacity();
//	boolean push(String val);
//	String pop();
//}
//
//class StringStack implements Stack{ 
//	int top = -1;
//	int capacity;
//	String [] strArray;
//	public StringStack(int capacity){ 
//		this.capacity = capacity;
//		strArray = new String[capacity];
//	}
//	public boolean push(String val) { 
//		if(top != capacity -1) {
//			strArray[++top] = val;
//		return true; }
//		else return false;
//	}
//	public String pop() { 
//		if(top == -1) return null;
//		return strArray[top--];
//	}
//	public boolean isFull() { 
//		if(top == capacity -1) return true;
//		return false;
//	}
//	public boolean isEmpty() { 
//		if(top == -1) return true;
//		return false;
//	}
//	public int length() {
//		return top + 1;
//	}
//	public int capacity() { 
//		return capacity;
//	}
//}
//
//public class StackInterface {
//
//	public static void main(String[] args) {
//		int n;
//		Scanner in = new Scanner(System.in);
//		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
//		n = in.nextInt();
//		in.nextLine();
//		StringStack stk = new StringStack(n);
//		StringBuffer sb = new StringBuffer();
//		while(true) { 
//			System.out.print("문자열 입력 >> ");
//			String str = in.nextLine();
//			if(str.equals("그만")) break;
//			stk.push(str);
//			if(stk.isFull()) { 
//				System.out.println("스택이 꽉 차서 푸시 불가!");
//			}
//		}
//		while(!stk.isEmpty()) { 
//			sb.append(stk.pop()).append(" ");
//		}
//		System.out.println("스택에 저장된 모든 문자열 팝: " + sb.toString());
//	}
//
//}
