//import java.util.Arrays;
//import java.util.ArrayList;
////class Calculator {
////    int value;
////
////    Calculator() {
////        this.value = 0;
////    }
////
////    void add(int val) {
////        this.value += val;
////    }
////
////    int getValue() {
////        return this.value;
////    }
////}
////
////class MaxLimitCalculator extends Calculator { 
////	int getValue() { 
////		if(this.value > 100)
////			return 100;
////		return 100;
////	}
////}
////
////class UpgradeCalculator extends Calculator { 
////	void minus(int val) { 
////		this.value -= val;
////	}
////}
//
////class Calculator{ 
////	boolean isOdd(int val) { 
////		return (val % 2 != 0) ? true : false;
////	}
////}
//
////class Calculator{ 
////	//argument가 배열일
////	int avg(int [] data) { 
////		int avgValue = 0;
////		int result = 0;
////		for(int i = 0;i<data.length; i++)
////			{ 
////			avgValue += data[i];
////			if(i == data.length-1)
////				result = avgValue/(data.length);
////			}
////		return result;
////	}
////	
////	//argument가 ArrayList일때
////	int avg2(ArrayList <Integer> data) { 
////		int avgValue = 0;
////		int result = 0;
////		for(int i = 0;i<data.size(); i++)
////			{ 
////			avgValue += data.get(i);
////			if(i == data.size()-1)
////				result = avgValue/(data.size());
////			}
////		return result;
////	}
////}
//
//interface Mineral{ 
//	int getValue();
//}
//
//class Gold implements Mineral{
//	public int getValue() { 
//		return 100;
//	}
//}
//
//class Silver implements Mineral {
//	public int getValue() { 
//		return 90;
//	}
//}
//
//class Bronze implements Mineral {
//	public int getValue() { 
//		return 80;
//	}
//}
//
//class MineralCalculator {
//    int value = 0;
//
////    public void add(Gold gold) {
////        this.value += 100;
////    }
////
////    public void add(Silver silver) {
////        this.value += 90;
////    }
////
////    public void add(Bronze bronze) {
////        this.value += 80;
////    }
//    
//    public void add(Mineral mineral) { 
//    	this.value += mineral.getValue();
//    }
//    
//    public int getValue() { 
//    	return this.value;
//    }
//}
//
//
//public class Sample1 {
//    public static void main(String[] args) {
//    	//1.
////        UpgradeCalculator cal = new UpgradeCalculator();
////        cal.add(10);
////        cal.minus(3);
////        System.out.println(cal.getValue());  // 10 출력
//    	//2.
////    	MaxLimitCalculator cal = new MaxLimitCalculator();
////    	cal.add(50);  // 50 더하기
////    	cal.add(60);  // 60 더하기
////    	System.out.println(cal.getValue());  // 100 출력
//    	//3.
////    	Calculator cal = new Calculator();
////    	System.out.println(cal.isOdd(3));  // 3은 홀수이므로 true 출력
////    	System.out.println(cal.isOdd(4));  // 4는 짝수이므로 false 출력
//    	//4.
////    	int [] data = {1,3,5,7,9};
////    	Calculator cal = new Calculator();
////    	ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1,3,5,7,9));
////    	int result1 = cal.avg(data);
////    	int result2 = cal.avg2(data2);
////    	System.out.println(result2); //ArrayList출력
//    	  MineralCalculator cal = new MineralCalculator();
//          cal.add(new Gold());
//          cal.add(new Silver());
//          cal.add(new Bronze());
//          System.out.println(cal.getValue());  // 270 출력
//    }
//}