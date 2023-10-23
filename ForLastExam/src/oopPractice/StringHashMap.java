//package oopPractice;
//import java.util.*;
//
//public class StringHashMap {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String x;
//		Scanner in = new Scanner(System.in);
//		System.out.print("Enter a string: ");
//		x = in.nextLine();
//		HashMap<Character,Integer>mp = new HashMap<>();
//		char [] array = x.toLowerCase().toCharArray();
//		for(char ch: array) {
//			if(ch >= 'a' && ch <= 'z') {
//				//mp.put(ch, mp.getOrDefault(ch, 0) + 1);
//				if(mp.containsKey(ch)) {
//					mp.put(ch, mp.get(ch) + 1);
//				}
//				else {
//					mp.put(ch, 1);
//				}
//			}
//		}
//		Iterator<Character>it = mp.keySet().iterator();
//		while(it.hasNext()) {
//			char key = it.next();
//			System.out.println(key + ": " + mp.get(key));
//		}
//	}
//
//}
