

//다형성 전에 오버라이딩과 오버로딩에 관한 짧은 예제
//class Animal{ 
//	String name;
//	void setName(String name) { 
//		this.name = name;
//	}
//}
//
//class Dog extends Animal{ 
//	void sleep() { 
//		System.out.println(this.name + "zzz");
//	}
//}
//
////오버라이딩(내부 구현부 변경, 추가X)
//class HouseDog extends Dog{ 
//	void sleep() { 
//		System.out.println(this.name + " zzz in house");
//	}
//}
//
////오버로딩(파라미터의 추가)
//class HouseDog2 extends Dog{ 
//	void sleep() { 
//		System.out.println(this.name + " zzz in house");
//	}
//	
//	void sleep(int hour) { 
//		System.out.println(this.name + " zzz in house for " + hour + " hours");
//	}
//}
//
////생성자 오버로딩 
//class HouseDog3 extends Dog{ 
//	HouseDog3(String name) { 
//		this.setName(name);
//	}
//	
//	HouseDog3(int type) { 
//		if(type == 1) { 
//			this.setName("sonny");
//		}
//		else if(type == 2) { 
//			this.setName("choco");
//		}
//	}
//}





//public class Polymorphism {
//	public static void main(String [] args) { 
//		HouseDog houseDog = new HouseDog();
//		houseDog.setName("Happy");
//		houseDog.sleep();
//		
//		HouseDog3 choco = new HouseDog3(2);
//		HouseDog3 sonny = new HouseDog3("sonny");
//		System.out.println(choco.name);
//		System.out.println(sonny.name);
//		
//		
//		
//		
//	}
//}
