//import java.util.Scanner;
//
//
//
//interface Shape{ 
//	final double PI = 3.14;
//	void draw();
//	double getArea();
//	default public void redraw() { 
//		System.out.println("----다시 그립니다.---");
//		this.draw();
//	}
//}
//
//
//class Circle implements Shape{ 
//	int r;
//	Circle(int r){ this.r = r;}
//	public double getArea() {return r*r*PI;}
//	public void draw() { 
//		System.out.print("반지름이 " + r + "인 원입니다.");
//	}
//}
//
//class Rect implements Shape{ 
//	int width, height;
//	Rect(int width, int height) { this.width = width; this.height = height;}
//	public double getArea() {return width*height;}
//	public void draw() { 
//		System.out.print(width + "x" + height + "크기의 사각형입니다");
//	}
//}
//
//class Triangle implements Shape{ 
//	int x;
//	Triangle(int x) { this.x = x;}
//	public double getArea() {return x*x;}
//	public void draw() { 
//		System.out.print(getArea() + "크기의 사각형입니다");
//	}
//}
//
//
//public class GraphicEditor {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		Shape donut = new Circle(10);
////		donut.redraw();
////		System.out.println("면적은 " + donut.getArea());
//		
//		Shape [] list = new Shape[3];
//		list[0] = new Circle(10);
//		list[1] = new Triangle(20);
//		list[2] = new Rect(10,40);
//		
//		for(int i = 0;i<list.length;i++)
//			list[i].redraw();
//		for(int i = 0;i<list.length;i++)
//			System.out.println("면적은 " + list[i].getArea());
//	}
//
//}
