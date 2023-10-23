//import java.util.ArrayList;
//
//public class EXPerform {
//    public static void main(String[] args) throws InterruptedException {
//        ArrayList<Integer> list = new ArrayList<>();
//
//        Thread thread1 = new Thread(() -> {
//            for (int i = 0; i < 1000; i++) {
//                list.add(i);
//            }
//        });
//
//        Thread thread2 = new Thread(() -> {
//            for (int i = 0; i < 1000; i++) {
//                list.add(i);
//            }
//        });
//
//        thread1.start();
//        thread2.start();
//
//        thread1.join();
//        thread2.join();
//
//        System.out.println("Size of list: " + list.size());
//    }
//}
//
//import java.util.ArrayList;
//import java.util.Vector;
//
//public class EXPerform {
//
//    public static void main(String[] args) throws InterruptedException {
//        Vector<Integer> list = new Vector<>();
//
//        Thread thread1 = new Thread(() -> {
//            for (int i = 0; i < 1000; i++) {
//                list.add(i);
//            }
//        });
//
//        Thread thread2 = new Thread(() -> {
//            for (int i = 0; i < 1000; i++) {
//                list.add(i);
//            }
//        });
//
//        thread1.start();
//        thread2.start();
//
//        thread1.join();
//        thread2.join();
//
//        System.out.println("Size of list: " + list.size());
//    }
//}


