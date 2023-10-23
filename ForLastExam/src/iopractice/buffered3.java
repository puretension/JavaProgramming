package iopractice;
import java.io.*;
import java.util.*;
import java.nio.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


//한 문자씩 읽기
//public class buffered3 {
//	public static void main(String [] args) {
//		try {
//			File file = new File("src/iopractice/Sample33.txt");
//			//if(!file.exists()) file.createNewFile();
//			FileReader filereader = new FileReader(file);
//			int i = 0;
//			while((i = filereader.read()) != -1) {
//				System.out.print((char)i);
//			} filereader.close();
//		}catch(IOException e) {e.printStackTrace();}
//	}
//}

//한 줄씩 읽기(CPU 부하 감소) 
//public class buffered3 {
//	public static void main(String [] args) {
//		try {
//			//파일 객체 생성
//			File file = new File("src/iopractice/Sample33.txt");
//			//if(!file.exists()) file.createNewFile();
//			//입력스트림 생성 
//			FileReader filereader = new FileReader(file);
//			//입력 버퍼 생성
//			BufferedReader bufReader = new BufferedReader(filereader);
//			String line = "";
//			while((line = bufReader.readLine()) != null) {
//				System.out.println(line);
//			} filereader.close();
//		}catch(IOException e) {e.printStackTrace();}
//	}
//}

////스캐너로 한번에 파일 읽기
//public class buffered3 {
//	public static void main(String [] args) {
//		try {
//			//파일 객체 생성
//			File file = new File("src/iopractice/Sample33.txt");
//			//if(!file.exists()) file.createNewFile();
//			Scanner scan = new Scanner(file);
//			while(scan.hasNextLine()) System.out.println(scan.nextLine());
//		}catch(IOException e) {e.printStackTrace();}
//	}
//}

//파일 쓰기(버퍼를 이용)

//public class buffered3 {
//public static void main(String [] args) {
//	try {
//		//파일 객체 생성
//		File file = new File("src/iopractice/Sample44.txt"); //33과 다른 파일 
//		BufferedWriter bf = new BufferedWriter(new FileWriter(file));
//		if(file.isFile() && file.canWrite()) {
//			bf.write("문자열 추가1");
//			bf.newLine();
//			bf.write("문자열 추가2");
//			bf.close();
//		}
//	}catch(IOException e) {e.printStackTrace();}
//}
//}

////번외(파일 통채로 읽기)
//public class buffered3 {
//public static void main(String [] args) {
//	//파일 객체 생성
//	Path path = Paths.get("src/iopractice/Sample33.txt");
//	Charset cs = StandardCharsets.UTF_8;
//	List<String> list = new ArrayList<String>();
//	try {
//	list = Files.readAllLines(path,cs);
//	}catch(IOException e) {e.printStackTrace();}
//	for(String readLine : list) {
//		System.out.println(readLine);
//	}
//}
//}
