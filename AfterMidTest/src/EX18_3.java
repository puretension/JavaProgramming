//import java.util.ArrayList;
//import java.util.Iterator;
//
//abstract class DiscountMode{
//	abstract double getDiscountRate();
//}
//
//class OnSale extends DiscountMode{
//	double getDiscountRate() { return 0.1; }
//}
//
//class TodayEvent extends DiscountMode{
//	public double getDiscountRate() {
//		return 0.3;
//	}
//}
//
//class BlackFriday extends DiscountMode{
//	public double getDiscountRate() {
//		return 0.5;
//	}
//}
//
//class ChristmasSale extends DiscountMode{
//	public double getDiscountRate() {
//		return 0.6;
//	}
//}
//
//class NonDiscount extends DiscountMode{
//	
//	public double getDiscountRate() {
//		return 0.0;
//	}
//}
//
//class Song {
//	
//	private DiscountMode mode;
//
//    //private String mode;
//
//    public void setMode(DiscountMode mode) {
//        this.mode = mode;
//    }
//
//    public double getPrice() {
//        return 10.0 - 10.0 * this.mode.getDiscountRate();
//    }
//    
////    public String getDiscountMode() {
////        return this.mode;
////    }
//    
//}
//
//
//
//class CartForSongs {
//
//    ArrayList<Song> cart = new ArrayList<>();
//
//        double calculateTotalPrice() {
//            double total = 0.0;
//            Iterator<Song> iterator = cart.iterator();
//
//            while (iterator.hasNext()) {
//                Song song = iterator.next();
////                total = total + song.getPrice();
////                if(song.getDiscountMode().equals("OnSale"))
////                	total -= 0.1 * song.getPrice();
////                else if(song.getDiscountMode().equals("TodayEvent"))
////                	total -= 0.3 * song.getPrice();
////                else if(song.getDiscountMode().equals("BlackFridaySale"))
////                	total -= 0.5 * song.getPrice();
////                else total = total;
//                total += song.getPrice();
//            }
//            return total;
//        }
//
//        public void add(Song song){
//            cart.add(song);
//        }
//}
//
//
//
//// 새로운 할인 모드가 생기면 calculateTotalPrice() 메서드가 변경되어야한다.
//// 예를 들어 만약 새로운 할인인 blackFridaySale(50%할인) 이 추가되면 새로운 코드가 작성된다.
//// 그렇다면 새로운 요구사항이 생길 때마다 매번 수정되어야만한다.
//// 그렇기 때문에 일반화관계(상속)을 통해 !할인 모드를 외부에 캡슐화!할 필요가 있으며 다형성과 동적 바인딩을 통해 적합한 할인이 적용되게 해야한다.
//
//    // CartForSongs -----------> Song -------------> DiscountMode <--------------- OnSale, NonDiscount, TodaySale, BlackFridaySale, ChristmasSale,,,
//    public class EX18_3 {
//        public static void main(String[] args) {
//
//            Song song1 = new Song();
//            //song1.setMode("NonDiscounted");
//            song1.setMode(new NonDiscount());
//
//            Song song2 = new Song();
//            //song2.setMode("NonDiscounted");
//            song2.setMode(new BlackFriday());
//
//            Song song3 = new Song();
//            //song3.setMode("OnSale");
//            song3.setMode(new OnSale());
//            
//            Song song4 = new Song();
//            //song4.setMode("TodayEvent");
//            song4.setMode(new TodayEvent());
//            
//            CartForSongs cart = new CartForSongs();
//            cart.add(song1);
//            cart.add(song2);
//            cart.add(song3);
//            cart.add(song4);
//
//            System.out.println(cart.calculateTotalPrice()); //10 + 5 + 9 + 7 => 31
//        }
//    }
//    
//    
