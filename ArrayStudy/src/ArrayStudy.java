import java.util.Arrays;
import java.util.Scanner;

public class ArrayStudy {
	public static String getHiddenData(String id, Integer index) { 
		char [] arr = new char[id.length()];
		
		for(int i = 0;i<index;i++) { 
			arr[i] = id.charAt(i);
		}
		for(int i = index;i<id.length();i++)
		{ 
			arr[i] = '*';
		}
		return Arrays.toString(arr);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 선언하는 3가지 방법
		
		int [] array = new int[4];
		int array2[] = new int[4];
		Object [] array3 = new Object[] {1,2,3,4,5};
		int [] array4 = {1,2,3,4,5};
		
		
		String name = "나코딩";
		String id = "999999 - 2323232";
		String phone = "010-3232-4242";
		
		System.out.println("이름: " + getHiddenData(name,1)); //index는 비공개시작위
		System.out.println("주민등록번호: " + getHiddenData(id, 8));
		System.out.println("전화번호: " + getHiddenData(phone,9));
		
	}
	
	//String을 받아 배열로 바꾼뒤 리턴은 다시 String으로 변형해줘야함
	//문자열에 인덱스 접근: charAt
	//문자열을 배열로전환: toCharArray() 
	//배열을 문자열로 전환: Arrays.toString

}
