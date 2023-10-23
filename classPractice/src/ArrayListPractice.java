//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class ArrayListPractice {
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ArrayList al = new ArrayList();
//		
//		al.add("one");
//		al.add("two");
//		al.add("three");
//		
//		for(int i = 0;i< al.size();i++)
//			System.out.println(al.get(i));
//		
//		//ArrayList의 데이터 타입은 Object로 통일된다
//		String value = (String)al.get(0); //방식 1
//		
//		ArrayList<String>al2 = new ArrayList<String>();
//		al2.add("one");
//		al2.add("two");
//		al2.add("three");
//		String value2 = al2.get(1);
//		ArrayList<String>list = new ArrayList<String>();
//		
//		ArrayList<Character>points = new ArrayList<Character>();
//		double k = 2;
//		
//		int [] grade = {70,80,90,75};
//		int tot = grade[0] + grade[1] +grade[2];
//		double avg = (double)(grade[0] + grade[1] +grade[2])/3;
//		
//		ArrayList<String>alphabet = new ArrayList<String>();
//		
//		char a = '닳';
//		String letter = "동해 물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
//		int letterNumber = letter.length();
//		int location = letter.indexOf(a);
//		System.out.printf("%s => %d자이며, %c은 %d번째에 있다.\n", letter,letterNumber,a,location);
//		char b = letter.charAt(location);
//		System.out.printf("%s의 %d번째 문자는 %c이다", letter,location,b);
//	}
//
//}
