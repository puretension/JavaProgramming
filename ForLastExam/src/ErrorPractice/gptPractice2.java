//package ErrorPractice;
//import java.util.*;
//
//public class gptPractice2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String input;
//		Scanner in = new Scanner(System.in);
//		input = in.nextLine();
//		int sum = calculateSum(input);
//		System.out.println("총합: " + sum);
//	}
//	
//	static int calculateSum(String input) {
//		int sum = 0;
//		String [] strArray = input.split(" ");
//		for(int i = 0;i<strArray.length;i++) {
//			String num = strArray[i];
//			try {
//				int parsedNum = Integer.parseInt(num);
//				if(parsedNum < 0) throw new IllegalArgumentException("음수는 안됩니다.");
//				sum += parsedNum;
//			}catch(IllegalArgumentException e) {
//				System.out.println(e.getMessage());
//			}
//			catch(Exception e) {
//				System.out.println("잘못된 입력입니다: " + num);
//			}
//		}
//		return sum;
//	}
//}
