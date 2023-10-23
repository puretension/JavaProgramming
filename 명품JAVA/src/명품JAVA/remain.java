package 명품JAVA;
//import com.sec02.ExRun;

class Book {
    String title;
    int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }    // 생성자


    @Override
    public String toString() {
        return title + "'s price = " + price;
    }
}


class Am {
	int count=1;
	void callme() {
		System.out.println("Am의 callme() 실행, count 값 : "+count);
	}
}
class Bm extends Am {
	int count=2;
	void callme() {     
		System.out.println("Bm의 callme() 실행, count 값 : "+count);
	}
}

class Cm extends Am {   
	int count=3;
	void callme() {     
		System.out.println("Cm의 callme() 실행, count 값 : "+count);
	}
}


public class remain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ExRun exRun = new ExRun();
//        System.out.println("exrun result = " + exRun.run(4, 5));
		
		// 참조 변수 objects와 객체를 위한 참조 변수 3개가 생성됨
//        Object[] objects = new Object[3];
//        objects[0] = new String("Hello, World!");
//        objects[1] = new Integer(1000);
//        objects[2] = new Book("반지의 제왕", 20000);
//        for (Object each_obj: objects) 
//            System.out.println(each_obj.toString());
  
//        for(int i = 0;i<objects.length;i++)
//        	System.out.println(objects[i].toString());
        
//        Am r = new Am();
//		r.callme();
//		System.out.println("r.count 값 : " + r.count);
//		r = new Bm();
//		r.callme();
//		System.out.println("r.count 값 : " + r.count);
//	    r = new Cm();
//	    r.callme();
//	    System.out.println("r.count 값 : " + r.count);
	}

}
