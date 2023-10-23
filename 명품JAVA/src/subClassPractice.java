////문제 8번을 유심히보자(super메서드와 super생성자 활용함)
//
////문제5
//class Point{ 
//	private int x,y;
//	public Point(int x, int y) { this.x = x; this.y = y;}
//	public int getX() {return x;}
//	public int getY() {return y;}
//	protected void move(int x,int y) {this.x = x; this.y = y;} //부모의 move
//}
//
////문제8
//class PositivePoint extends Point{ 
//	//why protected used?
//	protected void move(int x, int y) {  //자식의 move
//		if(x < 0)
//			return;
//		if(y < 0)
//			return;
//		super.move(x,y); //부모의 move
//	}
//	
//	PositivePoint(int x, int y)
//	{ 
//		super(x,y);
//		if(x<0 || y<0)
//			this.move(0, 0);
//	}
//	
//	PositivePoint()
//	{ 
//		super(0,0);
//	}
//	
//	public String toString() { return "(" + this.getX() + "," + getY() + ")의 점"; }
//}
//
////문제7
//class Point3D extends Point{ 
//	int z;
//	Point3D(int x, int y, int z){ super(x,y); this.z = z; }
//	
//	void moveUp() { this.z += 1;}
//	
//	void moveDown() { this.z -= 1;}
//	
//	public String toString() { return "(" + this.getX() + "," + getY() +"," + z + ")의 점"; }
//	void move(int x, int y, int z) {
//		super.move(x,y); 
//		this.z = z; } 
//}
////문제6
//class ColorPoint extends Point {
//	private String color;
//	ColorPoint(int x, int y, String color)
//	{ 
//		super(x,y);
//		this.color = color;
//	}
//	ColorPoint() { 
//		super(0,0);
//		this.color = "Black";
//	}
//	
//	ColorPoint(int x, int y){ 
//		super(x,y);
//	}
//	
//	void setXY(int x, int y)
//	{ 
//		move(x,y);
//	}
//	void setColor(String color)
//	{ 
//		this.color = color;
//	}
//	public String toString() { 
//		return color + "색의 " + "(" + getX() + "," + getY() + ")" + "의 점";
//	}
//}
//
//public class subClassPractice {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		ColorPoint cp = new ColorPoint(5,5,"Yellow");
////		cp.setXY(10, 20);
////		cp.setColor("RED");
////		String str = cp.toString();
////		System.out.println(str + "입니다. ");
//		
////		ColorPoint zeroPoint = new ColorPoint();
////		System.out.println(zeroPoint.toString() + "입니다.");
////		
////		ColorPoint cp2 = new ColorPoint(10,10);
////		cp2.setXY(5, 5);
////		cp2.setColor("RED");
////		String str2 = cp2.toString();
////		System.out.println(str2 + "입니다. ");
//		
////		Point3D p = new Point3D(1,2,3);
////		System.out.println(p.toString() + "입니다.");
////		p.moveUp();
////		System.out.println(p.toString() + "입니다.");
////		p.moveDown();
////		p.move(10,10);
////		System.out.println(p.toString() + "입니다.");
////		p.move(100, 200, 300);
////		System.out.println(p.toString() + "입니다.");
//		
//		PositivePoint p = new PositivePoint();
//		p.move(10, 10);
//		System.out.println(p.toString() + "입니다.");
//		
//		p.move(-5,5);
//		System.out.println(p.toString() + "입니다.");
//		
//		PositivePoint p2 = new PositivePoint(-10,-10);
//		System.out.println(p2.toString() + "입니다.");
//	}
//
//}
