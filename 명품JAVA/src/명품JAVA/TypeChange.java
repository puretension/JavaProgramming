//package 명품JAVA;
//
//interface Speak{ 
//	void english();
//}
//
//class ClassA {
//	String strA = "strA";
//	String strA2 = "strA2";
//	String a;
//	public void methodA() {
//		System.out.println("methodA");
//	}
//	public void methodA2() {
//		System.out.println("methodA2");
//	}
//}
//
//class ClassExtendA extends ClassA implements Speak{
//	String strA = "strExA";
//	String strA3 = "strExA3";
//	
//	public void methodA() {
//		System.out.println("methodExA");
//	}
//	public void methodA3() {
//		System.out.println("methodExA3");
//	}
//	public void english() { 
//		System.out.println("I can speak English");
//	}
//}
//
//public class TypeChange {
//
//	public static void main(String[] args) {
//		ClassA ca = new ClassA(); //부모타입 부모객체O
//		ClassExtendA cea = new ClassExtendA(); //자식타입 자식객체O
//		ClassA cea2 = new ClassExtendA(); //부모타입으로 자식객체O 
//		//ClassExtendA ca2 = new ClassA(); //자식타입으로 부모생성X(compile error)
//		
//		
//		System.out.println("------기본호출---------------------");
//		//변수 호출
//		System.out.println("ca.strA					= " + ca.strA);
//		System.out.println("cea.strA				= " + cea.strA);
//		System.out.println("cea2.strA				= " + cea2.strA);
//		//메소드 호출
//		System.out.print("ca.methodA()				= ");
//		ca.methodA();
//		System.out.print("cea.methodA()				= ");
//		cea.methodA();
//		System.out.print("cea2.methodA()				= ");
//		cea2.methodA();
//		//아래부터가 진짜임 
//		
//		System.out.println("-----------------------------------------------------------");
//		System.out.println("----------형변환호출---------------------------------------");
//		((ClassA) ca).methodA();
//		
//		//형변환 변수 호출
//		//(자식타입) 부모객체(부모타입) 변수 호출 불가
//		//System.out.println("((ClassExtendA) ca).strA		= " + ((ClassExtendA) ca).strA);	//Runtime Error
//		//(부모타입) 자식객체(부모타입)가능 
//		System.out.println("((ClassA) cea).strA			= " + ((ClassA) cea).strA);	// 형변환을 상위의 값으로는 변환 가능.
//		//(자식타입) 자식객체(부모타입)가능 
//		System.out.println("((ClassExtendA) cea2).strA		= " + ((ClassExtendA) cea2).strA);
//		
//		//형변환 메소드 호출
//		//자식타입으로 부모객체 메서드 호출 불가 
//		//((ClassExtendA) ca).methodA();	// Runtime Error
//		//부모타입으로. 부모타입으로 만든 부모객체 메서드 호출 가능 
//		System.out.print("((ClassA) cea).methodA()		= ");
//		((ClassA) cea).methodA();
//		//자식타입으로. 부모타입으로 만든 자식객체 메서드 호출 가능
//		System.out.print("((ClassA) cea2).methodA()		= ");
//		((ClassA) cea2).methodA();
//		
//		System.out.println("-----------------------------------------------------------");
//		System.out.println("-----상위 클래스에만 존재하는 변수, 메소드 호출--------------");
//		//상위 클래스에만 존재하는 변수 호출
//		System.out.println("ca.strA2				= " + ca.strA2);
//		System.out.println("cea.strA2				= " + cea.strA2);
//		System.out.println("cea2.strA2				= " + cea2.strA2);
//		
//		//상위 클래스에만 존재하는 메소드 호출
//		System.out.print("ca.methodA2()				= ");
//		ca.methodA2();
//		System.out.print("cea.methodA2()				= ");
//		cea.methodA2();
//		System.out.print("cea2.methodA2()				= ");
//		cea2.methodA2();
//		
//		System.out.println("----캐스트 형변환시 상위 클래스에만 존재하는 변수, 메소드 호출-");
//		//형변환시 상위 클래스에만 존재하는 변수 호출
//		//System.out.println("((ClassExtendA) ca).strA2		= " + ((ClassExtendA) ca).strA2);	//Runtime Error
//		System.out.println("((ClassA) cea).strA2			= " + ((ClassA) cea).strA2);	// 형변환을 상위의 값으로는 변환 가능.
//		System.out.println("((ClassExtendA) cea2).strA2		= " + ((ClassExtendA) cea2).strA2);
//		//형변환시 상위 클래스에만 존재하는 메소드 호출
//		//((ClassExtendA) ca).methodA2();	// Runtime Error
//		System.out.print("((ClassA) cea).methodA2()		= ");
//		((ClassA) cea).methodA2();
//		System.out.print("((ClassA) cea2).methodA2()		= ");
//		((ClassA) cea2).methodA2();
//		System.out.println("-----------------------------------------------------------");
//		
//		System.out.println("----형변환 시 하위 클래스에만 존재하는 변수, 메소드 호출-");
//		//형변환시 하위 클래스에만 존재하는 변수 호출
//		//System.out.println("((ClassExtendA) ca).strA3		= " + ((ClassExtendA) ca).strA3);	//Runtime Error
//		//System.out.println("((ClassA) cea).strA3			= " + ((ClassA) cea).strA3);	//Compile Error
//		//System.out.println("((ClassExtendA) ceA3).strA3	= " + ((ClassExtendA) ceA3).strA3);	//Compile Error
//		//형변시 하위 클래스에만 존재하는 메소드 호출
//		//((ClassExtendA) ca).methodA3();	// Runtime Error
//		//((ClassA) cea).methodA3();	//Compile Error
//		//((ClassA) ceA3).methodA3();	//Compile Error
//		System.out.println("-----------------------------------------------------------");
//		cea.english();//당연히됨 
//		ClassA caa = new ClassExtendA(); //부모타입 자식객체
//		
//		if(caa instanceof Speak)
//			((Speak) caa).english();
//	}
//
//}
