//import java.util.*;
//
//class ScoreCalculator{
//	List<Integer> scores;
//	int totalScore;
//	
//	public ScoreCalculator() {
//		scores = new ArrayList<>();
//		totalScore = 0;
//	}
//	
//	public void addScore(int score) {
//		//cmd shift B BreakPoint설정 단축키, cmd R로 에러 뜨는지 확인
//		if(score < 0) throw new IllegalArgumentException("Score cannot be negative");
//		scores.add(score);
//		totalScore += score;
//	}
//	
//	public int calculateTotalScore() {return totalScore;}
//}
//
//public class EX19_4 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ScoreCalculator calculator = new ScoreCalculator();
//		calculator.addScore(85);
//		calculator.addScore(90);
//		calculator.addScore(75);
//		//calculator.addScore(-10);
//		
//		int totalScore = calculator.calculateTotalScore();
//		System.out.println("Total Score: " + totalScore);
//	
//	}
//
//}
