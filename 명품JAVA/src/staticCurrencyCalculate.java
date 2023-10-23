//import java.util.Scanner;
//
////231페이지 한번더 해보기 
//
//class CurrencyConverter{ 
//	static double rate;
//	double money;
//	static double toDollar(double won) { 
//		return won/rate;
//	}
//	static double toWon(double dollar) { 
//		return dollar * rate;
//	}
//	static void set(double r) { 
//		rate = r;
//	}
//}
//
//public class staticCurrencyCalculate {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		System.out.print("환율(1달러)>> ");
//		double rate = in.nextDouble();
//		CurrencyConverter.set(rate);
//		CurrencyConverter.toDollar(1000000);
//		System.out.print("백만원은 $" + CurrencyConverter.toDollar(1000000) + "입니다.");
//		System.out.print("$100은 " + CurrencyConverter.toWon(100) + "입니다.");
//	}
//
//}
