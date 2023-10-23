//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//public class EX19_2 {
//
//	public static void main(String[] args) {
//		List<String>words = new ArrayList<>();
//		words.add("apple");
//		words.add("banana");
//		words.add("cherry");
//		words.add("date");
//		
//		System.out.println("Before sorting: ");
//		for(String word: words) {
//			System.out.println(word);
//		}
//		
////		Comparator<String>lengthComparator = new Comparator<String>() { 
////			public int compare(String a, String b) {
////				return Integer.compare(a.length(), b.length());
////			}
////		};
////		Comparator<String>lengthComparator = (a,b) -> Integer.compare(a.length(), b.length());
////		Comparator<String>compare = new Comparator<String>() {
////			public int compare(String a, String b) {
////				return a.compareTo(b);
////			}
////		};
////		Comparator<String>compare = (a,b) -> a.compareTo(b);
//		
////		Collections.sort(words, lengthComparator);
//		System.out.println("After sorting: ");
//		for(String word: words) {
//			System.out.println(word);
//		}
//	}
//}
