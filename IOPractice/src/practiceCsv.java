//import java.io.*;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.*;
//
//public class practiceCsv {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		List<List<String>> ret = new ArrayList<List<String>>();
//		BufferedReader br = null;
//		try {
//			br = Files.newBufferedReader(Paths.get("src/employee.csv"));
//			String line = "";
//			while((line = br.readLine()) != null) {
//				List<String>tmpList = new ArrayList<String>();
//				String array[] = line.split(",");
//				tmpList = Arrays.asList(array);
//				System.out.println(tmpList);
//				ret.add(tmpList);
//			}
//		}catch(IOException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				if(br!=null) br.close();
//			}catch(IOException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//
//}
