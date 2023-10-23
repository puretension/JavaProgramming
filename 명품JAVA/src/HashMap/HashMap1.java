//package HashMap;
//import java.util.HashMap;
//import java.util.Set;
//import java.util.Iterator;
//import java.util.Scanner;
//
//
//public class HashMap1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		HashMap <String,String> h = new HashMap<String, String>();
////		h.put("apple", "사과");
////		String a = h.get("apple");
////		Set<String> keys = h.keySet(); //모든 key를 Set컬렉션으로 만들어 리
////		Iterator<String>it = keys.iterator();
////		while(it.hasNext())
////		{ 
////			String key = it.next();
////			String value = h.get(key);
////			System.out.println("(" + key + "," + value + ")");
////		}
//		
////		//1. 영어 한글 사전 문제 
////		HashMap<String,String>dic = new HashMap<String,String>();
////		dic.put("baby", "아기");
////		dic.put("love", "사랑");
////		dic.put("apple", "사과");
////		
////		Scanner in = new Scanner(System.in);
////		
////		while(true) { 
////			System.out.print("찾고 싶은 단어는?");
////			String eng = in.next();
////			if(eng.equals("exit"))
////				break;
////			String kor = dic.get(eng);
////			if(kor == null) System.out.println(kor + "은 없는단어임");
////			else System.out.println(kor);
////		}
//		
////		//2. 이름-점수 출력문제 
//////		HashMap의 요소 개수5	
//////		이재문:70
//////		한원선:99
//////		김남윤:98
//////		김성동:97
//////		황기태:88
////		
////		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
////		scoreMap.put("이재문", 70);
////		scoreMap.put("한원선", 99);
////		scoreMap.put("김남윤", 98);
////		scoreMap.put("김성동", 97);
////		scoreMap.put("황기태", 88);
////		
////		System.out.print("HashMap의 요소 개수" + scoreMap.size());
////		
////		Set<String>keys = scoreMap.keySet();
////		Iterator<String>it = keys.iterator();
////		
////		while(it.hasNext()) { 
////			String name = it.next();
////			int score = scoreMap.get(name);
////			System.out.println(name + ":" + score);
////		}
//		
//		
//		//3. id와 tel이 있는 Student클래스 만들고, 이름을 key, Student 객체를 Value로하는 해시맵 작성
//		
//		HashMap<String, Student> x = new HashMap<String, Student>();
////		Student a[] = new Student[5];
////		a[0] = new Student(1,"010-2323-4141");
//		x.put("김남윤", new Student(1,"010-222-2222"));
//		x.put("이재문", new Student(2, "010-333-3333"));
//		x.put("이도형" ,new Student(2, "010-444-4444"));
//		Scanner in = new Scanner(System.in);
//	
//		Set <String> keys = x.keySet();
//		Iterator <String> it = keys.iterator();
//		while(it.hasNext())
//		{ 
//			String key = it.next();
//			Student value = x.get(key);
////			
//			System.out.println(key + ", " + value.tel);
////			System.out.print("검색할 이름은?");
////			String searchName = in.nextLine();
////			if(searchName.equals("exit"))
////				break;
////			Student student = x.get(searchName);
////			if(student == null)
////				System.out.print(searchName + "은 없는 사람입니다.");
////			else 
////				System.out.println("id: " + student.getId() + ", 전화:" + student.getTel());
//		}
//		
//	}
//}
//
//class Student{ 
//	int id;
//	String tel;
//	Student(int id, String tel){this.id = id; this.tel = tel;}
//	public int getId() {return id;}
//	public String getTel() {return tel;}
//}
//
