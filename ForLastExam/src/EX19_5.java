//import java.util.*;
//import java.lang.*;
//
//class ScoreCalculator{
//	int totalScore;
//	void addScore(int score) throws NegativeScoreException {
//		if(score < 0) throw new NegativeScoreException("Score cannot be negative");
//		totalScore += score; 
//	}
//	int calculateTotalScore() {
//		return totalScore;
//	}
//}
//
//
////방법1(사용자 에러 정의)
//class NegativeScoreException extends Exception{
//	//차이점1(String선언, toString 오버라이딩)
//	String str1;
//	NegativeScoreException(String str2){
//		str1 = str2;
//	}
//	public String toString() {
//		return "Score cannot be negative.";
//	}
//}
//
//class NegativeScoreException extends Exception {
////차이점 1(RuntimeException)
//public NegativeScoreException(String message) {
//super(message);
//}
//}
//
//public class EX19_5 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ScoreCalculator calculator = new ScoreCalculator();
//		try {
//		calculator.addScore(85);
//		calculator.addScore(90);
//		calculator.addScore(-10);
//		calculator.addScore(75);
//		} catch(NegativeScoreException e) { 
//			System.out.println("Exception caught: " + e); //차이점2 e
//		}
//		int totalScore = calculator.calculateTotalScore();
//		System.out.println("Total Score: " + totalScore);
//	}
//}
//
//
//////방법 2(RuntimeException)
//////(클래스는 위와동일)
////class ScoreCalculator{
////int totalScore;
////void addScore(int score) throws NegativeScoreException {
////	if(score < 0) throw new NegativeScoreException("Score cannot be negative");
////	totalScore += score; 
////}
////int calculateTotalScore() {
////	return totalScore;
////}
////}
////
////class NegativeScoreException extends Exception {
////	//차이점 1(RuntimeException)
////public NegativeScoreException(String message) {
////  super(message);
////}
////}
//// 
////public class EX19_5 {
////public static void main(String[] args) {
////  ScoreCalculator calculator = new ScoreCalculator();
////
////  try {
////      calculator.addScore(85);
////      calculator.addScore(90);
////      calculator.addScore(-10);
////      calculator.addScore(75);
////  } catch (NegativeScoreException e) {
////      System.out.println("Exception caught: " + e.getMessage()); //차이점 2 
////  }
////
////  int totalScore = calculator.calculateTotalScore();
////  System.out.println("Total Score: " + totalScore);
////}
////}