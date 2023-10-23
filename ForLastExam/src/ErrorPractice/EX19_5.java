//package ErrorPractice;
//
//class ScoreCalculator{
//int total = 0;
//void addScore(int num) {
//	if(num < 0) throw new IllegalArgumentException("Score cannot be negative");
//	total += num;
//}
//int calculateTotalScore() {
//	return total;
//}
//}
//
//class NegativeScoreException extends Exception{
//	public NegativeScoreException(String str) {
//		super(str);
//	}
//}
//
//public class EX19_5{
//public static void main(String [] args) {
//	ScoreCalculator calculator = new ScoreCalculator();
//	try {
//	calculator.addScore(85);
//	calculator.addScore(90);
//	calculator.addScore(75);
//	calculator.addScore(-10);
//	}catch(IllegalArgumentException e) {
//		System.out.println("Exception caught: " + e.getMessage());
//	}
//	int totalScore = calculator.calculateTotalScore();
//	System.out.println("Total Score: " + totalScore);
//}
//}
