//package 명품JAVA;
//import java.util.Iterator;
//import java.util.ArrayList;
//
//
//public class IteratorPractice {
//
//	public static void main(String [] args) { 
//		ArrayList<String>list = new ArrayList<String>();
//		list.add("apple");
//		list.add("orange");
//		list.add("grape");
//		
//		Iterator<String>it = list.iterator();
//		while(it.hasNext())
//		{ 
//			String item = it.next();
//			if(item.equals("apple"))
//				it.remove();
//		}
//		
//		it = list.iterator();
//		while(it.hasNext())
//		{ 
//			String item = it.next();
//			if(item.equals("orange")) {
//				int index = list.indexOf(item);
//				list.add(index + 1, "banana");
//				break;
//			}
//		}
//		System.out.println(list);
//	}
//}
