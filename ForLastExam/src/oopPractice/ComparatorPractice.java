package oopPractice;
import java.util.*;

//class Employee implements Comparable<Employee>{
//	String id,name;
//	double salary;
//	public Employee(String id, String name, double salary) {
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//	}
////	public int compareTo(Employee e) {
////		double x = Double.compare(salary, e.salary);
////		if(x == 0) return name.compareTo(e.name); //연봉이 동일하다면, 문자열 이름 오름차순으로
////		else if(x > 0) return -1;
////		else if(x < 0) return 1; //salary 내림차순 
////		else return 0;
////	}
//	public int compareTo(Employee e) {
//		return Double.compare(e.salary,this.salary); //내림차순일땐 파라미터 위치를 변경시킨다!!
//	}
//	public String toString() {
//		return this.name;
//	}
//}

class Book{
	private String title,author;
	private int year;
	Book(String title, String author, int year){
		this.title = title;
		this.author = author;
		this.year = year;
	}
	public String getTitle() {return title;}
	public String getAuthor() {return author;}
	public int getYear() {return year;}
}

class BookComparator implements Comparator<Book>{
	public int compare(Book b1, Book b2) {
		return b1.getTitle().compareTo(b2.getTitle());
	}
}

//public class ComparatorPractice {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		ArrayList<Employee>list = new ArrayList<>();
////		list.add(new Employee("22", "홍길동", 25.5));
////		list.add(new Employee("22", "이길동", 15.5));
////		list.add(new Employee("22", "김길동", 15.5));
////		list.add(new Employee("22", "정길동", 30.5));
////		Collections.sort(list);
////		for(Employee s: list) {
////			System.out.println(s);
////		}
//		
////		Comparator<String>lengthComparator = (a,b) -> Integer.compare(a.length(), b.length());
//		Comparator<Book>BookComparator = (a,b) -> a.getTitle().compareTo(b.getTitle()); //알파벳비교로 정렬
//		//TreeSet<Book> tb = new TreeSet<>(new BookComparator());
//		TreeSet<Book> tb = new TreeSet<>(BookComparator);
//		tb.add(new Book("cook", "me", 22));
//		tb.add(new Book("sookkk", "you", 22));
//		tb.add(new Book("aook", "they", 22));
//		// 정렬된 책 목록 출력
//		System.out.println("정렬된 책 목록:");
//		for (Book book : tb) {
//		System.out.println("제목: " + book.getTitle() + ", 저자: " + book.getAuthor() + ", 발행년도: " + book.getYear());
//		}
//	}
//
//}
