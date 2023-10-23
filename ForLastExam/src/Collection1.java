import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Iterator;
import java.util.*;

class Cat{
	String name;
	public Cat(String name) { this.name = name;}
}

public class Collection1 {

	public static void main(String[] args) {
//		ArrayList<Integer>obj = new ArrayList();
//		List<String>obj2 = new ArrayList();
//		List<Double>obj3 = new Vector();
//		List<Integer>obj4 = new Vector<Integer>();
//		obj3.add(2.2);
//		System.out.println(obj3.get(0));
//		List<Character>obj5 = new LinkedList();
//		
//		
//		List<String>myName = new ArrayList();
//		myName.add("Jack ");
//		myName.add("Hollywood ");
//		myName.add("Boy");
//		
//		Iterator<String>it = myName.iterator(); //1. it생성 
//		while(it.hasNext()) {
//			String name = it.next(); //2.String객체로 it요소 받아오기 
//			System.out.print(name);
//		}
//		System.out.println();
//		
//		List<String> cats = new ArrayList();
//		cats.add("페르시안");
//		cats.add(null);
//		//cats.add(1,"샴"); //이러면 1에 샴추가, 기존 null은 2로밀려남 
//		cats.set(1, "샴"); //지정인덱스밸류 변경은 set 
//		
//		Iterator<String>it2 = cats.iterator(); //1. it생성 
//		while(it2.hasNext()) {
//			String name = it2.next(); //2.String객체로 it요소 받아오기 
//			System.out.print(name);
//		}
//		System.out.println(cats.contains("샴")); //contains는 true, false 
//		System.out.println(cats.indexOf("샴")); //indexOf는 인덱스, -1
//		System.out.println();
//		
//		List<Cat> cats2 = new ArrayList();
//		cats2.add(new Cat("페르시안!"));
//		cats2.add(new Cat("샴!"));
//		Cat cat3 = new Cat("짱");
//		cats2.add(cat3);
//		
//		Iterator<Cat>it3 = cats2.iterator();
//		while(it3.hasNext()) {
//			String name = it3.next().name;
//			System.out.print(name);
//		}
		
//		List<Integer>num = new ArrayList();
//		for(int i = 10; i>=1; i--) {
//			num.add(i);
//		}
//		System.out.println(num);
//		System.out.print("정렬 전 : ");
//		for(Integer integer: num) {
//			System.out.print(integer + " ");
//		}
//		//num.sort(Comparator.naturalOrder());
//		Collections.sort(num, Comparator.naturalOrder());
//		System.out.println();
//		System.out.print("정렬 후 : ");
//		for(Integer integer : num) System.out.print(integer + " ");
//		
//		
//		
//		
//		LinkedList list = new LinkedList();
//		LinkedList<Integer>nums = new LinkedList();
//		
//		System.out.println();
//		LinkedList<String>cats = new LinkedList();
//		cats.add("러시안블루 ");
//		cats.addFirst("페르시안 ");
//		cats.addLast("래그돌 ");
//		cats.add(1, "샴 ");
//		Iterator<String>it = cats.iterator();
//		while(it.hasNext()) {
//			String name = it.next();
//			System.out.print(name);
//		}
//		
//		LinkedList<Cat> cat = new LinkedList();
//		Cat cat3 = new Cat("페르시안");
//		cat.add(cat3);
//		cat.add(new Cat("AjAJ"));
//		Iterator<Cat>it3 = cat.iterator();
//		while(it3.hasNext()) {
//			String name = it3.next().name;
//			System.out.print(name);
//		}
		
//		HashSet<String>str = new HashSet();
//		str.add("A");
//		str.add("B");
//		str.add("C");
//		System.out.println(str);
//		
//		System.out.print("HashSet 요소 : ");
//		for(String elements: str) {
//			System.out.print(elements + " ");
//		}
//		String [] array = new String[str.size()]; //1/ Set의 크기만큼 생성 
//		str.toArray(array); //2. Set을 Array로 바꾸는법 
//		String x = str.toString();  //3. Set을 String로 바꾸는법 
//		
//		System.out.println();
//		System.out.print("Array 요소 : ");
//		for(int i = 0;i<array.length;i++) {
//			System.out.print(array[i] + " ");
//		}
//		
//		System.out.println(x); //str.toString()의 출력형태: [A, B, C]
//		//Integer [] arrayNum = new Integer[str.size()];
	}

}
