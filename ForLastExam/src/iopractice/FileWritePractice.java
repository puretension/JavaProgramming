package iopractice;
import java.io.*;
import java.util.*;

//스트림 write후에 close는 필수임!!

public class FileWritePractice{

	public static void main(String[] args) {
		//바이트 출력 스트림으로 데이터 쓰기
//		String str = "Hello, James!";
//		try {
//			File file = new File("example02.txt");
//			if(!file.exists()) file.createNewFile();
//			FileOutputStream fos = new FileOutputStream(file);
//			byte[] b = str.getBytes();
//			fos.write(b);
//			fos.close();
//			System.out.println("파일 쓰기 성공");
//		}catch(Exception e) {
//			e.getMessage();
//		}
	
//		//문자 출력 스트림으로 데이터 쓰기
//		try {
//			File file = new File("example04.txt");
//			if(!file.exists()) file.createNewFile();
//			FileWriter fw = new FileWriter(file);
//			
//			fw.write("Hello, ");
//			fw.write("Scott!");
//			fw.close();
//		}catch(IOException e) {e.printStackTrace();}
		
//		//키보드로 아이디 이름 입력받는 while문(문자열 스트림 사용)
//		try {
//			File file = new File("member2.txt");
//			if(!file.exists()) file.createNewFile();
//			FileWriter fw = new FileWriter(file);
//			Scanner input = new Scanner(System.in);
//			boolean quit = false;
//			
//			while(!quit) {
//				System.out.print("아이디: ");
//				String userID = input.next();
//				fw.write("아이디: " + userID + " ");
//				System.out.print("이름: ");
//				String name = input.next();
//				fw.write("이름: " + name + "\n");
//				System.out.println("계속 진행? Y | N ");
//				input.nextLine();
//				String str = input.nextLine();
//				if(str.toUpperCase().equals("N")) quit =true;
//			}
//			fw.close();
//			System.out.println("파일 쓰기 성공");
//		}catch(Exception e) {e.getMessage();}
		
//		try {
//			File file = new File("member04.txt");
//			if(!file.exists()) file.createNewFile();
//			Scanner in = new Scanner(System.in);
//			FileWriter fw = new FileWriter(file);
//			
//			boolean quit = true;
//			while(quit) {
//			System.out.print("아이디: ");
//			String id = in.next();
//			System.out.print("이름: ");
//			String name = in.next();
//			fw.write("아이디: " + id + " 이름: " + name + "\n");
//			System.out.println("계속 진행? Y | N");
//			in.nextLine();
//			String str = in.nextLine();
//			if(str.toUpperCase().equals("N")) quit = false;
//			}
//			fw.close();
//			System.out.println("파일쓰기성공");
//		} catch(IOException e) { e.printStackTrace();}
		
	}
}
