//import java.io.*;
//import java.io.IOException;
//
//public class EX21_1 {
//	
//	public static void readFile(String filename) throws IOException{
//		FileReader fileReader = null;
//		try {
//			fileReader = new FileReader(filename);
//			BufferedReader bufferedReader = new BufferedReader(fileReader);
//			String line;
//			
//			while((line = bufferedReader.readLine()) != null) { 
//				System.out.println(line);
//			}
//		}
//		
//		finally { 
//			if(fileReader != null) { 
//				try { 
//					fileReader.close();
//				} catch(IOException e) { 
//					System.out.println("An error occurred while closing the file: " + e.getMessage());
//					e.printStackTrace();
//				}
//			}
//		}
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		try { 
//			readFile("nonexistent_file.txt");
//		}catch(IOException e) {
//			System.out.println("An error occurred while reading the file: " + e.getMessage());
//			e.printStackTrace();
//		}
//	}
//}
