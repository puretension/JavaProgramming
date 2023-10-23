//import java.util.*;
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
////	public int compareTo(Person other) {
////		return Integer.compare(age, other.age);
////	}
////	public int compareTo(Person other) {
////		int ageCompare = Integer.compare(age, other.age);
////		return (ageCompare != 0) ? ageCompare : name.compareTo(other.name);
////	}
////}
//
//class Person{
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
//	
//}
//
//public class ComparableComparator {
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		List<Person>persons = new ArrayList<>();
//		persons.add(new Person("John", 27));
//		persons.add(new Person("Alice", 23));
//		persons.add(new Person("Bob", 25));
//		
//		System.out.println("Before sorting: ");
//		for(Person p: persons) {
//			System.out.println(p.getName() + " : " + p.getAge());
//		}
//		
//		//Comparator<Person>ageComparator = (a,b) -> Integer.compare(a.getAge(), b.getAge());
//		//Collections.sort(persons,ageComparator);
//		
//		//Comparator<Person>nameComparator = (a,b) -> a.getName().compareTo(b.getName());
//		//Collections.sort(persons,nameComparator);
//		
//		Comparator<Person>nameComparator2 = new Comparator<Person>() {
//			public int compare(Person a, Person b) {
//				return a.getName().compareTo(b.getName());
//			}
//		};
//		Collections.sort(persons,nameComparator2);
//		System.out.println("\nAfter sorting: ");
//		for(Person p: persons) {
//			System.out.println(p.getName() + " : " + p.getAge());
//		}
//	}
//}
