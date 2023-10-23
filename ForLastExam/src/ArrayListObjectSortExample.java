//import java.util.ArrayList;
//import java.util.List;
//import java.util.Comparator;
//import java.util.Collections;
//import java.util.Scanner;
//import java.util.Iterator;
//
//class Person implements Comparable<Person>{
//	private String name;
//	private Integer age;
//	
//	public Person(String name, Integer age) {
//		this.name = name;
//		this.age = age;
//	}
//	
//	public String getName() {return name;}
//	public void setName(String name) {this.name = name; }
//	public Integer getAge() {return age;}
//	public void setAge(Integer age) {this.age = age;}
//	
//	public String toString() { 
//		 return "{" +
//	                "name='" + name + '\'' +
//	                ", age=" + age +
//	                '}';
//	}
//	
//	public int compareTo(Person other) {
//		return this.age.compareTo(other.getAge());
//	}
//}
//
//public class ArrayListObjectSortExample {
//
//	public static void main(String[] args) {
//		System.out.print("Enter the number of people you want to add: ");
//		Scanner in = new Scanner(System.in);
//		int addNum = in.nextInt();
//		
//		List<Person>people = new ArrayList(addNum);
//		for(int i = 1;i<=4;i++) {
//		System.out.println("Enter name and age for person " + i + ":");
//		String name = in.next();
//		int age = in.nextInt();
//		people.add(new Person(name, age));
//		}
////		people.add(new Person("Sachin", 47));
////	    people.add(new Person("Chris", 34));
////	    people.add(new Person("Rajeev", 25));
////	    people.add(new Person("David", 31));
//	    
//        System.out.println("Person List : " + people);
//        System.out.print("Enter the index of the person you want to remove: ");
//        int removeIdx = in.nextInt();
//        people.remove(removeIdx);
//        System.out.println("Person removed from index " + removeIdx + ". Updated person list: " + people);
//        System.out.print("Enter the index of the person you want to modify: ");
//        int modifyIdx = in.nextInt();
//        System.out.println("Enter updated name and age for person at index " + modifyIdx + ":");
//        String name = in.next();
//        int age = in.nextInt();
//        people.get(modifyIdx).setName(name);
//        people.get(modifyIdx).setAge(age);
//        System.out.println("Person at index " + modifyIdx + "updated. " + "Updated person list: " + people);
//        System.out.print("Enter the name of the person you want to search: ");
//        String searchName = in.next();
//        Iterator<Person>it = people.iterator();
//        
//        //방법1 
//        while(it.hasNext()) {
////        	if(it.next().getName().equals(searchName)) { //잘못된 방식 
////        	       System.out.println("Person found: " + it);
////        	       break;
////        	}
//        	Person person = it.next(); //찾은 iterator를 Person 객체로 변환
//        	if(person.getName().equals(searchName)) {
//        	   System.out.println("Person found: " + person);
//        	   break;
//        	}
//        }
//        
//        //방법2
////        for(int i = 0;i<people.size();i++) {
////        	if(people.get(i).getName().equals(searchName)) {
////        		System.out.println("Person found: " + people.get(i));
////        		break;
////        	}
////        }
// 
//        System.out.println("All persons: ");
//        
//        for(Person p: people) {
//        	System.out.println(p);
//        }
//        
//        
//        // Sort by natural order (age)
//        //people.sort(Comparator.naturalOrder());
//        Collections.sort(people, Comparator.naturalOrder()); //# 다른 표현
//        System.out.println("Sorted Person List by Age : " + people);
//        
//        // Sort by name
//        Collections.sort(people, Comparator.comparing(Person::getName));
//       
//        System.out.println("Sorted Person List by Name : " + people);
//	}
//
//}
