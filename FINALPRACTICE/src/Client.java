//interface MovingStrategy{
//	void move();
//}
//
//interface AttackStrategy{
//	void attack();
//}
//
//class WalkingStrategy implements MovingStrategy{
//	public void move() {
//		  System.out.println("I can only walk.");
//	}
//}
//
//class FlyingStrategy implements MovingStrategy{
//	public void move() {
//		  System.out.println("I can fly.");
//	}
//}
//
//class PunchStrategy implements AttackStrategy{
//	public void attack() {
//        System.out.println("I have strong punch and can attack with it.");
//	}
//}
//
//class MissileStrategy implements AttackStrategy{
//	public void attack() {
//		 System.out.println("I have Missile and can attack with it.");
//	}
//}
//
//abstract class Robot {
//    private String name;
//
//    public Robot(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//    
//    MovingStrategy movingStrategy;
//    AttackStrategy attackStrategy;
//    
//    void setMovingStrategy(MovingStrategy movingStrategy) {
//    	this.movingStrategy = movingStrategy;
//    }
//    
//    void setAttackStrategy(AttackStrategy attackStrategy) {
//    	this.attackStrategy = attackStrategy;
//    }
//
//    // 공격
//    public void attack() {
//    	attackStrategy.attack();
//    }
//
//    // 이동
//    public void move() {
//    	movingStrategy.move();
//    }
//}
//
//// 태권브이 클래스 : 로봇 클래스 상속
//class TaeKwonV extends Robot {
//    public TaeKwonV(String name) {
//        super(name);
//    }
//}
//
//// 아톰 클래스 : 로봇 클래스 상속
//class Atom extends Robot {
//
//    public Atom(String name) {
//        super(name);
//    }
//}
//
//public class Client {
//    public static void main(String[] args) {
//        Robot taekwonV = new TaeKwonV("TaekwonV");
//        Robot atom = new Atom("Atom");
//        
//        taekwonV.setMovingStrategy(new WalkingStrategy());
//        taekwonV.setAttackStrategy(new MissileStrategy());
//        
//        atom.setMovingStrategy(new FlyingStrategy());
//        atom.setAttackStrategy(new PunchStrategy());
//        
//        System.out.println("My name is " + taekwonV.getName());
//        taekwonV.move();
//        taekwonV.attack();
//
//        System.out.println("My name is " + atom.getName());
//        atom.move();
//        atom.attack();
//    }
//}