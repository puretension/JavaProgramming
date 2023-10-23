//package 명품JAVA;
//
////interface Language{ 
////	abstract void english();
////}
////
////class GrandFather implements Language{ 
////	void print() { 
////		System.out.println("GrandParent's Print");
////	}
////	public void english() {}
////}
////
////class Father extends GrandFather{ 
////	public void print() { 
////		super.print();
////		System.out.println("GrandParent's Print");
////	}
////}
////
////interface Language{ 
////	abstract void english();
////}
////
////abstract class Language2{ 
////	abstract void english();
////	void Korean() {}
////}
////
////class GrandFather implements Language{ 
////void print() { 
////	System.out.println("GrandParent's Print");
////}
//////public 필수 
////public void english() {}
////
////}
////
////class GrandMother extends Language2{ 
////	//Interface와 Abstract의 차이점 
////	void english() {}
////}
//
//
////class GrandParent1{ 
////	private int grandParentVar = 10;
////	public String family_name = "Seok";
////	
////	public int getGrandParentVar() { return grandParentVar;}
////	
////	public void setGrandParentVar(int grandParentVar) 
////	{this.grandParentVar = grandParentVar;}
////	
////}
////
////class Parent2 extends GrandParent1{
////	private int parentVar;
////
////	public int getParentVar() { return parentVar;}
////}
////
////class Child2 extends Parent2{ 
////	public void accessGrandParentVar() { 
////		System.out.println(getGrandParentVar());
////		System.out.println(super.getParentVar());
////		System.out.println(super.family_name);
////	}
////}
//
//class StrReviser{ 
//	public void revise(String str) { 
//		str = "Hello3";
//	}
//}
//
//public class GrandParent {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		Child2 child = new Child2();
////		child.accessGrandParentVar();
//		
//		//String str1 = "hello1";
//		//String str2  ="hello2";
//		String str1 = new String("hello1");
//		String str2 = new String("hello4");
//		
//		System.out.println("str1: " + str1);
//		System.out.println("str2: " + str2);
//		
//		StrReviser reviser = new StrReviser();
//		reviser.revise(str1);
//		reviser.revise(str2);
//		
//		System.out.print(str1);
//		System.out.print(str2);
//	}
//
//}
