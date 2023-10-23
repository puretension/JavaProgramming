package ErrorPractice;

import java.util.*;
//
//class NegativeScoreException extends Exception {
//	NegativeScoreException(String message){
//		super(message);
//	}
//}
//
////class NegativeScoreException extends Exception{
//////차이점1(String선언, toString 오버라이딩)
////String str1;
////NegativeScoreException(String str2){
////	str1 = str2;
////}
////public String toString() {
////	return "Score cannot be negative.";
////}
//
//class ScoreCalculator{
//	private int total;
//	void addScore(int score) throws NegativeScoreException {
//		if(score < 0) throw new NegativeScoreException("Score cannot be negative");
//		else
//		total += score;
//	}
//	int calculateTotalScore() {
//		return total;
//	}
//}
//
//
//
////class ScoreCalculator{
////	private int total;
////	void addScore(int score) {
////		if(score < 0) throw new IllegalArgumentException("Score cannot be negative");
////		else
////		total += score;
////	}
////	int calculateTotalScore() {
////		return total;
////	}
////}
//
//public class EX19_4 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ScoreCalculator calculator = new ScoreCalculator();
//		try {
//		calculator.addScore(85);
//		calculator.addScore(90);
//		calculator.addScore(-10);
//		calculator.addScore(75);
//		}catch(NegativeScoreException e) {
//			System.out.println("Exception caught: " + e.getMessage());
//		}
//		int totalScore = calculator.calculateTotalScore();
//		System.out.println(totalScore);
//	}
//}



//class ScoreCalculator{
//	int total = 0;
//	void addScore(int num) {
//		if(num < 0) throw new IllegalArgumentException("Score cannot be negative");
//		total += num;
//	}
//	int calculateTotalScore() {
//		return total;
//	}
//}
//
//public class EX19_4{
//	public static void main(String [] args) {
//		ScoreCalculator calculator = new ScoreCalculator();
//		try {
//		calculator.addScore(85);
//		calculator.addScore(90);
//		calculator.addScore(75);
//		calculator.addScore(-10);
//		}catch(IllegalArgumentException e) {
//			e.printStackTrace();
//		}
//		int totalScore = calculator.calculateTotalScore();
//		System.out.println("Total Score: " + totalScore);
//	}
//}
