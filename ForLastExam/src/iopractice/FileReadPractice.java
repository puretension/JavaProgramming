package iopractice;
import java.io.*;
import java.util.*;

public class FileReadPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//바이트 입력 스트림으로 데이터 읽기
//		try {
//			File file = new File("member04.txt");
//			if(!file.exists()) file.createNewFile();
//			
//			//이러면 한글이 깨짐
////			FileInputStream fis = new FileInputStream(file);
////			int i = 0;
////			while((i = fis.read()) != -1) {
////				System.out.print((char)i);
//				
//			//문자스트림(Reader)이용하여 바이트스트림(FileInputStream)을 UTF-8로 인코딩 후 br로 읽기
//			FileInputStream fis = new FileInputStream(file);
//			InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
//			BufferedReader br = new BufferedReader(isr);
//			String line;
//			while((line = br.readLine()) != null) {
//				System.out.println(line);
//			} fis.close();
//			System.out.println("\n파일 읽기 성공");
//		}catch(Exception e) {e.getMessage();}
		
//		try {
//			File file = new File("multiplication_table.txt");
//			if(!file.exists()) file.createNewFile();
////			FileInputStream fis = new FileInputStream(file);
////			int i = 0;
////			while((i = fis.read()) != -1) {
////				System.out.print((char) i);
////			}
//			
//			FileInputStream fis = new FileInputStream(file);
//			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
//			BufferedReader br = new BufferedReader(isr);
//			String str;
//			while((str = br.readLine()) != null) {
//				System.out.println(str);
//			}
//			
//			fis.close();
//		}catch(IOException e) {e.printStackTrace();}
		
//		//문자 입력 스트림으로 데이터 읽기
//		try {
//			File file = new File("example03.txt");
//			if(!file.exists()) file.createNewFile();
//			FileReader fis = new FileReader(file);
//			int i = 0;
//			while((i = fis.read())!= -1) System.out.print((char) i);
//			fis.close();
//			System.out.println("\n파일 읽기 성공");
//		} catch(Exception e) {e.printStackTrace();}
		
//		try {
//			File file = new File("member04.txt");
//			if(!file.exists()) file.createNewFile();
//			FileReader fis = new FileReader(file);
//			int i = 0;
//			while((i = fis.read()) != -1) {
//				System.out.print((char)i);
//			}
//			fis.close();
//			System.out.println("파일 읽기 성공");
//		}catch(IOException e) {e.printStackTrace();}
	}
}
