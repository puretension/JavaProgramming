//import java.io.*;
//
//import java.io.*;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//class Person {
//    private String name;
//    private int age;
//    private String city;
//
//    public Person(String name, int age, String city) {
//        this.name = name;
//        this.age = age;
//        this.city = city;
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
//    public String getCity() {
//        return city;
//    }
//}
//
//public class EX22_2 {
//    private static final String CSV_FILE = "data.csv";
//    private static final String CSV_SPLIT_BY = ",";
//
//    public static void main(String[] args) {
//        List<Person> personList = readDataFromCSV();
//
//      // Print the personList
//      for (Person person : personList) {
//          System.out.print("Name: " + person.getName() + ", ");
//          System.out.print("Age: " + person.getAge() + ", ");
//          System.out.print("City: " + person.getCity());
//          System.out.println();
//      }
//
//      // Add a new student
//      addNewStudentToCSV();
//
//      // Read the updated data from CSV
//      personList = readDataFromCSV();
//
//      // Print the personList
//      for (Person person : personList) {
//          System.out.print("Name: " + person.getName() + ", ");
//          System.out.print("Age: " + person.getAge() + ", ");
//          System.out.print("City: " + person.getCity());
//          System.out.println();
//      }
//    }
//
//    private static List<Person> readDataFromCSV() {
//        List<Person> personList = new ArrayList<>();
//
//        // TODO: 구현
//        
////        File file = new File(CSV_FILE);
//        try(BufferedReader bf = new BufferedReader(new FileReader(CSV_FILE))){
//        	String line;
//        	while((line = bf.readLine()) != null) { 
//        		String [] data = line.split(CSV_SPLIT_BY);
//        		String name = data[0];
//        		int age = Integer.parseInt(data[1]);
//        		String city = data[2];
//        		personList.add(new Person(name, age, city));
//        	}
//        }catch(IOException e) {
//        	e.printStackTrace();
//        }
//        return personList;
//    }
//
//    private static void addNewStudentToCSV() {
//    	//true가 있기에 append기능(true없으면 지우고 새로다시쓴다)
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(CSV_FILE, true))) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter the name of the student: ");
//            String name = scanner.nextLine();
//            System.out.print("Enter the age of the student: ");
//            int age = scanner.nextInt();
//            scanner.nextLine(); // Consume the remaining newline character
//            System.out.print("Enter the city of the student: ");
//            String city = scanner.nextLine();
//
//            // TODO: 구현
//            
//            bw.write(name + CSV_SPLIT_BY + age + CSV_SPLIT_BY + city);
//            bw.newLine();
//            
//            System.out.println("New student added to the CSV file.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}