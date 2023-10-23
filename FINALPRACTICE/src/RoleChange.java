//import java.util.*;
//
//abstract class Role{
//	abstract void doIt();
//}
//class Person {
//	
//	Role r;
//	
//	void getRole() {
//		r.doIt();
//	}
//	
//	void setRole(Role r) {
//		this.r = r;
//	}
//	
//    public void doIt() {
//    	System.out.println("Person is doing something");
//    }
//}
//
//class Driver extends Role{
//    public void doIt() {
//        System.out.println("Driving");  // 오버라이딩
//    }
//}
//
//class SoccerPlayer extends Role {
//    public void doIt() {
//        System.out.println("Playing Soccer");
//    }
//}
//
//class Worker extends Role {
//    public void doIt() {
//        System.out.println("Working");  // 오버라이딩
//    }
//}
//
//public class RoleChange {
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
////        person = new Worker();  // 직장인으로 역할 변경
//        person.setRole(new Worker());
//        person.getRole();
//
////        person = new SoccerPlayer(); // 축구 선수로 역할 변경
//        person.setRole(new SoccerPlayer());
//        person.getRole();
//    }
//}


//import java.util.Calendar;
//
//interface TimeProvider{
//	int getHour();
//}
//
//class MP3 {
//
//    private String name;
//
//    public void playSong() {
//        System.out.println("let's play~" + name);
//    }
//
//}
//
//class RealTimeProvider implements TimeProvider{
//	public int getHour() {
//		Calendar calendar = Calendar.getInstance();
//		int hour = calendar.get(Calendar.HOUR_OF_DAY);
//		return hour;
//	}
//}
//
//class TestTimeProvider implements TimeProvider{
//	int hour;
//	TestTimeProvider(int hour){
//		this.hour = hour;
//	}
//	public int getHour() {
//		return hour;
//	}
//}
//
//
//class TimeReminder {
//
//    private MP3 mp3;
//    
//    private TimeProvider timeProvider;
//    
//    public TimeReminder(TimeProvider timeProvider) {
//    	this.timeProvider = timeProvider;
//    }
//
//    public void reminder() {
////        Calendar calendar = Calendar.getInstance();
////        mp3 = new MP3();
////
////        int hour = calendar.get(Calendar.HOUR_OF_DAY);
//    	
//    	 mp3 = new MP3();
//    	 int hour = timeProvider.getHour();
//
//        if (hour >= 22) {
//            mp3.playSong();
//        }
//    }
//
//}
//
//
//public class RoleChange{
//	public static void main(String [] args) {
//		TimeProvider realTimeProvider = new RealTimeProvider();
//		TimeReminder timeReminder = new TimeReminder(realTimeProvider);
//		timeReminder.reminder();
//		
//		TimeProvider testTimeProvider = new TestTimeProvider(22);
//		timeReminder = new TimeReminder(testTimeProvider);
//		timeReminder.reminder();
//	}
//}

