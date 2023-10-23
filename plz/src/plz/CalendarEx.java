//package plz;
//
//import java.util.Calendar;
//import java.util.Scanner;
//import java.lang.StringBuffer;
//import java.util.ArrayList;
//
//class Student{ 
//	String name;
//	private int kor;
//	private int math;
//	private int eng;
//	private double grade;
//	Student(String name, int kor, int math, int eng) { 
//	this.name = name;
//	this.kor = kor;
//	this.math = math;
//	this.eng = eng;
//	this.grade = (double)(kor+ math +eng)/4.0;
//	}
//	String getScore() { 
//		return name + ":" + kor + "/" + math + "/" + eng +   "/" + grade;
//	}
//	
//}
//
//public class CalendarEx {
//	
//
//
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		Student [] x = new Student[4];
//		ArrayList<Student>myClass = new ArrayList<>();
//		//StringBuffer sb = new StringBuffer();
//		
//		String [] strArray = new String[4];
//		
//		for(int i = 0;i<4;i++)
//		{
//			 String str = in.nextLine();
//			 strArray = str.trim().split(",");
//			 String name = strArray[0];
//			 int kor = Integer.parseInt(strArray[1]);
//			 int math = Integer.parseInt(strArray[2]);
//			 int eng = Integer.parseInt(strArray[3]);
//			 x[i] = new Student(name,kor,math,eng);
//			 myClass.add(x[i]);
//		}
//		
//		for(int i = 0;i<4;i++) { 
//			System.out.println(myClass.get(i).getScore());
//		}
//	}
//
//}
//
