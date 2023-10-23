//interface MovingStrategy {
//  public void move();
//}
//
//interface AttackStrategy {
//  public void attack();
//}
//
//class FlyingStrategy implements MovingStrategy {
//  public void move() {
//    System.out.println("fly");
//  }
//}
//
//class WalkingStrategy implements MovingStrategy {
//  public void move() {
//    System.out.println("walk");
//  }
//}
//
//class PunchStrategy implements AttackStrategy {
//  public void attack() {
//    System.out.println("punch");
//  }
//}
//
//class MissileStrategy implements AttackStrategy {
//  public void attack() {
//    System.out.println("missile");
//  }
//}
//
//abstract class Robot {
//  private String name;
//  private AttackStrategy attackStrategy;
//  private MovingStrategy movingStrategy;
//
//  public Robot(String name) {
//    this.name = name;
//  }
//
//  public String getName() {
//    return name;
//  }
//
//  public void move() {
//    movingStrategy.move();
//  }
//
//  public void attack() {
//    attackStrategy.attack();
//  }
//
//  public void setMovingStrategy(MovingStrategy movingStrategy) {
//    this.movingStrategy = movingStrategy;
//  }
//
//  public void setAttackStrategy(AttackStrategy attackStrategy) {
//    this.attackStrategy = attackStrategy;
//  }
//}
//
//class Atom extends Robot {
//  public Atom(String name) {
//    super(name);
//  }
//}
//
//class TaekwonV extends Robot {
//  public TaekwonV(String name) {
//    super(name);
//  }
//}
//
//public class Client {
//  public static void main(String[] args) {
//    Robot t = new TaekwonV("T");
//    Robot a = new Atom("A");
//
//    t.setMovingStrategy(new WalkingStrategy());
//    t.setAttackStrategy(new MissileStrategy());
//    a.setMovingStrategy(new FlyingStrategy());
//    a.setAttackStrategy(new PunchStrategy());
//
//    t.move();
//    t.attack();
//    a.move();
//    a.attack();
//  }
//}
