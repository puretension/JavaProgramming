package 명품JAVA;
import java.util.Scanner;

//class TV{ 
//	private int size;
//	private String manu;
//	public TV(int size, String manu) { 
//		this.size = size;
//		this.manu = manu;
//		System.out.print(size + "인치 " + manu);
//	}
//	
//	public TV(String manu) {
//		this.size = 32;
//		this.manu = manu;
//		System.out.print(size + "인치 " + manu);
//	}
//	
//	public TV() { 
//		this(32,"LG");
//	}
//}
//
//class Person{ 
//	private int age;
//	protected void setter(int age) { 
//		this.age = age;
//	}
//	protected int getter() { 
//		return this.age;
//	}
//}
//
//class Power{ 
//	private int kick;
//	private int punch;
//	public Power(int kick, int punch) { 
//		this.kick = kick;
//		this.punch = punch;
//	}
//}
//
//class StaticTest{
//	static int a;
//	static int getA() { return a; }
//	int b;
//	int getB() {return b;}
//	int f() {return getA();} //인스턴스 메서드에서 정적메서드 호출가능하나 
//	//static int g() {return getB();} //정적 메서드에서는 정적메서드만 호출가능함
//}

//class Day{ 
//	private String work;
//	public void set(String work) { this.work = work;} 
//	public String get() { return work;}
//	public void show() { 
//	String result = (work == null) ? "없습니다." : work + "입니다.";
//	System.out.println(result);
//	}
//}
//
//class MonthSchedule{ 
//	Day [] session;
//	public MonthSchedule(int endDay) { 
//		session = new Day[endDay];
//		for(int i = 0;i<endDay;i++)
//			session[i] = new Day();
//	}
//	public void input(int day, String work) { 
//		session[day-1].set(work);
//	}
//	
//	public void view(int day) { 
//		System.out.print(day + "일의 할 일은 ");
//		session[day-1].show();
//	}
//
//	public void finish() { 
//		System.out.print("프로그램을 종료합니다...");
//	}
//}

//class Phone{ 
//	 String name;
//	 String tel;
//	void setName(String name) { 
//		this.name  = name;
//	}
//	
//	void setTel(String tel) { 
//		this.tel = tel;
//	}
//}
//
//class PhoneBook{ 
//	Phone [] info;
//	PhoneBook(int n){ 
//		info = new Phone[n];
//		for(int i = 0;i<n;i++)
//			info[i] = new Phone();
//	}
//	int cnt = 0;
//	void input(String name, String tel) { 
//		info[cnt].setName(name);
//		info[cnt].setTel(tel);
//		cnt++;
//	}
//
//	void search(String name) { 
//		boolean flag = true;
//		for(int i = 0;i<info.length;i++)
//		{ 
//			if(info[i].name.equals(name))
//			{ 
//				System.out.println(info[i].name + "의 번호는 " + info[i].tel + "입니다.");
//				flag = false;
//			}
//			if(flag) System.out.println(name +"이 없습니다.");
//		}
//	}
//}

public class class4Practice {
	
//	static String replaceSpace(char [] str) { 
//		for(int i = 0;i<str.length;i++)
//		{ 
//			if(str[i] == ' ') str[i] = ',';
//		}
//		return new String(str);
//	}
	
//	static void run() { 
//		System.out.println("이번달 스케쥴 관리 프로그램.");
//		MonthSchedule april = new MonthSchedule(30);
//		Scanner in = new Scanner(System.in);
//		boolean flag = true;
//		while(flag) {
//		System.out.print("할일(입력:1, 보기:2, 끝내기:3 >>");
//		int choice = in.nextInt();
//		switch(choice) { 
//		case 1: System.out.print("날짜?");
//				int day = in.nextInt();
//				System.out.print("할일(빈칸없이입력)?");
//				String work = in.next();
//				april.input(day, work);
//				break;
//		case 2: System.out.print("날짜?");
//				day = in.nextInt();
//				april.view(day);
//				break;
//		case 3:april.finish();
//				flag = false;
//				break;
//		}
//		}
//	}
	
	static void run() { 
		System.out.print("인원수>>");
	}

	public static void main(String[] args) {
//		String x = "This is a penceil.";
//		String y = replaceSpace(x.toCharArray());
//		System.out.print(y);
//		
//		Person aPerson = new Person();
	
		//run();
	
		
//		int num = 3;
//		int a = 0;
//		int c = 0;
//		switch(num) { 
//		case 2: --num;
//				System.out.println(num);
//		case 3: a = num++;
//				System.out.println(a + " " + num); //3 4
//		case 4: 
//				System.out.println(a-- + " " + num--); //3 4      2 3
//		case 5: a++; //3 3
//				System.out.println(++a + " " + num--); //4 3       4 2 
//		case 6: c = a++ - num--; //2
//				break;
//		}
//		
//		System.out.println(num + " " + a + " " + c); //5 1

//		int a = 100, result;
//		for(int i = 1;i<=5;i++)
//		{
//			 result = a<<i;
//			 System.out.printf("%d << %d = %d\n", a,i,result);
//		}
//		for(int i = 1;i<=5;i++)
//		{
//			 result = a>>i;
//			 System.out.printf("%d >> %d = %d\n", a,i,result);
//		}
//		a = -100;
//		for(int i = 1;i<=5;i++)
//		{
//			 result = a>>i;
//			 System.out.printf("%d >>> %d = %d\n", a,i,result);
//		}
		

	}

}
