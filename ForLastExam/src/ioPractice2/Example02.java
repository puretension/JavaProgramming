//package ioPractice2;
//import java.io.*;
//
//public class Example02 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String str = "Hello Java Programming@@";
//		try {
//			File file = new File("example02.txt");
//			if(!file.exists()) file.createNewFile();
//			FileOutputStream fos = new FileOutputStream(file);
//			byte [] b = str.getBytes();
//			fos.write(b);
//			fos.close();
//		}catch(IOException e) {
//			System.out.println(e.getLocalizedMessage());
//		}
//	}
//
//}
