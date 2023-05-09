//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Comparator;
//import java.util.Scanner;
//
//class Person implements Comparable<Person> {
//    private String name;
//    private Integer age;
//
//    public Person(String name, Integer age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//
//    @Override
//    public int compareTo(Person other) {
//        return this.age.compareTo(other.getAge());
//    }
//}
//
//public class ArrayListObjectSortExample {
//    public static void main(String[] args) {
//        List<Person> people = new ArrayList<>();
////        people.add(new Person("Sachin", 47));
////        people.add(new Person("Chris", 34));
////        people.add(new Person("Rajeev", 25));
////        people.add(new Person("David", 31));
//        
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the number of people you want to add: ");
//        int num = in.nextInt();
//        for(int i = 0;i<num;i++) {
//        	System.out.println("Enter name and age for person" + i+1 + ":");
//        	String name = in.next();
//        	int age = in.nextInt();
//        	people.add(new Person(name, age));     	
//        }
//        
//        
//        System.out.println("Person List : " + people);
//        System.out.print("Enter the index of the person you want to remove: ");
//        int removeIdx = in.nextInt();
//        people.remove(removeIdx);
//        System.out.print("Person removed from index " + removeIdx + ". Updated person list: ");
//        System.out.println(people);
//        
//        // Sort by natural order (age)
//        System.out.print("Enter the index of the person you want to modify: ");
//        int modifyIdx = in.nextInt();
//        System.out.println("Enter updated name and age for person at index " + modifyIdx + ":");
//        String modifyName = in.next();
//        int modifyAge = in.nextInt();
//        people.get(modifyIdx).setName(modifyName);
//        people.get(modifyIdx).setAge(modifyAge);
//        System.out.println("Person at " + modifyIdx + " updated. Updated person list: " + people);
//        System.out.print("Enter the name of the person you want to search: ");
//        String searchName = in.next();
//        System.out.print("Person found: ");
//        for(int k = 0;k<people.size();k++) { 
//        	if(people.get(k).getName().equals(searchName))
//        	{ 
//        		System.out.println(people.get(k));
//        		break;
//        	}
//        }
//        
//        System.out.println("All persons:");
//        for(int k = 0;k<people.size();k++) { 
//        	System.out.println(people.get(k));
//        }
//        
//        people.sort(Comparator.naturalOrder());
//
//        // Collections.sort(people); # 다른 표현
//        System.out.println("Sorted Person List by Age : " + people);
//        
//        // Sort by name
//        Collections.sort(people, Comparator.comparing(Person::getName));
//        System.out.println("Sorted Person List by Name : " + people);
//    }
//}