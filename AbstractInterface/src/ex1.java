//import java.util.Scanner;
//
//interface Predator{ 
//	String getFood();
//	
//	default void printFood() { 
//		System.out.printf("my food is %s\n", getFood());
//	}
//	
//	int LEG_COUNT = 4; //interface 상수
//	
//	static int speed() { 
//		return LEG_COUNT * 30;
//	}
//}
//
//class Animal{ 
//	String name;
//	
//	void setName(String name) { 
//		this.name = name;
//	}
//}
//
//class Tiger extends Animal implements Predator, Barkable{ 
//	public String getFood() { 
//		return "apple";
//	}
//	public void bark() { 
//		System.out.println("호랑이!");
//	}
//}
//
//class Lion extends Animal implements Predator{ 
//	public String getFood() { 
//		return "banana";
//	}
//	
//	public void bark() { 
//		System.out.println("사자!");
//	}
//}
//
//class ZooKeeper{ 
//	void feed(Predator predator) { 
//		System.out.println("feed " + predator.getFood());
//	}
//}
//
//class Bouncer{ 
//	void barkAnimal(Animal animal) { 
//		if(animal instanceof Tiger) { 
//			System.out.println("호랑이!");
//		} else if(animal instanceof Lion) { 
//			System.out.println("사자!");
//		}
//	}
//}
//
//interface Barkable{ 
//	void bark();
//}
//
//
//
//public class ex1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ZooKeeper zooKeeper = new ZooKeeper();
//		Tiger tiger = new Tiger();
//		Lion lion = new Lion();
//		zooKeeper.feed(tiger);
//		zooKeeper.feed(lion);
//		Predator.speed();
//		
//		Bouncer bouncer = new Bouncer();
//		bouncer.barkAnimal(lion);
//		tiger.bark();
//	}
//
//}
//class Counter{ 
//	int count = 0;
//}
//
//class Updater{ 
////	void update(int count) { 
////		count++;
////	}
//	void update(Counter counter) { 
//		counter.count++;
//	}
//}
//
//public class ex1{ 
//	public static void main(String [] args) { 
//		Counter myCounter = new Counter();
//		System.out.println("before update: " + myCounter.count);
//		Updater updater = new Updater();
//		updater.update(myCounter);
//		System.out.println("after update: " + myCounter.count);
//	}
//}