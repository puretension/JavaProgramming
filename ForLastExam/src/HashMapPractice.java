import java.util.*;

public class HashMapPractice {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		HashMap<Integer,String>cats = new HashMap<>();
//		
//		cats.put(1, "페르시안");
//		cats.put(2, "샴");
//		System.out.println(cats);
//		cats.put(3,"러시안블루");
//		System.out.println(cats);
//		cats.put(3,"레그돌");
//		cats.remove(1);
//		System.out.println(cats);
//		System.out.println(cats.size());
//		System.out.print("(Key, Value) = ");
//		Iterator<Integer> keys = cats.keySet().iterator();
//		while(keys.hasNext()) {
//			int key = keys.next();
//			System.out.print("(" + key + "," + cats.get(key) + ")");
//		}
//		
//		//1.Create a HashMap
//		Map<String, Integer> map = new HashMap<>();
//		map.put("apple", 1);
//		map.put("banana", 2);
//		map.put("cherry", 3);
//		
//		//2.Get the set of Map.Entry objects
//		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//		
//		
//		//3.Print the key-value pairs in the Map 
//		for(Map.Entry<String, Integer>entry: entrySet) {
//			String key = entry.getKey();
//			Integer value = entry.getValue();
//			System.out.println(key + "->" + value);
//		}
		
//		System.out.print("Enter a string: ");
//		Scanner in = new Scanner(System.in);
//		String x = in.nextLine();
//		x = x.trim().toLowerCase(); //1. 대소문자 구분없앤다 
//		HashMap<Character, Integer> mp = new HashMap<>(); //2. (C,I)해쉬맵 만들어 저장
//		for(int i = 0;i<x.length();i++) {
//			char ch = x.charAt(i);
//			if(ch >= 'a' && ch <= 'z') {
//				mp.put(ch, mp.getOrDefault(ch, 0) + 1);
//			}
//		}
//		//TreeMap의 특성을 이용해 출력하기 
//		TreeMap<Character,Integer>sort = new TreeMap<>(mp);
//		for(char ch: sort.keySet()) {
//			System.out.println(ch + " " + sort.get(ch));
//		}
		
//		System.out.print("Enter a string: ");
//		Scanner in = new Scanner(System.in);
//		String x = in.nextLine();
//		x = x.trim().toLowerCase();
//		HashMap<Character,Integer>mp = new HashMap<>();
//		for(int i = 0;i<x.length();i++) {
//			char ch = x.charAt(i);
//			if(ch >= 'a' && ch <='z') {
//				mp.put(ch, mp.getOrDefault(mp, 0) + 1);
//			}
//		}
//		TreeMap<Character, Integer>sort = new TreeMap<>(mp);
//		for(char ch: sort.keySet()) {
//			System.out.println(ch + " " + sort.get(ch));
//		}
	}
}

//import java.util.*;
//
//public class stringCalculate {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		System.out.print("Enter a string: ");
//		String x = in.nextLine();
//		x = x.trim().toLowerCase();
//		HashMap<Character, Integer> mp = new HashMap<>();
//		for(int i = 0;i<x.length();i++) {
//		char ch = x.charAt(i);
//		if(ch >= 'a' && ch <= 'z') {
//			mp.put(ch, mp.getOrDefault(ch, 0) + 1); //닐코얼레싱느낌 
//			}
//		}
//		
//		TreeMap<Character,Integer>sort = new TreeMap<>(mp);
//		
//		for(char ch: sort.keySet()) {
//			System.out.println(ch + ":" + sort.get(ch));
//		}
//	}
//}