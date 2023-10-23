//
////1. Public class의 name과 file name은 동일해야한다.
//public class Hello {
//
//	public static void main(String[] args) {
//		//1. print, printf, println
//		int num = 5;
//		System.out.print("print ! " + num + "\n");	//print, 줄바꿈 포함X
//		System.out.print(num);
//		System.out.printf("printf ! %d \n", num);	//printf, 잘안씀. C와 완전 동일. %d %s로 쳐주기. 줄바꿈 포함X
//		System.out.println("println ! " + num);		//println, 괄호안에 출력후 줄바꿈 포함O
//		
//		System.out.print("안녕하세요! " + "반가워요! " + "저는 도형이에용!\n");
//		System.out.println("안녕하세요! " + "반가워요! " + "저는 도형이에용!");
//		
//		//2. 숫자 출력하기(괄호 잘 활용하기)
//		System.out.println("1 + 4 = " + (1 + 4)); // 1 + 4에 소괄호 안하면 14로 출력. 문자열로 받아들인다.
//		
//		//3. 변수
//		int number = 20;
//		System.out.println("정수의 값: " + number);
//		double number2 = 3.14;
//		System.out.println("정수 + 실수 값: " + (number + number2)); //정수 + 실수 연산 가능함.
//		float number3 = 3.14f;
//		System.out.println(number3);
//		char ch = 'A';
//		System.out.println(ch);
//		
//		//변수 연산 예제 및 문자 더하기 예제
//		
//		char fc = 'H';
//		char sc = 'E';
//		char tc = 'L';
//		char fourc = 'L';
//		char fic = 'O';
//		
//		System.out.println(fc + "" + sc+ "" + tc+ "" +fourc+ "" + fic); // ""안해주면 아스키코드값 372출
//		
//	}
//
//}
