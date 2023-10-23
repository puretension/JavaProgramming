//import java.util.Scanner;
//
//abstract class Converter { 
//	abstract protected double convert(double src);
//	abstract protected String getSrcString();
//	abstract protected String getDestString();
//	protected double ratio;
//	
//	public void run() { 
//		Scanner in = new Scanner(System.in);
//		System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
//		System.out.print(getSrcString() + "을 입력하세요>> ");
//		double val = in.nextDouble();
//		double res = convert(val);
//		System.out.println("반환 결과: " + res + getDestString() + "입니다.");
//		in.close();
//	}
//}
//
//class Km2Mile extends Converter{ 
//	protected String getSrcString() { return "Km";}
//	protected String getDestString() {return "mile";}
//	protected double convert(double src) { 
//		return src/ratio;
//	}
//	public Km2Mile(double ratio) { 
//		this.ratio = ratio;
//	}
//}
//
//class Won2Dollar extends Converter{ 
//	protected String getSrcString() { return "원"; }
//	protected String getDestString() {return "달러";}
//	protected double convert(double src) { 
//		return src/ratio;
//	}
//	public Won2Dollar(double ratio)
//	{ 
//		this.ratio = ratio;
//	}
//}
//
//
//public class abstractCurrency {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		Won2Dollar toDollar = new Won2Dollar(1200);
////		toDollar.run();
//		
//		Km2Mile toMile = new Km2Mile(1.6);
//		toMile.run();
//	}
//
//}
