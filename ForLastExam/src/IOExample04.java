//import java.io.File;
//import java.io.FileInputStream;
//
//public class IOExample04 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		try { 
//			File file = new File("example03.txt");
//			if(!file.exists()) file.createNewFile();
//			FileInputStream fis = new FileInputStream(file);
//			int i = 0;
//			while((i = fis.read()) != -1) {
//				System.out.print((char)i);
//			}
//			fis.close();
//			System.out.println("\n파일 읽기 성공");
//		} catch(Exception e) {
//			System.out.println(e);
//		}
//	}
//
//}
