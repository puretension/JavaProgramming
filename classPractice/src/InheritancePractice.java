//
//class Calculation{ 
//	int z;
//	
//	public void addition(int x, int y) { 
//		z = x+y;
//		System.out.println("두 수의 덧셈: " + z);
//	}
//	
//	public void subtraction(int x, int y) { 
//		z = x-y;
//		System.out.println("두 수의 뺄셈: " + z);
//		
//	}
//}
//
//class Inheritance extends Calculation{ 
//	public void multiplication(int x, int y) { 
//		z = x * y;
//		System.out.println("두 수의 곱셈: " + z);
//	}
//}
//
//class Father{ 
//	String familyName = "프로그래머";
//	String houseAddress = "인천";
//}
//
//class Son extends Father{ 
//	String name = "홍길동";
//	
//	void printDetails() { 
//		System.out.print("나의 이름은 " + this.name);
//		System.out.print("나의 아버지는 " + this.familyName);
//		System.out.print("나의 고향은 " + this.houseAddress);
//	}
//}
//
//class GrandFather { 
//	void printGrandFather() { 
//		System.out.println("나는 할아버지입니다.");
//	}
//}
//
//class SubFather extends GrandFather{ 
//	String familyName = "프로그래머";
//	String houseAddress = "인천";
//	
//	void printFather() { 
//		System.out.println("나는 아버지입니다! 할아버지로부터 상속받았습니다.");
//	}
//}
//
//class SubSon extends SubFather{ 
//	
//	void printSon() { 
//		System.out.println("나는 아들입니다.");
//		System.out.println("나는 아버지로부터 상속받습니다.");
//		System.out.println("나의 아버지는 " + this.familyName);
//		System.out.println("나의 집은 "+ this.houseAddress);
//		
//	}
//}
//
//class SubDaughter extends SubFather{ 
//	void printDaughter() { 
//		System.out.println("나는 딸입니다.");
//		System.out.println("나는 아버지로부터 상속받습니다.");
//		System.out.println("나의 아버지는 " + this.familyName);
//		System.out.println("나의 집은 " + this.houseAddress);
//		
//	}
//}
//
//class SuperCat { 
//	String name;
//	void printInfo() { 
//		System.out.println("부모 고양이입니다.");
//	}
//}
//
//class SubCat extends SuperCat{ 
//	String name;
//	void printInfo() { 
//		System.out.println("아기 고양이입니다.");
//	}
//	
//	void printDetail() { 
//		super.printInfo();
//		printInfo();
//		super.name = "SuperCat";
//		name = "SubCat";
//	}
//}
//
//class SuperCat2{ 
//	String name;
//	String age = "15살";
//	
//	SuperCat2(String n){ 
//		name = n;
//		System.out.println("부모 고양이입니다." + "이름은 " + name);
//	}
//}
//
//class SubCat2 extends SuperCat2{ 
//	String name;
//	String age = "2살";
//	
//	SubCat2(String n1, String n2){ 
//		super(n1);
//		this.name = n2;
//		System.out.println("아기고양이입니다. 이름은 " + name);
//	}
//}
//
//public class InheritancePractice {
//
//	public static void main(String [] args) { 
////		int a = 30, b = 20;
////		Inheritance twoNum = new Inheritance();
////		twoNum.addition(40, 20);
////		twoNum.multiplication(50, 40);
////		twoNum.subtraction(30, 3);
//		
//		SubCat2 myCat = new SubCat2("james", "Karo");
//		
//	}
//	
//}
