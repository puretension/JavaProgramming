//interface Role{
//	void doIt();
//}
//
//class Person {
//	Role r;
//	void getRole() {
//		r.doIt();
//	}
//	void setRole(Role r) {
//		this.r = r;
//	}
//	
//    public void doIt() {
//        // 역할을 수행하는 기본 동작
//        System.out.println("Person is doing something.");
//    }
//}
//class Driver implements Role {
//
//    @Override
//    public void doIt() {
//        System.out.println("Driving");  // 오버라이딩
//    }
//}
//
//class SoccerPlayer implements Role {
//
//    @Override
//    public void doIt() {
//        System.out.println("Playing Soccer");
//    }
//}
//
//class Worker implements Role {
//    @Override
//    public void doIt() {
//        System.out.println("Working");  // 오버라이딩
//    }
//}
//
//public class PeterCode{
//    public static void main(String[] args) {
//
//        Person person = new Person();  // 사람 객체 생성
//
//        person.doIt();  // 기본 동작 수행
//
////        person = new Driver();  // 운전자로 역할 변경
//        person.setRole(new Driver());
//        person.getRole();
//
//        //person = new Worker();  // 직장인으로 역할 변경
//        person.setRole(new Worker());
//        person.getRole();
//
//        //person = new SoccerPlayer(); // 축구 선수로 역할 변경
//        person.setRole(new SoccerPlayer());
//        person.getRole();
//    }
//}

//import java.util.*;
//public class PeterCode{
//	public static void main(String[]args) {
//		HashSet<String>mp = new HashSet<>();
//		mp.add("a");
//		mp.add("b");
//		mp.add(null);
//		mp.add(null);
//		for(String x: mp) {
//			System.out.println(x);
//		}
//	}
//}