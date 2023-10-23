//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//class Student{
//	private String name;
//	private int age;
//	private String StudentId;
//	
//	public Student(String name, int age, String StudentId) {
//		this.name = name;
//		this.age = age;
//		this.StudentId = StudentId;
//	}
//	
//	String getName() {
//		return name;
//	}
//	int getAge() {
//		return age;
//	}
//	String getStudentId() {
//		return StudentId;
//	}
//}
//
//public class FinalEx4 {
//    public static void main(String[] args) {
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("John", 20, "12345"));
//        students.add(new Student("Alice", 22, "67890"));
//        students.add(new Student("Bob", 19, "54321"));
//        students.add(new Student("Sarah", 21, "98765"));
//
//        // 객체 정보를 CSV 파일에 저장
//        saveToCSV(students, "new_students.csv");
//
//        // CSV 파일에서 객체 정보를 불러오기
//        List<Student> loadedStudents = loadFromCSV("given_students.csv");
//        
//        // 불러온 객체 정보 출력
//        for (Student student : loadedStudents) {
//            System.out.println(student.getName() + ", " + student.getAge() + ", " + student.getStudentId());
//        }
//    }
//    
////  private static void addNewStudentToCSV() {
////	//true가 있기에 append기능(true없으면 지우고 새로다시쓴다)
////    try (BufferedWriter bw = new BufferedWriter(new FileWriter(CSV_FILE, true))) {
////        Scanner scanner = new Scanner(System.in);
////        System.out.print("Enter the name of the student: ");
////        String name = scanner.nextLine();
////        System.out.print("Enter the age of the student: ");
////        int age = scanner.nextInt();
////        scanner.nextLine(); // Consume the remaining newline character
////        System.out.print("Enter the city of the student: ");
////        String city = scanner.nextLine();
////
////        // TODO: 구현
////        
////        bw.write(name + CSV_SPLIT_BY + age + CSV_SPLIT_BY + city);
////        bw.newLine();
////        
////        System.out.println("New student added to the CSV file.");
////    } catch (IOException e) {
////        e.printStackTrace();
////    }
////}
//
//    private static void saveToCSV(List<Student> students, String fileName) {
//        // TODO:
//    	
//    	try (BufferedWriter bw = new BufferedWriter(new FileWriter("new_students.csv"))){
//    		
//    	}catch()
//    }
//
//    private static List<Student> loadFromCSV(String fileName) {
//        // TODO:
//    }
//}