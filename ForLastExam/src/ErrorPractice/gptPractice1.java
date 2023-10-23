package ErrorPractice;
import java.util.*;

//정답코드
//public class gptPractice1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		System.out.print("숫자를 입력하세요: ");
////		Scanner in = new Scanner(System.in);
////		int n = in.nextInt();
////		try {
////		if(!(n>0 && n<100)) {
////			throw new Exception("잘못된 숫자 입력");
////		} else System.out.println(n);
////		}catch(Exception e) {
////			System.out.println(e.getMessage());
////		}
//		Scanner in = new Scanner(System.in);
//		int total = 0;
//		int count = 0;
//		System.out.println("점수를 입력하세요: ");
//		while(true) {
//			int score = in.nextInt();
//			if(score == -1) break;
//			try {
//				if(score < 0 || score > 100) {
//					throw new IllegalArgumentException("잘못된 점수 입력");
//				}
//				total += score;
//				count ++;
//			}catch(IllegalArgumentException e) {
//				System.out.println(e.getMessage());
//			}
//		}
//		if(count > 0) {
//			double avg = (double) total / count;
//			System.out.println("평균 점수: " + avg);
//		}else {
//			System.out.println("점수입력X");
//		}
//		
//	}
//}


//class NumberOverException extends Exception{
//	public NumberOverException(String x) {
//		super(x);
//	}
//}

//public class gptPractice1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("문자열을 입력하세요.");
//		Scanner in = new Scanner(System.in);
//		String str = in.nextLine();
//		try {
//			check(str);
//		}catch(NumberFormatException e) {
//			System.out.println("잘못된 입력입니다.");
//		}
//	}
//	static void check(String str) throws NumberFormatException{
//		Integer num = new Integer(str);
//		int n = 0;
//		while(num > 0) {
//			n += num % 10;
//			num/=10;
//		}
//		System.out.println(n);
//	}
//}
