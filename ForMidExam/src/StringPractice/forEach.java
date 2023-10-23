package StringPractice;
import java.util.*;
import java.math.*;

public class forEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int [] num = {1,2,3,4,5};
//		int sum = 0;
//		
//		for(int k: num) { 
//			sum += k;
//		}
//		
//		String [] names = {"apple", "banana", "melon"};
//		for(String fruit: names) { 
//			System.out.print(fruit);
//		}
//		int [] arr = {1,2,3,5,6,7,8,10};
//		for(int number: arr) { 
//			System.out.print(number);
//		}
		
		Scanner in = new Scanner(System.in);
//		System.out.print("소문자 알파벳 하나를 입력하시오>> ");
//		char ch = in.next().charAt(0);
//		for(int i = 'a'; i <= ch;i++)
//		{ 
//			for(int j = i; j <= ch;j++)
//			{ 
//				System.out.print((char)j + " ");
//			}
//			System.out.println();
//		}
//		arr[i] = new char[col];
		
		
		//166page 8번 
//		System.out.print("정수 몇개? ");
//		int n = in.nextInt();
//		int row = n/10; //2 
//		
//		ArrayList<Integer> numsList = new ArrayList<>();
//
//		// 랜덤한 값을 ArrayList에 저장하면서 중복 체크
//		for(int i = 0; i < n; i++) {
//		    int num;
//		    do {
//		        num = (int) (Math.random() * 100) + 1;
//		    } while(numsList.contains(num)); // ArrayList에 이미 저장된 숫자인 경우 다시 랜덤값 생성
//		    numsList.add(num);
//		}
//
//		//2차원 배열 생성(row + 1 !!!!)
//		int [][] nums = new int[row + 1][];
//		for(int i = 0;i<row;i++)
//			 nums[i] = new int[10]; //막혓던 코드
//		
//		int x = n % 10;
//		nums[row] = new int[x];
//		
//		int idx = 0;
//		
//		for(int i = 0;i<nums.length;i++)
//		{
//			 for(int j = 0;j<nums[i].length;j++)
//				 nums[i][j] = numsList.get(idx++);
//		}
//		
//		
//		//2차원 배열 출력 
//		for(int i = 0;i<nums.length;i++)
//		{
//			 for(int j = 0;j<nums[i].length;j++)
//			 { 
//				 System.out.print(nums[i][j] + " ");
//			 }
//			 System.out.println();
//		}
		
		
//		int [][] arr = {{0,0,0,0}, {0,0,0,0}, {0,0,0,0},{0,0,0,0}};
//		
//		for(int count = 0; count <10;)
//		{ 
//			int i = (int)(Math.random() * 4);
//			int j = (int)(Math.random() * 4);
//			if(arr[i][j] == 0) { 
//				arr[i][j] = (int) (Math.random() * 10 + 1);
//				count++;
//			}
//		}
//		
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<4;j++) {
//				System.out.print(arr[i][j]+"\t");
//			}
//			System.out.println();
//		}
//		
//		String [] course = {"java", "C++", "HTML5", "컴구", "안드로이드"};
//		int [] score = {95,88,76,62,55};
		
		
//		int N,M,number;
//		N = in.nextInt();
//		HashMap<Integer,Integer>A = new HashMap<>(N);
//		for(int i = 0;i<N;i++)
//		{
//			number = in.nextInt();
//			A.put(number, 1);
//		}
//		M = in.nextInt();
//		for(int i = 0;i<M;i++)
//		{ 
//			number = in.nextInt();
//			if(A.containsKey(number))
//				System.out.println(1);
//			else System.out.println(0);
//		} 
		
//	myMethod1();
//	
//	
//	forEach myObj = new forEach();
//	myObj.myMethod2();
//	forEach.myMethod1();
		
		
		
	}
	
//	static void myMethod1() { 
//		System.out.println("정적 메서드 호출");
//	}
//	public void myMethod2() { 
//		System.out.println("인스턴스 메서드 호출");
//	}
	
}
