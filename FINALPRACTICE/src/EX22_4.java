//import java.util.*;
//
//interface Worker {
//    void work();
//
//    void eat();
//
//    void order();
//}
//
//interface Workable{
//	void work();
//}
//
//interface Eatable {
//	void eat();
//}
//
//interface Orderable{
//	void order();
//}
//
//class Programmer implements Workable {
//    @Override
//    public void work() { System.out.println("프로그래머가 일을 합니다."); }
////    @Override
////    public void eat() { System.out.println("프로그래머가 식사를 합니다."); }
////    @Override
////    public void order() { System.out.println("프로그래머가 잠을 잡니다."); }
//}
//
//class Chef implements Workable, Eatable, Orderable{
//	public void work() {
//		
//	}
//	public void eat() {
//		
//	}
//	
//	public void order() {
//		
//	}
//}
//
//class Manager implements Worker {
//    @Override
//    public void work() { System.out.println("매니저가 업무를 처리합니다."); }
//    @Override
//    public void eat() { System.out.println("매니저가 식사를 합니다."); }
//    @Override public void order() { System.out.println("매니저가 명령을 합니다."); }
//}
//
//public class EX22_4 {
//    public static void main(String[] args) {
//        Programmer programmer = new Programmer();
//        Manager manager = new Manager();
//        
//        programmer.work(); //work
//
//        manager.work();
//        manager.eat(); 
//        manager.order();
//    }
//}