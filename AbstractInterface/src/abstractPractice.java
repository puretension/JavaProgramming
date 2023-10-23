
//abstract class Shape{ 
//	//객체변수 
//	String color;
//	
//	abstract double area();
//	
//	public abstract String toString();
//	
//	//생성자 
//	public Shape(String color) { 
//		System.out.println("Shape클래스 생성자 호출");
//		this.color = color;
//	}
//	
//	public String getColor() { 
//		return color;
//	}
//}
//
//class Circle extends Shape{
//	
//	double radius;
//	
//	public Circle(String color, double radius) {
//		super(color); //상위 생성자 호출 
//		System.out.println("Circle 클래스 생성자 호출");
//		this.radius = radius;
//	} 
//	double area() { 
//		return radius * radius * 3.14;
//	}
//	
//	//추상 메서드 내부 구
//	public String toString() { 
//		return "원 색상은 " + super.getColor() + " 그리고 면적은 : " + area();
//	}
//	
//}
//
//class Rectangle extends Shape{ 
//	double length;
//	double width;
//	
//	public Rectangle(String color, double length, double width) { 
//		super(color); 
//		System.out.println("Rectangle 클래스 생성자 호출");
//		this.length = length;
//		this.width = width;
//	}
//	double area() { 
//		return width * width;
//	}
//	
//	public String toString() { 
//		return "사각형 색상은 " + super.getColor() + "그리고 면적은: " + area(); 
//	}
//	
//}
//
//public class abstractPractice {
//	public static void main(String [] args) { 
//		Shape s1 = new Circle("빨간색", 2.2);
//		Shape s2 = new Rectangle("노란색", 2,4);
//		
//		System.out.println(s1.toString());
//		System.out.println(s2.toString());
//	}
//}






