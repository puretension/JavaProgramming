//import java.util.Scanner;
//import java.util.Random;
//
//class Dice{
//	int n;
//	public Dice(int n) { 
//		this.n = n;
//	}
//	public int roll() { 
//		return (int) (Math.random() * n) + 1;
//	}
//}
//
//public class diceGame {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Dice [] DiceArray = new Dice[100]; //객체 배열 생성 
//		int [] count = {-1,0,0,0,0,0,0};
//		for(int i = 0;i<100;i++)
//		{ 
//			DiceArray[i] = new Dice(6); //객체 생성 
//			count[DiceArray[i].roll()]++;
//		}
//		for(int i = 1;i<=6;i++)
//			System.out.println(i + "번째 나온 횟수: " + count[i]);
//		
//		Random rand1 = new Random();
//		int num1 = rand1.nextInt(10); //0~9
//		int num2 = (int)(Math.random() * 10);
//		
//		Random rand2 = new Random();
//		StringBuilder sb = new StringBuilder();
//		for(int i = 0;i<5;i++)
//		{ 
//			int num = rand2.nextInt(26) + 97;
//			sb.append((char) num);
//		}
//	}
//
//}
