import java.util.Scanner;


public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);
		
		
		//구구단 
		for(int i = 2; i<=4 ; i++)
		{ 
			System.out.printf("구구단 %d 단\n",i);
			for(int j = 1; j <= 9 ; j++) { 
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.printf("\n");
		}
		
		//홀수, 7의 배수는 아닌 것  
		int sum = 0;
		for(int i = 1;i < 1000;i++)
		{ 
			if(i % 2 != 0)
			{ 
				if(i % 7 != 0)
					sum += i;
			}
		}
		
		System.out.printf("7의 배수가 아닌 1000미만 홀수의 합: %d\n", sum);

		//최대공약수 
		System.out.println("두 수를 입력하세요.");
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		while(b != 0) { 
			int r = a % b;
			a = b;
			b = r;
		}
		System.out.printf("두 수의 최대공약수: %d\n", a);
		
		
		//별 찍기 
		System.out.printf("정수를 입력하세요: ");
		int star = in.nextInt();
		
		for(int i = 0;i< star; i++) { 
			for(int j = 0; j < i;j++)
				System.out.print(" ");
			for(int k = star * 2 - (2 * i); k > 1; k--)
				System.out.print("*");
			System.out.printf("\n");
		}
		
		
		//배열 역순 출력문
		
		int [] evenNum = new int[10];
		
		System.out.printf("짝수만 배열의 원소로 10개 입력해주세요!\n");
		
		for(int i = 0;i<10;i++) { 
			int num = in.nextInt();
			if(num % 2 != 0)
				{ 
				System.out.printf("%d는 짝수가 아니므로 저장X, continue\n", num);
				continue;
				}
			evenNum[i] = num;
		}
		
		for(int i = 9; i >= 0; i--) { 
			System.out.printf("%d ", evenNum[i]);
		}
		
	}
	
	
	

}
