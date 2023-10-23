//import java.util.*;
//
////class Person{
////	int age;
////	public Person(int age) {
////		this.age = age;
////	}
////};
//
//class Person implements Comparable<Person>{
//	int age;
//	public Person(int age) { this.age = age;}
//	public int compareTo(Person p) {
//		return Integer.compare(age, p.age);
//	}
//}
//
//public class exceptionPractice {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
////		Scanner in = new Scanner(System.in);
////		int a,b;
////		System.out.println("숫자 입력: ");
////		a = in.nextInt();
////		System.out.println("divisor 입력: ");
////		b = in.nextInt();
//		try {
//			Integer t = new Integer("abc");
//		}catch(NumberFormatException e) {
//			System.out.println(e);
//		}
//		
////		ArrayList<Person>arr = new ArrayList<Person>();
////		arr.add(new Person(5));
////		arr.add(new Person(19));
////		arr.add(new Person(10));
////		
//////		Comparator<Person>p = new Comparator<Person>() {
//////			public int compare(Person a1, Person a2) {
//////				return Integer.compare(a1.age, a2.age);
//////			}
//////		};
//////		Collections.sort(arr,p);
////		
////		Collections.sort(arr);
////		
////		Iterator<Person>pNum = arr.iterator();
////		while(pNum.hasNext()) {
////			int nowAge = pNum.next().age;
////			System.out.println("Sorted Age: " + nowAge);
////		}
//		
//	}
//}
