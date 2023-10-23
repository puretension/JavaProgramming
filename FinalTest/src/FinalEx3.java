//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//class Student implements Comparable<Student> {
//    private String name;
//    private int age;
//    private String studentId;
//
//    public Student(String name, int age, String studentId) {
//        this.name = name;
//        this.age = age;
//        this.studentId = studentId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getStudentId() {
//        return studentId;
//    }
//    
//    public int compareTo(Student s) {
//    	return Integer.compare(getAge(), s.getAge());
//    }
//}
//
//public class FinalEx3 {
//    public static void main(String[] args) {
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("John", 20, "12345"));
//        students.add(new Student("Alice", 22, "67890"));
//        students.add(new Student("Bob", 19, "54321"));
//        students.add(new Student("Emily", 21, "09876"));
//        students.add(new Student("David", 18, "13579"));
//
//        // TODO: 나이순으로 학생 리스트 정렬 및  4번째로 나이가 많은 학생 출력
//        
//        Collections.sort(students,Collections.reverseOrder()); //내림차순
//        
//        System.out.println("Fourth oldest student:");
//        System.out.println("Name: " + students.get(3).getName());
//        System.out.println("Age: " + students.get(3).getAge());
//        System.out.println("Student ID: " + students.get(3).getStudentId());
//    }
//}