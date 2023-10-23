//import java.util.ArrayList;
//
//class Stack<E> {
//	
//	ArrayList<E>arr;
//	
//	public Stack(){
//		arr = new ArrayList<>();
//	}
//
//    public void push(E element) {
//        arr.add(element);
//    }
//
//    public E pop() {
//        if (isEmpty()) {
//            throw new RuntimeException("Stack is empty");
//        }
//        return arr.remove(arr.size() - 1);
//    }
//
//    public E peek() {
//        if (isEmpty()) {
//            throw new RuntimeException("Stack is empty");
//        }
//        return arr.get(arr.size() - 1);
//    }
//
//    public boolean isEmpty() {
//        return arr.size() == 0;
//    }
//}
//
//
//public class delegatePractice {
//    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//
//        System.out.println(stack.pop()); // 3
//        System.out.println(stack.pop()); // 2
//        System.out.println(stack.peek()); // 1
//        System.out.println(stack.pop()); // 1
//        System.out.println(stack.isEmpty()); // true
//
//    }
//}