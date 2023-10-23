//import java.util.*;
//import java.lang.*;
//
////class NegativeScoreException extends Exception{
////	public NegativeScoreException(String str) {
////		super(str);
////	}
////}
//
//class ScoreCalculator {
//	int sumScore = 0;
////	void addScore(int score) throws NegativeScoreException {
////		if(score < 0) throw new NegativeScoreException("Score cannot be negative");
////		else this.sumScore += score;
////	}
//	void addScore(int score){
//		if(score < 0) throw new IllegalArgumentException("Score cannot be negative");
//		else this.sumScore += score;
//	}
//	
//	int calculateTotalScore() {
//		return sumScore;
//	}
//}
//
//public class EX19_4 {
//	public static void main(String[] args) {
//		ScoreCalculator calculator = new ScoreCalculator();
////		try {
////		calculator.addScore(85);
////		calculator.addScore(90);
////		calculator.addScore(-10);
////		calculator.addScore(75);
////		}catch(NegativeScoreException e) {
////			System.out.println("Exception caught: " + e.getMessage());
////		}
//		
//		calculator.addScore(85);
//		calculator.addScore(90);
//		calculator.addScore(-10);
//		calculator.addScore(75);
//		int totalScore = calculator.calculateTotalScore();
//		System.out.println("Total Score: " +  totalScore);
//	}
//}
