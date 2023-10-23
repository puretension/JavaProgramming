import java.io.*;
import java.io.IOException;
import java.util.*;



public class FilePractice {

	public static void main(String[] args) {
//		File finfo = new File("src/Exercise11_1.java");
//		if(finfo.exists()) {
//			System.out.println("파일 이름: " + finfo.getName());
//		}
//		String str = "Hello Java Programming ";
//		try {
//			File file = new File("example02.txt");
//			if(!file.exists()) file.createNewFile();
//			FileOutputStream fos = new FileOutputStream(file);
//			
//			byte[] b = str.getBytes();
//			fos.write(b);
//			fos.close();
//			System.out.println("성공");
//		}catch(IOException e) {}
		
		String str = "Hello!";
		byte[] b = str.getBytes();
		try {
			File file = new File("example02.txt");
			if(!file.exists()) file.createNewFile();
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(b);
			fos.close();
			System.out.println("성공");
		}catch(IOException e) {
			e.getMessage();
		}
		
	}

}
