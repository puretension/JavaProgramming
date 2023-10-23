package oopPractice;
import java.util.*;

////before
//class Animal {
//	String type;
//    
//    Animal(String type) {
//    	this.type = type;
//    }
//}
//
//// 동물 타입을 받아 각 동물에 맞춰 울음소리를 내게 하는 클래스 모듈
//class HelloAnimal {
//    void hello(Animal animal) {
//        if(animal.type.equals("Cat")) {
//            System.out.println("냐옹");
//        } else if(animal.type.equals("Dog")) {
//            System.out.println("멍멍");
//        }
//    }
//}
//
//

////MyAfter
//
//interface Animal{
//	void speak();
//}
//
//class Cat implements Animal{
//	public void speak() {
//		System.out.println("야용");
//	}
//}
//
//class Lion implements Animal{
//	public void speak() {
//		System.out.println("어흥");
//	}
//}
//
//
//class Dog implements Animal{
//	public void speak() {
//		System.out.println("멍멍");
//	}
//}
//
//class HelloAnimal{
//	void hello(Animal animal) {
//		animal.speak();
//	}
//}
//
//public class OCPPractice{
//	public static void main(String [] args) {
//		HelloAnimal hello = new HelloAnimal();
//		hello.hello(new Cat());
//		hello.hello(new Dog());
//	}
//}

////////after 
////abstract class Animal{
////	abstract void speak();
////}
////
////class Cat extends Animal { // 상속
////    void speak() {
////        System.out.println("냐옹");
////    }
////}
////
////class Dog extends Animal { // 상속
////    void speak() {
////        System.out.println("멍멍");
////    }
////}
////
////class Sheep extends Animal {
////    void speak() {
////        System.out.println("매에에");
////    }
////}
////
////class Lion extends Animal {
////    void speak() {
////        System.out.println("어흥");
////    }
////}
//
//interface Animal{
//	void speak();
//}
//
//class Cat implements Animal { // 상속
//public void speak() {
//  System.out.println("냐옹");
//}
//}
//
//class Dog implements Animal { // 상속
//	public void speak() {
//  System.out.println("멍멍");
//}
//}
//
//class Sheep implements Animal { // 상속
//public void speak() {
//  System.out.println("매에에");
//}
//}
//
//class Lion implements Animal{ // 상속
//	public void speak() {
//  System.out.println("어흥");
//}
//}
//
//class HelloAnimal{
//	void hello(Animal animal) {
//		animal.speak();
//	}
//}
//
//public class OCPPractice {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		 HelloAnimal hello = new HelloAnimal();
//
//		  Animal cat = new Cat();
//	        Animal dog = new Dog();
//	        Animal sheep = new Sheep();
//	        Animal lion = new Lion();
//	        hello.hello(cat); // 냐옹
//	        hello.hello(dog); // 멍멍
//	        hello.hello(sheep); 
//	        hello.hello(lion);
//	}
//
//}

//class AreaCalculator {
//    public double calculateTotalArea(Object[] shapes) {
//        double totalArea = 0;
//        for (Object shape : shapes) {
//            if (shape instanceof Rectangle) {
//                Rectangle rectangle = (Rectangle) shape;
//                totalArea += rectangle.getWidth() * rectangle.getHeight();
//            } else if (shape instanceof Circle) {
//                Circle circle = (Circle) shape;
//                totalArea += Math.PI * circle.getRadius() * circle.getRadius();
//            }
//        }
//        return totalArea;
//    }
//}

//interface Shape{
//	double calculateArea();
//}
//
//class Rectangle implements Shape{
//	private int w,h;
//	Rectangle(int w, int h){
//		this.w = w;
//		this.h = h;
//	}
//	public int getW() {return w;}
//	public int getH() {return h;}
//	public double calculateArea() {
//		return getW() * getH();
//	}
//}
//
//class Circle implements Shape{
//	private int r;
//	Circle(int r){
//		this.r = r;
//	}
//	public double calculateArea() {
//		return r * r * 3.14;
//	}
//}
//
//class AreaCalculator{
//	double sum = 0;
//	double calculateTotalArea(Shape[] arr) {
//		for(Shape s: arr) {
//			sum += s.calculateArea();
//		}
//		return sum;
//	}
//}
//
//public class OCPPractice{
//	public static void main(String [] args) {
//	    Shape[] shapes = {
//                new Rectangle(4, 10),
//                new Circle(3),
//                new Rectangle(2, 7)
//        };
//
//        AreaCalculator calculator = new AreaCalculator();
//        double totalArea = calculator.calculateTotalArea(shapes);
//        System.out.println("Total area: " + totalArea);
//	}
//}
