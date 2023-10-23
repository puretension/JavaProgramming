//import java.util.Scanner;
//
//public class LoopArray {
//
//	public static void main(String[] args) {
//		
		//for문 1에서10합 
//		int sum = 0;
//		for(int i = 1;i<=10;i++)
//		{ 
//			sum += i;
//			if(i == 10)
//				System.out.print(i + " = " + sum);
//			else 
//				System.out.print(i + " + ");
//		}
	//
		//while문 -1입력시 종료 
//		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
//		Scanner in = new Scanner(System.in);
//		int sum = 0;
//		int count =  0;
//		int num = in.nextInt();
//		while(num != -1)
//		{ 
//			count++;
//			sum += num;
//			num = in.nextInt();
//		}
//		if(count == 0)
//		{ 
//			System.out.println("입력된 수가 0개입니다.");
//		}
//		else { 
//			System.out.print("정수의 개수는 " + count + "개이며 " + "평균은 " +(double)sum/count + "입니다.");
//		}
		
		////equals 사용하기 
//	Scanner in = new Scanner(System.in);
//	System.out.println("exit을 입력하면 종료합니다.");
//	while(true)
//	{ 
//		System.out.print(">>");
//		String text = in.nextLine();
//		if(text.equals("exit"))
//			break;
//	}
	//
		//배열 최대값 출력 + 평균계산
//		Scanner in = new Scanner(System.in);
//		int [] numArray  = new int[5];
//		int maxNum = 0;
//		for(int i = 0;i<5;i++)
//		{ 
//			numArray[i] = in.nextInt();
//			if(maxNum < numArray[i])
//				maxNum = numArray[i];
//		}
//		System.out.print("최대값 출력: " + maxNum);
		
//		int [] scoreArray = new int[5];
//		int sum = 0;
//		float avg;
//		System.out.print("5개의 점수를 입력해주세요!");
//		for(int i = 0;i<scoreArray.length;i++)
//			{ 
//			scoreArray[i] = in.nextInt();
//			sum += scoreArray[i];
//			}
//		avg = (float)sum/5;
//		System.out.printf("평균은 %.1f\n", avg);
//	
		//2차원 배열 행렬 
//		double score[][] = { 
//				{4.5, 3.5},
//				{3.8, 4.2},
//				{4.4, 3.5},
//				{4.2, 4.5}
//		};
//		double sum = 0;
//		for(int i = 0;i<score.length;i++)
//		{ 
//			for(int j = 0;j< score[i].length;j++)
//			{ 
//				sum += score[i][j];
//			}
//		}
//		int row = score.length;
//		int columns = score[0].length;
//		System.out.printf("4년 전체 평점 평균은 %.3f", sum/(row*columns));
//
		//비정방향 2차원 배열 연습하기 
//		int [][] array;
//		array = new int[4][];
//		array[0] = new int[4];
//		array[0] = new int[4];
//		int [][] array;
//		array = new int[4][];		
//		array[0] = new int[2];
		
		//배열리턴 함수 
//		int [] numArray;
//		numArray = makeArray();
//		for(int i = 0;i<numArray.length;i++)
//			System.out.print(numArray[i]);
//	}
	//배열리턴함수인 makeArray(main함수 외부정의, LoopArray 클래스 내부정의)
//	static int[] makeArray() { 
//		int [] temp = new int[4];
//		for(int i = 0;i<temp.length;i++)
//			temp[i] = i + 1;
//		return temp;
//	}	
//}

