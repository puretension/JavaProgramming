//import java.io.File;
//import java.io.FileOutputStream;
//
////문자열을 파일에 쓰는 예제(바이트 출력 스트림 유형) 
//public class IOExample02 {
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String str = "Hello! Java Programming ";
//		try { 
//			//파일 객체 생성
//			File file = new File("example02.txt");
//			//파일 존재X시 생성
//			if(!file.exists()) file.createNewFile();
//			FileOutputStream fos = new FileOutputStream(file);
//			
//			//문자열을 byte배열로 변환후 파일에 쓰기(FileOutputStream의 특징)
//			byte [] b = str.getBytes();
//			fos.write(b);
//			
//			//FileOutputStream종료
//			fos.close();
//			System.out.println("파일 쓰기 성공");
//		} catch(Exception e) {
//			e.getMessage();
//		}
//	}
//}
