//import java.util.*;
//
////class Person implements Comparable<Person>{
////	private String name;
////	private int age;
////	
////	public Person(String name, int age) {
////		this.name = name;
////		this.age = age;
////	}
////	
////	public String getName() {return name;}
////	public int getAge() {return age;}
////	
////	public int compareTo(Person other) {
////		//return Integer.compare(age, other.age);
////		int ageCompare = Integer.compare(age, other.age);
////		return (ageCompare != 0) ? ageCompare : this.name.compareTo(other.name);
////	}
////}
//
//class Person implements Comparable<Person>{
//	private String name;
//	private int age;
//	
//	public Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//	
//	public String getName() {return name;}
//	public int getAge() {return age;}
////	public int compareTo(Person other) {
////		return Integer.compare(age, other.age);
////	}
////	public int compareTo(Person other) { //Integer.compare 풀어쓴다면? 
////		if(this.age < other.age) return -1;
////		else if(this.age > other.age) return 1;
////		else return 0;
////	}
//	public int compareTo(Person other) {
//		int ageCompare = Integer.compare(age, other.age);
//		return (ageCompare != 0) ? ageCompare : name.compareTo(other.name);
//	}
//}
//
//public class ComparablePractice {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		List<Person>persons = new ArrayList<>();
//		persons.add(new Person("John", 25));
//		persons.add(new Person("Alice", 25));
//		persons.add(new Person("Bob", 25));
//		
//		System.out.println("Before sorting: ");
//		for(Person p: persons) {
//			System.out.println(p.getName() + " : " + p.getAge());
//		}
//		Collections.sort(persons);
//		System.out.println("\nAfter sorting: ");
//		for(Person p: persons) {
//			System.out.println(p.getName() + " : " + p.getAge());
//		}
//	}
//
//}
