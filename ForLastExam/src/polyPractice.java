//import java.util.*;
//abstract class Talk{
//	abstract void talk();
//}
//class Animal extends Talk{
//	Talk t;
//	public void setTalk(Talk t) {
//		this.t = t;
//	}
//	public void getTalk() {
//		t.talk();
//	}
//	public void talk() {
//		System.out.println("Hello");
//	}
//}
//class Cats extends Talk{
//	public void talk() {
//		System.out.println("야용~");
//	}
//}
//class Dog extends Talk{
//	public void talk() {
//		System.out.println("멍멍~");
//	}
//}
//class Parrot extends Talk{
//	public void talk() {
//		System.out.println("안녀엉~");
//	}
//}
//public class polyPractice {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Animal a = new Animal();
//		a.talk();
//		a.setTalk(new Cats());
//		a.getTalk();
//		a.setTalk(new Dog());
//		a.getTalk();
//		a.setTalk(new Parrot());
//		a.getTalk();
//	}
//
//}
