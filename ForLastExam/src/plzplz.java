//import java.io.*;
//import java.util.*;
//
//public class plzplz{
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
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
//	}
//}
