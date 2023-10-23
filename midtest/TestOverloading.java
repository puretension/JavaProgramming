//
//
//
//public class TestOverloading {
//   // todo: add 메소드들을 구현하시오. (implement add methods)
//	static void add(double a, double b) { 
//		//System.out.println("double, double is called, result = " + (a + b));
//		double c = a + b;
//		System.out.printf("(double, double) is called, result = %.6f\n", c);
//	}
//	
//	static void add(int a, double b) { 
//		double c = (double) a + b;
//		System.out.printf("(int, double) is called, result = %.6f\n", c);
//	}
//	
//	static void add(int a, float b) { 
//		double c = (double)a + (double)b;
//		System.out.printf("(int, float) is called, result = %.6f\n", c);
//	}
//
//    public static void main(String... str) {
//        add(3.0, 5.0);
//        add(7, 5.0);
//        add(7, 2.12f);
//    }
//}