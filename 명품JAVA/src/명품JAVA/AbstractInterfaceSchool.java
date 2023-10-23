//package 명품JAVA;
//
//class Rectangle5 {
//	public int width;
//	public int height;
//	public Rectangle5(int w, int h) {
//		width = w;
//		height = h;		
//	}
//	public int computeRectangleArea() {
//		return width * height;
//	}
//}
//class Cube5 extends Rectangle5 {
//	public int depth;
//	public Cube5(int w, int h, int d) {
//		super(w,h);
//		depth = d;
//	}
//	public int computeCubeArea() {
//		return super.computeRectangleArea() * depth;
//	}
//}
//
//public class AbstractInterfaceSchool {
//
//	public static void main(String args[]) {
//		Rectangle5 r = new Cube5(10,20,30);
//		r.computeRectangleArea();
//		Cube5 t = (Cube5) r;
//		t.computeCubeArea();
//	}
//
//}
