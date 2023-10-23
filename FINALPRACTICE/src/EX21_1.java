//import java.io.*;
//
//public class EX21_1 {
//	public static void main(String[] args) {
//		try {
//			readFile("nonexistent_file.txt");
//		}catch(IOException e) {
//			System.out.println("An error occurred while reading the file: " + e.getMessage());
//			e.printStackTrace();
//		}
//	}
//	
//	public static void readFile(String filename) throws IOException{
//		FileReader fileReader = null;
//		try {
//			fileReader = new FileReader(filename);
//			BufferedReader bf = new BufferedReader(fileReader);
//			String line;
//			while((line = bf.readLine()) != null) {
//				System.out.println(line);
//			}
//			
//		}
//		finally {
////			if(fileReader != null) {
////				try {
////					fileReader.close();
////				}catch(IOException e) {
////					//System.out.println("An error occured while closing the file: " + e.getMessage());
////					//e.printStackTrace();
////				}
////			}
//		}
//	}
//}

import java.io.*;

public class EX21_1{
	public static void main(String[] args) {
		//method(true);
		method(false);
	}
	static void method(boolean b) {
		try {
			System.out.println(1);
			if(b) System.exit(0);
			System.out.println(2);
		}catch(ArrayIndexOutOfBoundsException r) {
			System.out.println(3);
			return;
		}catch(IndexOutOfBoundsException e) {
			System.out.println(4);
			return;
		}finally {
			System.out.println(5);
		}System.out.println(6);
	}
}
