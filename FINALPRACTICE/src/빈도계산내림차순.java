//import java.util.*;
//
//public class 빈도계산내림차순 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter a string: ");
//		String str = in.nextLine();
//		str = str.trim();
//		HashMap<Character,Integer>fMap = new HashMap<>();
//		for(char ch: str.toCharArray()) {
//			fMap.put(ch, fMap.getOrDefault(ch, 0) + 1);
//		}
//		
//		Set<Map.Entry<Character, Integer>>sMap = fMap.entrySet(); //key 오름차순저장후 출력
//		for(Map.Entry<Character, Integer>mp: sMap) {
//			System.out.println(mp.getKey() + ": " + mp.getValue());
//		}
//		
//		List<Map.Entry<Character, Integer>>lMap = new ArrayList<>(fMap.entrySet()); //value 내림차순 저장후 출력
//		lMap.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
//		
//		for(Map.Entry<Character, Integer>entry: lMap) {
//			System.out.println(entry.getKey() + ": " + entry.getValue());
//		}
//		
//	}
//
//}
