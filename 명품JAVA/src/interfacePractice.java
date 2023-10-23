
interface PhoneInterface{ 
	int count = 0; // public static final int count = 0;
	public static final int TIMEOUT = 10000;
	void sendCall(); //public abstract void sendCall();
	public abstract void receiveCall();
	default void printLogo() { 
		System.out.println("** Phone **");
	}
	static void showMe() {}
}

interface MobilePhoneInterface extends PhoneInterface{ 
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface{ 
	public void play();
	public void stop();
}

class PDA{ 
	int calculate(int x, int y) { 
		return x + y;
	}
}

class SmartPhone extends PDA implements MobilePhoneInterface,MP3Interface{ 
	public void printLogo() { 
		System.out.println("RING RING");
	}
	public void sendCall() { 
		System.out.println("RING RING");
	}
	public void receiveCall() { 
		System.out.println("전화가 왔습니다");
	}
	public void flash() { 
		System.out.println("전화기에 불이 켜졌습니다.");
	}
	public void sendSMS() { 
		System.out.println("문자를 보냅니다.");
	}
	public void receiveSMS() { 
		System.out.println("문자를 받습니다.");
	}
	public void play() { 
		System.out.println("놀자!!");
	}
	public void stop() { 
		System.out.println("멈춰!!");
	}
}

class SamsungPhone implements PhoneInterface{ 
	public void printLogo() { 
		System.out.println("RING RING");
	}
	public void sendCall() { 
		System.out.println("RING RING");
	}
	public void receiveCall() { 
		System.out.println("전화가 왔습니다");
	}
	public void flash() { 
		System.out.println("전화기에 불이 켜졌습니다.");
	}
	
}

public class interfacePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SamsungPhone a = new SamsungPhone();
	a.printLogo();
	a.sendCall();
	a.receiveCall();
	a.flash();
	
	SmartPhone b = new SmartPhone();
	b.calculate(2, 4);
	}

}
