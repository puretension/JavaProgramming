import java.util.*;

//피터 코드 상속규칙 + 객체지향 패턴 익히기

abstract class Role{
	public abstract void doIt();
}


class Person {

	Role r;
	
    public void doIt() {
        // 역할을 수행하는 기본 동작
        System.out.println("Person is doing something.");
    }
	public void setRole(Role r) {
		this.r = r;
	}
    public void getRole() {
    	r.doIt();
    }
}

class Driver extends Role {

    @Override
    public void doIt() {
        System.out.println("Driving");  // 오버라이딩
    }
}

class SoccerPlayer extends Role {

    @Override
    public void doIt() {
        System.out.println("Playing Soccer");
    }
}

class Worker extends Role {

    @Override
    public void doIt() {
        System.out.println("Working");  // 오버라이딩
    }
}

public class EX18_2 {
    public static void main(String[] args) {

        Person person = new Person();  // 사람 객체 생성
      
        person.doIt();  // 기본 동작 수행
        
        //person = new Driver();  // 운전자로 역할 변경
        person.setRole(new Driver());
        person.getRole();

        //person = new Worker();  // 직장인으로 역할 변경
        person.setRole(new Worker());
        person.getRole();

        //person = new SoccerPlayer(); // 축구 선수로 역할 변경
        person.setRole(new SoccerPlayer());
        person.getRole();
    }
}