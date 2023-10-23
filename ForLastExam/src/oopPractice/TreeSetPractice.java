package oopPractice;

import java.util.*;
import java.util.Map.Entry;

public class TreeSetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TreeSet<String>cats = new TreeSet<>();
//		cats.add("폐르시안");
//		cats.add("러시안 블루");
//		cats.add("샴");
//		for(String s: cats) {
//			System.out.println(s);
//		}
//		Iterator<String>it = cats.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
//		TreeSet<String>str_treeset = new TreeSet<>();
//		str_treeset.add("A");
//		str_treeset.add("B");
//		str_treeset.add("C");
//		
//		System.out.print("TreeSet요소: " + str_treeset);
//		//TreeSet -> String array로 변환
//		String [] array = new String[str_treeset.size()];
//		str_treeset.toArray(array);
//		System.out.println();
//		System.out.print("Array 요소: ");
//		for(String s: array) {
//			System.out.print(s + " ");
//		}
		
//		TreeSet<Integer>numTree = new TreeSet<>();
//		numTree.add(3);
//		numTree.add(2);
//		numTree.add(5);
//		
//		System.out.print("TreeSet요소: " + numTree);
//		Integer nums[] = new Integer[numTree.size()];
//		numTree.toArray(nums);
//		System.out.println();
//		System.out.print("Array 요소: ");
//		for(int s: nums) {
//			System.out.print(s + " ");
//		}
		
//		TreeSet<Integer>set = new TreeSet<>();
//		set.add(1);
//		set.add(2);
//		set.add(3);
//		set.add(4);
//		set.add(5);
//		TreeSet<Integer>subset = (TreeSet<Integer>)set.subSet(2, 5);
//		System.out.println("Subset: " + subset);  
		
//		HashMap<Integer,String>cats = new HashMap<Integer,String>();
//		
//		cats.put(1, "persian");
//		cats.put(2, "James");
//		cats.put(3, "coogie");
//		
//		System.out.println(cats);
//		System.out.println(cats.get(2));
//		for(Entry<Integer, String> entry: cats.entrySet()) {
//			System.out.print(" (" + entry.getKey() + ", " + entry.getValue() + ") ");
//		}
//		
//		Iterator<Entry<Integer,String>>entries = cats.entrySet().iterator();
//		while(entries.hasNext()) {
//			Map.Entry<Integer, String>entry = entries.next();
//			System.out.print(" (" + entry.getKey() + ", " + entry.getValue() + ") "); 
//		}
		
		
//		for(Integer i: cats.keySet()) {
//			System.out.print(" (" + i + ", " + cats.get(i) + ") ");
//		}
//		System.out.println();
//		Iterator<Integer>keys = cats.keySet().iterator();
//		while(keys.hasNext()) {
//			int key = keys.next();
//			System.out.print(" (" + key + ", " + cats.get(key) + ")");
//		}
		
//		Map<String, Integer>map = new HashMap<>();
//		map.put("apple", 1);
//		map.put("banana", 2);
//		map.put("cherry", 3);
//		
//		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//		for(Map.Entry<String, Integer>entry: entrySet) {
//			String key = entry.getKey();
//			int value = entry.getValue();
//			System.out.println(key + "->" + value);
//		}
		
	}
}
