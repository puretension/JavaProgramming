//import java.io.*;
//import java.lang.*;
//import java.util.*;
//
////class NegativeScoreException extends Exception{
////	public NegativeScoreException(String s) {
////		super(s);
////	}
////}
//
////class ScoreCalculator{
////	ArrayList<Integer>scores;
////	int sum = 0;
////	public ScoreCalculator() {
////		scores = new ArrayList<Integer>();
////	}
////	void addScore(int score) throws NegativeScoreException  {
////		if(score < 0) throw new NegativeScoreException("Score cannot be negative.");
////		scores.add(score);
////		sum += score;
////	}
////	int calculateTotalScore() {
////		return sum;
////	}
////}
//
//class ScoreCalculator{
//	ArrayList<Integer>scores;
//	int sum = 0;
//	public ScoreCalculator() {
//		scores = new ArrayList<Integer>();
//	}
//	void addScore(int score){
//		if(score < 0) throw new IllegalArgumentException("Score cannot be negative");
//		else
//		scores.add(score);
//		sum += score;
//	}
//	
//	int calculateTotalScore() {
//		return sum;
//	}
//}
//
//public class EX19_5 {
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ScoreCalculator calculator = new ScoreCalculator();
//		calculator.addScore(85);
//		calculator.addScore(90);
//		calculator.addScore(75);
//		calculator.addScore(-10);
//		int totalScore = calculator.calculateTotalScore();
//		System.out.println("Total Score: " + totalScore);
//	}
//}
