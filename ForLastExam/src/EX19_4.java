//import java.lang.IllegalArgumentException;
//import java.util.*;
//
//class ScoreCalculator{
//	int totalScore;
//	void addScore(int score) {
//		if(score < 0) throw new IllegalArgumentException("Score cannot be negative");
//		totalScore += score; 
//	}
//	int calculateTotalScore() {
//		return totalScore;
//	}
//}
//
//
//public class EX19_4 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ScoreCalculator calculator = new ScoreCalculator();
//		calculator.addScore(85);
//		calculator.addScore(90);
//		calculator.addScore(75);
//		calculator.addScore(-10);
//		
//		int totalScore = calculator.calculateTotalScore();
//		System.out.println("Total Score: " + totalScore);
//	}
//}
