//package 명품JAVA;
//import java.util.*;
//
//class Student{ 
//	String name;
//	String major;
//	int num;
//	double grade;
//	public Student(String name, String major, int num, double grade){ 
//		this.name = name;
//		this.major = major;
//		this.num = num;
//		this.grade = grade;
//	}
//}
//
//public class ArrayListPractice6 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		
//		Student [] student = new Student[4];
//		ArrayList<Student>info = new ArrayList<>();
//		System.out.print("학생 이름,학과,학번,학점평균 입력하세요.\n");
//		String [] strArray;
//	
//		for(int i = 0;i<4;i++)
//		{ 
//			System.out.print(">>");
//			String str = in.nextLine();
//			strArray = str.trim().split(",");
//			String name = strArray[0];
//			String major = strArray[1];
//			int num = Integer.parseInt((strArray[2]));
//			double grade = Double.parseDouble(strArray[3]);
////			student[i] = new Student(name,major,num,grade);
////			info.add(student[i]);
//			info.add(new Student(name,major,num,grade));
//		}
//		
//		for(int i = 0;i<4;i++) { 
//			System.out.println("이름:" + info.get(i).name);
//			System.out.println("학과:" + info.get(i).major);
//			System.out.println("학번:" + info.get(i).num);
//			System.out.println("학점평균:" + info.get(i).grade);
//		}
//	
//		
//		while(true) { 
//			System.out.println("학생이름 >> ");
//			String str = in.next();
//			if(str.equals("그만")) break;
//			for(int i = 0;i<4;i++)
//				if(info.get(i).name.equals(str))
//					System.out.println(info.get(i).name + ", " + info.get(i).major + ", " + info.get(i).num + "," + info.get(i).grade);
//		}
//	}
//
//}
