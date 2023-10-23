//import java.util.Scanner;
//
//interface Stack{ 
//	int length();
//	int capacity();
//	String pop();
//	boolean push(String val);
//}
//
//class StringStack implements Stack{ 
//	int size;
//	int index;
//	String [] StackArray;
//	
//	StringStack(int size){ 
//		index = -1;
//		this.size = size;
//		StackArray = new String [size];
//	}
//	
//	public int length() { 
//		return index + 1;
//	}
//	
//	public int capacity() { 
//		return StackArray.length;
//	}
//	
//	public String pop() { 
//		String str;
//		if(index == -1)
//			return null;
//		else
//			str = StackArray[index];
//			index--;
//		return str;
//	}
//	
//	public boolean push(String val)
//	{ 
//		if(index + 1 < size) { 
//			index++;
//			StackArray[index] = val;
//			return true;
//		}
//		else return false;
//	}
//}
//
//public class StackInterface {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		
//		System.out.print("총 스택 저장공간의 크기 입력 >> ");
//		int n = in.nextInt();
//		StringStack stk = new StringStack(n);
//		
//		while(true)
//		{ 
//			System.out.print("문자열 입력 >> ");
//			String str = in.next();
//			if(str.equals("그만")) break;
//			boolean success = stk.push(str);
//			if(success != true)
//				System.out.println("스택이 꽉 차서 푸시 불가!");
//		}
//		System.out.println("스택에 저장된 모든 문자열 팝: ");
//		for(int i = 0;i<stk.capacity();i++)
//		{ 
//			System.out.print(" ");
//			System.out.print(stk.pop());
//		}
//	}
//
//}
