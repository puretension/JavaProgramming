import java.io.*;
import java.util.*;

//public class FileWriterEx {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		FileWriter fout = null;
//		int c;
//		try {
//			fout = new FileWriter("src/abc.txt");
//			while(true) {
//				String line = in.nextLine();
//				if(line.length() == 0) break; //line에는 \n이 들어가지않음
//				fout.write(line,0,line.length());
//				fout.write("\r\n", 0, 2);
//			}
//			fout.close();
//		} catch(IOException e) {
//			System.out.println("입출력 오류");
//		}
//	}
//
//}


////위에서 한거 테스트해보기
//public class FileWriterEx {
//
//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//	FileReader fin = null;
//	try {
//		fin = new FileReader("src/abc.txt");
//		int c;
//		while((c = fin.read())!= -1) {
//			System.out.print((char)c);
//		}
//		fin.close();
//	}catch(IOException e) { 
//		System.out.println("오류");
//	}
//}
//
//}