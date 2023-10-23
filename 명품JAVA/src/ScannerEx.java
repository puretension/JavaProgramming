//import java.util.Scanner;
//
//public class ScannerEx{ 
//	
//	public static void main(String [] args) { 
		//ex1
//		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");
//		Scanner in = new Scanner(System.in);
//		
//		String name = in.next();
//		System.out.print("이름은 " + name + ", ");
//		
//		String city = in.next();
//		System.out.print("도시는 " + city + ", ");
//		
//		int age = in.nextInt();
//		System.out.print("나이는 " + age + ", ");
//		
//		float weight = in.nextFloat();
//		System.out.print("체중은 " + weight + ", ");
//		
//		boolean solo = in.nextBoolean();
//		System.out.println("독신 여부는 " + solo + "입니다.");
		
		//ex2
//		Scanner in = new Scanner(System.in);
//		
//		System.out.print("정수를 입력하세요: ");
//		int value = in.nextInt();
//		int hour = value/3600; //(value/60)/60
//		int min = (value%3600)/60; //(value/60)%60
//		int sec = ((value%3600)%60); //value % 60
//		System.out.println(value + "초는 " + hour+ "시간, " + min + "분, " + sec+ "초입니다.");
//		
		//ex3 (증감 연산)
//		int a = 1;
//		//int b = ++a; //a는 2 b는 2
//		int b = a++; //a는 2 b는 1
		
//		int a = 3, b = 3, c = 3;
//		a += 3;
//		b *= 3;
//		c %= 2;
//		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
//		int d = 3;
//		a = d++;
//		System.out.printf("a = %d, d = %d\n", a,d); //a: ? d: ? 
//		a = ++d;
//		System.out.printf("a = %d, d = %d\n", a,d); //a: ? d: ? 
//		a = d--;
//		System.out.printf("a = %d, d = %d\n", a,d); //a: ? d: ?
//		a = --d;
//		System.out.printf("a = %d, d = %d\n", a,d); //a: ? d: ? 
//		int opr = 4;
//		int qpr = 4;
//		System.out.println(opr++); //4 
//		System.out.println(++qpr); //5
//		
//
//		ex4 논리연산 + 조건 연산
//		System.out.println((3 != 2) ^ (-1 > 0)); //XOR 연산자
//		int a = 3, b = 5;
//		System.out.println("두 수의 차는 " + ((a > b)? (a-b) : (b-a)));
//		double a = 2.5655;
//		System.out.printf("%-7.3f\n", a);
//		System.out.printf("%10.1f\n", a);
//		
//		float k = 2.555f;
//		System.out.printf("%10.1f\n", k);
//		int t = 22;
//		System.out.printf("%05d", t);
//	
//		ex5 비트 시프트 연산
//	}
//}
		