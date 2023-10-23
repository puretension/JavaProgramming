//
//class A1 {
//    public void doA1() {
//        System.out.println("Executing A1's doA1()");
//        //System.out.println("Executing A1's doA1()");
//        A2 a2 = new A2(); //2
//        a2.doA2(this); //3 
//    }
//
//    public void doIt(A3 a3) {
//        System.out.println("Executing A1's doIt()");
//        a3.doIt(); //6
//    }
//}
//
//class A2 {
//    public void doA2(A1 a1) {
//        System.out.println("Executing A2's doA2()");
//        A3 a3 = new A3(); //4
//        a1.doIt(a3); //5 
//    }
//}
//
//class A3 {
//    public void doIt() {
//        System.out.println("Executing A3's doIt()");
//    }
//}
//public class Who {
//    public static void main(String[] args) {
//        A1 a1 = new A1();
//        a1.doA1(); //1
//    }
//}