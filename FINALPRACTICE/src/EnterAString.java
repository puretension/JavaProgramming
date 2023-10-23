import java.util.*;


//public class EnterAString {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		System.out.print("Enter a string: ");
//		String x = in.nextLine();
//		x = x.trim().toLowerCase();
//		HashMap<Character, Integer> mp = new HashMap<>(); //해시맵에 첫 저장
//		
//		for(int i = 0;i<x.length();i++) {
//		char ch = x.charAt(i);
//		if(ch >= 'a' && ch <= 'z') {
//			mp.put(ch, mp.getOrDefault(ch, 0) + 1); //닐코얼레싱느낌 
//			}
//		}
//		
//		TreeMap<Character,Integer>sort = new TreeMap<>(mp); //트리맵에 옮긴
//		
//		for(char ch: sort.keySet()) {
//			System.out.println(ch + ":" + sort.get(ch));
//		}
//	}
//}



//public class EnterAString {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.print("Enter a string");
//		Scanner in = new Scanner(System.in);
//		String x = in.nextLine();
//		x = x.trim().toLowerCase();
//		
//		TreeMap<Character,Integer>mp = new TreeMap<>(); //첨부터 트리맵저장후,알파벳 순서대로오름차순 출력
//		
//		for(int i = 0;i<x.length();i++) {
//			mp.put(x.charAt(i),mp.getOrDefault(x.charAt(i), 0) + 1);
//		}
//		for(char ch: mp.keySet()) {
//			System.out.println(ch + ":" + mp.get(ch));
//		}
//	}
//}

	
//public class EnterAString{
//	public static void main(String [] args) {
//		System.out.print("Enter a string: ");
//		Scanner in = new Scanner(System.in);
//		String str = in.nextLine();
//		HashMap<Character, Integer>hp = new HashMap<>();
//		
//		for(char ch: str.toCharArray()) {
//			hp.put(ch, hp.getOrDefault(ch, 0) + 1);
//		}
//		Iterator<Character>it = hp.keySet().iterator();
//		while(it.hasNext()) {
//			char c = it.next();
//			System.out.println(c + ": " + hp.get(c));
//		}
//		
//		//Set<Map.Entry>
//		Set<Map.Entry<Character, Integer>>entrySet = hp.entrySet();
//		for(Map.Entry<Character, Integer> entry: entrySet) {
//			Character key = entry.getKey();
//			Integer value = entry.getValue();
//			System.out.println(key + "->" + value);
//		}
//		
//		
//		//List<Map.Entry>
//		List<Map.Entry<Character, Integer>> sortedEntries = new ArrayList<>(hp.entrySet());
//		
//		//value기준 내림차순 정렬
//		sortedEntries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
//		
//		System.out.println("Value기준 내림차순 정렬");
//		for(Map.Entry<Character, Integer> entry: sortedEntries) {
//			Character key = entry.getKey();
//			Integer value = entry.getValue();
//			System.out.println(key + "->" + value);
//		}
//		
//		
////		//key기준 내림차순 정렬
//		sortedEntries.sort(Map.Entry.comparingByKey(Comparator.reverseOrder()));
//		
////		ArrayList<String>strSet = new ArrayList<>();  //요거는 
////		Collections.sort(strSet, Collections.reverseOrder()); //오직 리스트에만가능한 sort. 
//		
//		System.out.println("Key기준 내림차순 정렬");
//		for(Map.Entry<Character, Integer> entry: sortedEntries) {
//			Character key = entry.getKey();
//			Integer value = entry.getValue();
//			System.out.println(key + "->" + value);
//		}
//	}
//}
