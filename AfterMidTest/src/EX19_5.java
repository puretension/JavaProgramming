////오류 코드 
//import java.util.ArrayList;
//import java.util.List;
//
//class ScoreCalculator{
//List<Integer> scores;
//int totalScore;
//
//public ScoreCalculator() {
//    scores = new ArrayList<>();
//    totalScore = 0;
//}
//
//public void addScore(int score) {
////cmd shift B BreakPoint설정 단축키, cmd R로 에러 뜨는지 확인
//if(score < 0) throw new IllegalArgumentException("Score cannot be negative");
//scores.add(score);
//totalScore += score;
//}
//
//public int calculateTotalScore() {return totalScore;}
//
//}
//
//class NegativeScoreException extends RuntimeException {
//    public NegativeScoreException(String message) {
//        super(message);
//    }
//}
//
//public class EX19_5 {
//
//    public static void main(String[] args) {
//        ScoreCalculator calculator = new ScoreCalculator();
//
//        try {
//        	calculator.addScore(85);
//        	calculator.addScore(90);
//            calculator.addScore(-10);
//            calculator.addScore(75);
//        } catch (NegativeScoreException e) {
//            System.out.println("Exception caught: " + e.getMessage());
//        }
//        
//        int totalScore = calculator.calculateTotalScore();
//        // 총점 출력
//        System.out.println("Total Score: " + totalScore);
//    }
//}

//import java.util.ArrayList;
//import java.util.List;
//
//class ScoreCalculator {
//    List<Integer> scores;
//    int totalScore;
//
//    public ScoreCalculator() {
//        scores = new ArrayList<>();
//        totalScore = 0;
//    }
//
//    public void addScore(int score) {
//        if (score < 0) //IllegalArgumentException thorw
//            throw new NegativeScoreException("Score cannot be negative");
//        scores.add(score);
//        totalScore += score;
//    }
//
//    public int calculateTotalScore() {
//        return totalScore;
//    }
//}
//
//class NegativeScoreException extends RuntimeException {
//    public NegativeScoreException(String message) {
//        super(message);
//    }
//}
//
//public class EX19_5 {
//    public static void main(String[] args) {
//        ScoreCalculator calculator = new ScoreCalculator();
//
//        try {
//            calculator.addScore(85);
//            calculator.addScore(90);
//            calculator.addScore(-10);
//            calculator.addScore(75);
//        } catch (NegativeScoreException e) {
//            System.out.println("Exception caught: " + e.getMessage());
//        }
//
//        int totalScore = calculator.calculateTotalScore();
//        System.out.println("Total Score: " + totalScore);
//    }
//}
//


////20-2 before code
//import java.util.Calendar;
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
//
//class TimeReminder {
//
//    private MP3 mp3;
//
//    public void reminder() {
//        Calendar calendar = Calendar.getInstance();
//        mp3 = new MP3();
//
//        int hour = calendar.get(Calendar.HOUR_OF_DAY);
//
//        if (hour >= 22) {
//            mp3.playSong();
//        }
//    }
//
//}
//
//public class EX20_2 {
//public static void main(String[] args) {
//	//실제 시간을 사용하는 경우 
//	TimeProvider realTimeProvider = new RealTimeProvider();
//	TimeReminder timeReminder = new TimeReminder(realTimeProvider);
//	timeReminder.reminder();
//	
//	//테스트용 시간을 사용하는 경우
//	TimeProvider testProvider = new TestTimeProvider(hourOfDay: 22);
//	timeReminder = new TimeReminder(testTimeProvider);
//	timeReminder.reminder();
//	}
//}