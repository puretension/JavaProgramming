//package iopractice;
//import java.io.*;
//import java.util.*;
//
//public class buffered{
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String input = "src/employee3.csv";
//		try(BufferedWriter writer = new BufferedWriter(new FileWriter(input))){
//			List<List<String>>allData = readCSV();
//			for(List<String>newLine: allData) {
//				List<String>list = newLine;
//				for(String data: list) {
//					writer.write(data);
//					writer.write(",");
//				}
//				writer.write("주소"); //변형예제 충분히 가능함
//				writer.newLine();
//			}
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	public static List<List<String>>readCSV() { 
//		String input = "src/employee2.csv";
//		List<List<String>>records = new ArrayList<>();
//		try(BufferedReader reader = new BufferedReader(new FileReader(input))){
//			String line;
//			while((line = reader.readLine()) != null) {
//				List<String>tmpList = new ArrayList<>();
//				String [] values = line.split(",");
//				tmpList = Arrays.asList(values);
//				System.out.println(tmpList);
//				records.add(tmpList);
//			}
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//		return records;
//	}
//}