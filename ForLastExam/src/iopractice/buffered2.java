//package iopractice;
//import java.util.*;
//import java.io.*;
//
//public class buffered2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String outputFile = "src/employee2.csv";
//		try(BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))){
//			String data = "Hello, world";
//			writer.write(data);
//			writer.newLine();
//			writer.write("This is another line.");
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//	}
//}
