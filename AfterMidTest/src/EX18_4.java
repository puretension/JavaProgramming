//import java.util.*;
//
//class Student implements Comparable<Student>{
//	private String name;
//	int age;
//	
//	Student(String name, int age){
//		this.name = name;
//		this.age = age;
//	}
//	
//	public String getName() {return name;}
//	public int getAge() {return age;}
//	
//	public int compareTo(Student otherStudent) {
//		int ageCompare = Integer.compare(this.age, otherStudent.age);
//		return (ageCompare != 0) ? ageCompare : this.name.compareTo(otherStudent.name);
//	}
//}
//
//public class EX18_4 {
//
//	public static void main(String [] args) {
//		TreeSet<Student> studentSet = new TreeSet<Student>();
//		
//		studentSet.add(new Student("John", 20));
//		studentSet.add(new Student("Emily", 18));
//		studentSet.add(new Student("David", 22));
//		studentSet.add(new Student("Sarah", 20));
//		studentSet.add(new Student("Michael", 19));
//		
//		System.out.println("정렬된 학생들:");
//		for(Student s: studentSet) {
//			System.out.println("이름: " + s.getName() + ", 나이: " + s.getAge());
//		}
//	}
//}
