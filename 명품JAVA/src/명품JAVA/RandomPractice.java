//package 명품JAVA;
//import java.util.Scanner;
//import java.util.Random;
//
//class Player{ 
//	private String name;
//	private Scanner in = new Scanner(System.in);
//	public Player(String name) { this.name = name;}
//	public String getName() {return name;}
//	public int turn() { 
//		System.out.print(name + "[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
//		return in.nextInt();
//	}
//}
//
//class Computer extends Player{
//
//	public Computer(String name) {
//		super(name);
//	} 
//	public int turn() { 
//		return (int) Math.random() * 3 + 1;
//	}
//	
//}
//
//class Rps{ 
//	
//	private final String s[] = {"가위", "바위", "보"};
//	private Player [] players = new Player[2]; //class내부에 객체 배열을 생성했다면?
//	//생성자에서 커버처준다 
//	public Rps() { 
//		players[0] = new Player("철수");
//		players[1] = new Computer("컴퓨터");
//	}
//	
//	public void run() { 
//		int userChoice, comChoice;
//		while(true) { 
//			userChoice = players[0].turn();
//			if(userChoice == 4) break;
//			
//			comChoice = players[1].turn();
//			
//			if(userChoice <1 || comChoice >3) { 
//				System.out.println("잘못입력하였습니다.");
//			}
//			
//			else { 
//				System.out.print(players[0].getName() + "(" + s[userChoice-1] + ")" + ":");
//				System.out.print(players[1].getName() + "(" + s[comChoice-1] + ")");
//				
//				int diff = userChoice - comChoice;
//				
//				switch(diff) { 
//				case 0: System.out.println("비겼습니다.");
//						break;
//				case -1: // 사용자가 가위, 컴퓨터가 바위 또는 사용자가 바위, 컴퓨터가 보
//				case 2:	// 사용자가 보, 컴퓨터가 가위
//					System.out.println(players[1].getName()+"가 이겼습니다.");
//					break;
//				case 1: // 사용자가 바위, 컴퓨터가 가위 또는 사용자가 보, 컴퓨터가 바위
//				case -2: // 사용자가 가위, 컴퓨터가 보
//					System.out.println(players[0].getName()+"가 이겼습니다.");
//				}
//			}
//		}
//	}
//	
//}
//
//public class RandomPractice {
//
//	public static void main (String[] args) {
//		Rps game = new Rps();
//		game.run();
//	}
//
//}
