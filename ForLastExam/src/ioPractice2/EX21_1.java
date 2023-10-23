//package ioPractice2;
//
//import java.util.*;
//import java.io.*;
//
//public class EX21_1 {
//	public static void main(String [] args) {
//		try {
//			readFile("multiplication_table.txt");
//		}catch(IOException e) {
//			System.out.println("An error occurred while reading the file: " + e.getMessage());
//			e.printStackTrace();
//		}
//	}
//	public static void readFile(String fileName) throws IOException{
//		FileReader fr = null;
//		try {
//		fr = new FileReader(fileName);
//		BufferedReader br = new BufferedReader(fr);
//		String line;
//		
//		while((line = br.readLine()) != null) {
//			System.out.println(line);
//		}
//		} finally {
//			if(fr != null) {
//				try {
//					fr.close();
//				}catch(IOException e) {
//					System.out.println("An error occurred while closing the file " + e.getMessage());
//					e.printStackTrace();
//				}
//			}
//		}
//	}
//}
