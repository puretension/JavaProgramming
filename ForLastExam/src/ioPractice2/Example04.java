package ioPractice2;
import java.io.*;

public class Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			File file = new File("example03.txt");
//			if(!file.exists()) file.createNewFile();
//			FileInputStream fis = new FileInputStream(file);
//			int i = 0;
//			while((i = fis.read()) != -1) {
//				System.out.print((char)i);
//			}
//			fis.close();
//			System.out.println("파일 읽기 성공");
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		try {
			File file = new File("multiplication_table.txt");
			if(!file.exists()) file.createNewFile();
			FileInputStream fis = new FileInputStream(file);
			int i = 0;
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
