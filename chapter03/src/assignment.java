//import java.util.Scanner;
//
//public class assignment {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	
//		//1번문제
//	int rows = 2, columns = 3;
//	int [][] firstMatrix = { {2,3,4}, {3,2,1} };
//	int [][] secondMatrix = { {1,2,3}, {-4,-2,1} };
//	int [][] sum = new int[rows][columns];
//	
//	for(int i = 0;i<2;i++)
//	{ 
//		for(int j = 0;j<3;j++)
//			sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
//	}
//	
//	System.out.println("두 행렬의 합: ");
//	
//	for(int i = 0;i<2;i++)
//	{ 
//		for(int j = 0;j<3;j++)
//		{ 
////			System.out.print(sum[i][j] + " ");
//			System.out.printf("%3d", sum[i][j]);
//		}
//		System.out.printf("\n");
//	}
//		
//		
////		String s1 = "Java Programming";
////		String s2 = new String("Java Programming");
////		System.out.println(s1);
////		System.out.println(s2);
//		
//	//Scanner in = new Scanner(System.in);
////	String s = " Java Programming "; //마지막에 space한칸 잇음 
////	String s1 = "Java";
////	String s2 = " Programming";
////	String s3 = s1.concat(s2);
////	String s4 = s.trim(); //space제거 
////		
////	System.out.println("s3 " + s3);
////	System.out.println("s4 " + s4);
////	System.out.println("s3.equals(s4) " + s3.equals(s4));
//	
//		
//	//2번 문제 
////Scanner in = new Scanner(System.in);
////
////	System.out.printf("이름을 입력해주세요.");
////	String name = in.nextLine();
////	System.out.printf("성이 몇 글자인가요? ");
////	int count = in.nextInt();
////	if(count > name.length() - count)
////		System.out.printf("성이 글자수를 넘기에 별도의 출력없이 종료합니다.\n");
////	else
////	{
////	System.out.printf(name.substring(0, count) + "\n");
////	System.out.printf(name.substring(count, name.length()) + "\n");
////	}
//	
//	//3번 문제
//	
////	System.out.printf("문자열을 입력해주세요.");
////	String str = in.nextLine();
////	
////	
////	String[] array = new String[9];
////    array = str.split(",");
////    
////    for(int i = 0; i < 9; i++)
////    {  
////        System.out.printf(array[i] + " ");
////    }
//	
//
////4번 문제  
//
////int [] diceArray = {0,0,0,0,0,0,0};
////int sum = 0;
////for(int i = 0;i< 100; i++)
////{
////	Dice t = new Dice();
////	int myNum = t.roll();
////	sum += myNum;
////	diceArray[myNum]++;
////} 
////
////System.out.printf("총 결과값: %d\n", sum);
////
////for(int i = 1;i< 7; i++)
////{ 
////	System.out.printf("%d 나온 횟수: %d\n",i, diceArray[i]);
////}
//
//	
//	}
//}
//
//
//class Dice{ 
//	int side;
//	
//	
//	public Dice() { 
//		this.side = 6;
//	}
//	
//	int roll() { 
//	int number = (int)(Math.random() * 6) + 1;
//	return number;
//	}
//	
//}
//
//
