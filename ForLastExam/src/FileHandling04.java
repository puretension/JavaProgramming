import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.Writer;


//public class FileHandling04 {
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		File file = new File("gugudan.txt");
//		try { 
//			if(!file.exists()) file.createNewFile();
//			FileInputStream fis = new FileInputStream(file);
//			int i = 0;
//			while((i = fis.read()) != -1) {
//				System.out.print((char)i);
//			}
//			fis.close();
//			System.out.println("파일 읽기 성공");
//		}catch(Exception e) { 
//			System.out.println(e);
//		}
//	}
//
//}


////구구단 파일쓰고 읽는 자체예제
//public class FileHandling04{
//	public static void main(String [] args) {
//		try { 
//			FileWriter fw = new FileWriter("multiplication_table.txt");
//			for(int i = 1;i<=9;i++) {
//				fw.write(i + "단\n");
//				for(int j = 1;j<=9;j++) {
//					int result = i * j;
//					fw.write(i + " X " + j + " = " + i*j + "\n");
//				}
//			}
//			fw.close();
//			//fw.write("@@@@"); //catch테스트용
//			System.out.println("구구단 표 생성 완료");
//		}catch(Exception e){ 
//			System.out.println(e);
//			System.out.println(e.getMessage()); //요약본
//		}
//		
//	}
//}