//import java.util.Scanner;
//
//public class ifElseSwitch {
//	public static void main(String [] args) { 
//		//ex6 if/else
//				Scanner in = new Scanner(System.in);
//				System.out.print("점수를 입력하세요(0~100): ");
//				int score = in.nextInt();
//				System.out.print("학년을 입력하세요(1~4): ");
//				int year = in.nextInt();
//				
//				if(score >= 60)
//				{ 
//					if(year != 4)
//						System.out.println("합격!");
//					else if(year == 4 && score >= 70)
//						System.out.println("합격!");
//					else 
//						System.out.println("불합격!");
//				}
//				else 
//					System.out.println("불합격!");
		
		//ex7 switch 학점 판별하기
//		Scanner in = new Scanner(System.in);
//		System.out.print("점수를 입력하세요(0~100): ");
//		int score = in.nextInt();
//		char grade;
//		
//		switch(score/10)
//		{ 
//		case 10: grade = 'A';
//					break;
//		case 9: grade = 'A';
//					break; //break가 없다면 95입력시 B에서 걸린다
//		case 8: grade = 'B';
//					break;
//		case 7: grade = 'C';
//					break;
//		case 6: grade = 'D';
//					break;
//		default: grade = 'F';
//		}
//		System.out.println("학점은 " + grade + "입니다.");
//		in.close();
		
		//ex8 switch 커피 주문하기(break를 어디에 작성하는가) 
//		Scanner in = new Scanner(System.in);
//		System.out.print("무슨 커피를 드릴까요? ");
//		String coffee = in.next();
//		int pay = 0;
//		
//		switch(coffee)
//		{ 
//		case "에스프레소","카푸치노", "카페라떼": pay = 3500;
//						break;
//		case "아메리카노": pay = 2000;
//						break;
//		default:System.out.println("메뉴에 없습니다.");
//		}
//		System.out.println(coffee +"의 가격은 " + pay + "입니다.");
//		switch문에서 default위에는 break가 무조건 걸려잇어야함. break X시,  op = 1 해놓으면 op1 op2 op3다 출력
//		int op = 3; //op = 1;
//		switch(op) { 
//		case 1: System.out.println("op 1");
//		case 2: System.out.println("op 2"); //break;
//		case 3: System.out.println("op 3"); 
//		default: System.out.println("해당 X");
//		}
//	}
//}
