//import java.util.*;
//
//abstract class Toy{
//	
//}
//
//class Kid{
//	private Toy toy;
//	public void setToy(Toy toy) {
//		this.toy = toy;
//	}
//	public void play() {
//		System.out.println(toy.toString());
//	}
//}
//
//class Robot extends Toy{
//	public String toString() {return "Robot";}
//}
//
//class Lego extends Toy{
//	public String toString() {return "Lego";}
//}
//
//public class DIPExample1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Kid kid = new Kid();
//		Toy robot = new Robot();
//		kid.setToy(robot);
//		kid.play();
//		Toy lego = new Lego();
//		kid.setToy(lego);
//		kid.play();
//	}
//
//}
