import java.io.*;

//문자스트림 예제 
//public class FileReaderEx {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		try {
//		FileReader fin = new FileReader("src/abc.txt");
//		int c;
//		while((c= fin.read()) != -1) {
//			System.out.print((char)c);
//		}
//		char [] buf = new char[1024];
//		int n = fin.read();
//		fin.close();
//		} catch(FileNotFoundException e) {
//			System.out.println("파일 열수 없음");
//		}catch(IOException e) {
//			System.out.println("입출력 오류");
//		}
//	}
//}

////문자스트림 예제(FileReader로 받기)
//public class FileReaderEx {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		FileReader fin = null;
//		try {
//			fin = new FileReader("src/abc.txt");
//			int c;
//			while((c = fin.read())!= -1) {
//				System.out.print((char)c);
//			}
//			fin.close();
//		}catch(IOException e) { 
//			System.out.println("오류");
//		}
//	}
//}

////비트스트림 예제(InputStreamReader(문자스트림)을통해 FileInputStream(비트스트림)으로 인코딩후 출력
//public class FileReaderEx {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		InputStreamReader in = null; //문자 스트림 
//		FileInputStream fin = null; //바이트 스트림
//		try {
//			fin = new FileInputStream("src/abc.txt");
//			in = new InputStreamReader(fin, "UTF-8");
//			int c;
//			System.out.println("인코딩 문자 집합은 " + in.getEncoding());
//			while((c = in.read()) != -1) {
//				System.out.print((char)c);
//			}
//			in.close();
//			fin.close();
//		} catch(IOException e) {
//			System.out.println("입출력 오류");
//		}
//	}
//}