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
