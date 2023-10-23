//package 명품JAVA;
//import java.util.Scanner;
//
//
//class Player{ 
//	String name;
//	String word;
//	Player(String name)
//	{ 
//		this.name = name;
//		word = "Unknown";
//	}
//}
//
//public class WordGameAppOpenChallenge2 {
//
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
//		int n = in.nextInt();
//		Player [] x = new Player[n];
//		for(int i = 0;i<x.length;i++)
//		{ 
//			System.out.print("참가자의 이름을 입력하세요>>");
//			String name = in.next();
//			x[i] = new Player(name);
//		}
//		String currentWord = "아버지";
//		System.out.println("시작하는 단어는 아버지입니다.");
//		int flag = 0;
//		while(flag != 1)
//		{ 
//			for(int i = 0;i<x.length;i++)
//		{ 
//			System.out.print(x[i].name + ">>");
//			x[i].word = in.next(); 
//			if(currentWord.charAt(currentWord.length() -1) != x[i].word.charAt(0))
//			{ 
//				String loser = x[i].name;
//				System.out.printf("%s이 졌습니다.\n", loser);
//				flag = 1;
//				break;
//			}
//			currentWord = x[i].word;
//		}
//		}
//	}
//
//}
