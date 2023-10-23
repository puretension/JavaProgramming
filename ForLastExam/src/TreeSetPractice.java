//import java.util.*;
////class Stack<E>{
////
////	private ArrayList<E>list;
////	
////	public Stack() {
////		list = new ArrayList<>();
////	}
////	
////  public void push(E element) {
////      list.add(element);
////  }
////
////  public E pop() {
////      if (isEmpty()) {
////          throw new RuntimeException("Stack is empty");
////      }
////      return list.remove(list.size() - 1);
////  }
////
////  public E peek() {
////      if (isEmpty()) {
////          throw new RuntimeException("Stack is empty");
////      }
////      return list.get(list.size() - 1);
////  }
////
////  public boolean isEmpty() {
////      return list.size() == 0;
////  }
////
////}
//
////class Stack <E>{ 
////	private ArrayList<E> list;
////	public Stack(){
////		list = new ArrayList<>();
////	}
////	void push(E element) {
////		list.add(element);
////	}
////	E pop() {
////		E popData = list.get(list.size()-1);
////		list.remove(list.size()-1);
////		return popData;
////	}
////	boolean isEmpty() {
////		return list.size() == 0;
////	}
////}
//
//public class TreeSetPractice {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		TreeSet<String> cats = new TreeSet<String>();
//		cats.add("페르시안");
//		cats.add("러시안블루");
//		cats.add("샴");
//		System.out.println(cats);
//		System.out.println(cats.first());
//		System.out.println(cats.last());
//		
//		for(String cat: cats) {
//			System.out.println(cat);
//		}
//		
//		//TreeSet을 Array로 바꾸기
//		TreeSet<String>str_treeSet = new TreeSet<String>();
//		str_treeSet.add("A");
//		str_treeSet.add("B");
//		str_treeSet.add("C");
//			
//		System.out.print("TreeSet 요소: " + str_treeSet);
//		//TreeSet을 String array로 변환
//		String [] array = new String[str_treeSet.size()];
//		str_treeSet.toArray(array);
//		
//		System.out.println();
//		
//		System.out.print("Array 요소: ");
//		for(String s: array) {
//			System.out.print(s + " ");
//		}
//		TreeSet<Integer>set = new TreeSet<>();
//		set.add(1);
//		set.add(2);
//		set.add(3);
//		set.add(4);
//		System.out.println();
//		//TreeSet의 subset구하기
//		TreeSet<Integer>subset = (TreeSet<Integer>)set.subSet(2, 5); //2부터 5전까지 
//		System.out.println("Subset: " + subset);
//		
//		Map<Integer,String>obj1 = new HashMap<>();
//		Map<Integer,String>obj2 = new TreeMap<>();
//		
//		
//	}
//}
