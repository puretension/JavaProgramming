//import java.io.*;
//
//
//public class FileImputStreamEx {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		byte [] b = new byte[6];
//		try {
//			FileInputStream fin = new FileInputStream("src/abc2.txt");
//			int i;
//			int n = 0;
//			while((i = fin.read()) != -1) {
//				b[n] = (byte)i;
//				n++;
//			}
//			System.out.println("abc2.txt에서 읽은 배열을 출력합니다.");
//			for(int j = 0;j<b.length;j++) {
//				System.out.print(b[i] + " ");
//			}
//			System.out.println(); fin.close();
//		}catch(IOException e) {
//			System.out.println("경로명체크해줘");
//		}
//	}
//}
