//
//
//interface One {
//    String s = "one";
//
//    String methodONE();
//}
//
//interface Two {
//    String methodONE();
//}
//
//abstract class Three {
//    String s = "three";
//
//    public abstract String methodONE();
//}
//
//class Four extends Three implements One, Two {
//	String x = super.s;
//	String s = One.s;
//	
//	public String methodONE() { 
//		return x + "+" + s;
//	}
//}
//
//public class InterfaceTest {
//    public static void main(String[] args) {
//        Four four = new Four();
//        System.out.println(four.methodONE());
//        System.out.println(four.s);
//    }
//}
