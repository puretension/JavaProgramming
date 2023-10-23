package 명품JAVA;
import java.util.ArrayList;
import java.util.Scanner;
//
//
//
//abstract class Pet {
//    protected String name;
//    protected int age;
//    protected String owner;
//    protected boolean isVaccinated;
//
//    public Pet(String name, int age, String owner, boolean isVaccinated) {
//        this.name = name;
//        this.age = age;
//        this.owner = owner;
//        this.isVaccinated = isVaccinated;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public boolean isVaccinated() {
//        return isVaccinated;
//    }
//
//    public abstract void makeSound();
//}
//
//
//interface Groomable {
//    void groom();
//}
//interface Walkable {
//    void walk();
//}
//
//class Dog extends Pet implements Groomable, Walkable {
//    // todo: 내부 구현
//    private String color;
//    public Dog(String name, int age, String owner, boolean isVaccinated, String color) { 
//    	super(name, age, owner, isVaccinated);
//    	this.color = color;
//    }
//    public void groom() { 
//    	System.out.println("gromming the dog...");
//    }
//    public void walk() { 
//    	System.out.println("walking the dog...");
//    }
//    public void makeSound() { 
//    	System.out.println("Bark");
//    }
//    
//}
//
//class Cat extends Pet implements Groomable, Walkable {
//    private String color;
//    public Cat(String name, int age, String owner, boolean isVaccinated, String color) { 
//    	super(name, age, owner, isVaccinated);
//    	this.color = color;
//    }
//    public void groom() { 
//    	System.out.println("gromming the cat...");
//    }
//    public void walk() { 
//    	System.out.println("walking the cat...");
//    }
//    public void makeSound() { 
//    	System.out.println("Meow");
//    }
//    //todo: 내부 구현
//}
//
//


//public class ArrayListPracticeName {
//    public static void main(String[] args) {
////        // 펫 객체 생성
////        Pet bobby = new Dog("Bobby", 3, "Alice", true, "White");
////        Pet coco = new Cat("Coco", 2, "Bob", false, "Gray");
////
////        // 펫 소리 출력 (your code)
////        bobby.makeSound();
////        coco.makeSound();
////        // 예방 접종 여부 출력 (your code)
////        System.out.println(bobby.isVaccinated);
////        System.out.println(coco.isVaccinated);
////        // 그루밍 (your code)
////        if(bobby instanceof Groomable) { 
////        	((Groomable) bobby).groom();
////        }
////        if(coco instanceof Groomable) { 
////        	((Groomable) coco).groom();
////        }
////        // 산책 (your code)
////        if(bobby instanceof Walkable) { 
////        	((Walkable) bobby).walk();
////        }
////        ((Walkable) coco).walk();
//    	
//    	ArrayList<String>names = new ArrayList<>();
//    	Scanner in = new Scanner(System.in);
//    	
//    	for(int i = 0;i<4;i++)
//    	{ 
//    		System.out.print("이름을 입력하세요>>");
//    		String name = in.nextLine();
//    		names.add(name);
//    	}
//    	
//    	StringBuilder sb = new StringBuilder();
//    	
//     	for(int i = 0;i<4;i++)
//    	{ 
//    		sb.append(names.get(i)).append(" ");
//    	}
//     	
//     	String [] longestName = sb.toString().split(" ");
//     	int x = 0;
//     	int maxIdx = 0;
//     	for(int i = 0;i<longestName.length;i++)
//     	{ 
//     		if(longestName[i].length() > x) { 
//     		x = longestName[i].length();
//     		maxIdx = i;
//     		}
//     	}
//    	System.out.print("가장 긴 이름은: " + longestName[maxIdx]);
//    }
//}


//import java.io.IOException;
//interface Sort {
//
//    // todo: ascending  descending 함수 정의
//	void ascending(int [] arr);
//	void descending(int [] arr);
//
//    default void description() {
//        System.out.println("숫자를 정렬하는 알고리즘입니다.");
//    }
//}
//
//class HeapSort implements Sort {
//
//    @Override
//    public void ascending(int[] arr) {
//        System.out.println("HeapSort ascending");
//    }
//
//    @Override
//    public void descending(int[] arr) {
//        System.out.println("HeapSort descending");
//    }
//
//    @Override
//    public void description() {
//        Sort.super.description();
//        System.out.println("HeapSort 입니다.");
//    }
//}
//
//
//class QuickSort implements Sort{
//
//    @Override
//    public void ascending(int[] arr) {
//        System.out.println("QuickSort ascending");
//    }
//
//    @Override
//    public void descending(int[] arr) {
//        System.out.println("QuickSort descending");
//    }
//
//    @Override
//    public void description() {
//        Sort.super.description();
//        System.out.println("QuickSort 입니다.");
//    }
//}
//
//class BubbleSort implements Sort {
//
//    @Override
//    public void ascending(int[] arr) {
//        System.out.println("BubbleSort ascending");
//    }
//
//    @Override
//    public void descending(int[] arr) {
//        System.out.println("BubbleSort descending");
//    }
//
//    @Override
//    public void description() {
//        Sort.super.description();
//        System.out.println("BubbleSort 입니다.");
//    }
//}
//
//public class ArrayListPracticeName {
//    public static void main(String[] args) throws IOException {
//        System.out.println("정렬 방식을 선택하세요.");
//        System.out.println("B : BubbleSort ");
//        System.out.println("H : HeapSort ");
//        System.out.println("Q : QuickSort ");
//
//        int ch = System.in.read();
//        Sort sort = null;
//
//        //--------------Your Code-----------------------
//        switch(ch) { 
//      case 'B': sort = new BubbleSort(); break;
//      case 'H': sort = new HeapSort(); break;
//      case 'Q': sort = new QuickSort(); break;
//        
//        }
//
//        //-----------------------------------------------
//        int[] arr = new int[10];
//        sort.ascending(arr);
//        sort.descending(arr);
//        sort.description();
//
//    }
//}