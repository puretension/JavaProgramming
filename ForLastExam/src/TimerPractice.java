	//import java.util.Calendar;
	//
	//interface TimeProvider {
	//    int getCurrentHour();
	//}
	//
	////실제 시간 
	//class RealTimeProvider implements TimeProvider {
	//    @Override
	//    public int getCurrentHour() {
	//        Calendar calendar = Calendar.getInstance();
	//        return calendar.get(Calendar.HOUR_OF_DAY);
	//    }
	//}
	//
	//
	////테스트 시간 
	//class TestTimeProvider implements TimeProvider {
	//    private int hourOfDay;
	//
	//    public TestTimeProvider(int hourOfDay) {
	//        this.hourOfDay = hourOfDay;
	//    }
	//
	//    public int getCurrentHour() {
	//        return hourOfDay;
	//    }
	//}
	//
	//class MP3 {	
	//    private String name;
	//
	//    public void playSong() {
	//        System.out.println("Let's play~ " + name);
	//    }
	//}
	//
	//class TimeReminder {
	//    private MP3 mp3; //MP3객체를 저장프로퍼티로 정의 
	//    private TimeProvider timeProvider; //TimeProvider객체를 저장프로퍼티로 정의 
	//
	//    //인터페이스 타입을 파라미터로 받고 timeProvider를 받았을때만 mp3객체가 생성되게하고 reminder메서드 실행과도 연결 
	//    public TimeReminder(TimeProvider timeProvider) {
	//        this.timeProvider = timeProvider;
	//        mp3 = new MP3();
	//    }
	//    public void reminder() {
	//        int hour = timeProvider.getCurrentHour();
	//
	//        if (hour >= 22) {
	//            mp3.playSong();
	//        }
	//    }
	//}
	//
	//public class EX20_2 {
	//    public static void main(String[] args) {
	//        // 실제 시간을 사용하는 경우
	//        TimeProvider realTimeProvider = new RealTimeProvider();
	//        TimeReminder timeReminder = new TimeReminder(realTimeProvider);
	//        timeReminder.reminder();
	//
	//        // 테스트용 시간을 사용하는 경우
	//        TimeProvider testProvider = new TestTimeProvider(22);
	//        timeReminder = new TimeReminder(testProvider);
	//        timeReminder.reminder();
	//    }
	//}
	//
