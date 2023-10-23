//import java.util.Scanner;
//import java.util.Random;
//public class openChallenge1 {
//
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int n = -1;
//		
//		char again = 'a';
//		
//		int count = 0;
//		
//		int startNum = 0;
//		int endNum = 99;
//		
//		while(again != 'n')
//		{ 
//			int answer = (int) (Math.random() * 99) + 0;
//			System.out.print("수를 결정하였습니다. 맞추어 보세요\n");
//			
//			
//			while(n!= answer)
//			{
//				System.out.println(startNum + "-" + endNum);
//				++count;
//				System.out.print(count + ">>");
//				n = in.nextInt();
//				if(n > answer) 
//					{ 
//					System.out.println("더 낮게");
//					endNum = n;
//					}
//				else if(n< answer)
//					{ 
//					System.out.println("더 높게");
//					startNum = n;
//					}
//				else 
//					System.out.println("정답입니다.");
//			}
//			System.out.print("다시하시겠습니까(y/n) >>");
//				again = in.next().trim().charAt(0); //문자만 받는 메서드가 없기때문에 공백제거후, 맨앞 1개 문자만 값으로 받는다
//			//아니면 String again 선언하고 again.equals("n")해서 종료해도
//		}
//		System.out.println("프로그램이 종료되었습니다.\n");
//	}
//
//}
