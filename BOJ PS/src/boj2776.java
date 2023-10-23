//
//import java.util.*;
//
//public class boj2776 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int T,M,N;
//        T = in.nextInt();
//        while(T-- > 0) {
//            N = in.nextInt();
//            BST tree = new BST();
//            for(int i=0; i<N; i++) {
//                int number = in.nextInt();
//                tree.insert(number);
//            }
//            M = in.nextInt();
//            for(int i=0; i<M; i++) {
//                int number = in.nextInt();
//                if(tree.search(number)) System.out.println(1);
//                else System.out.println(0);
//            }
//        }
//    }
//}
//
//class BST {
//    class Node {
//        int data;
//        Node left, right;
//        public Node(int data) {
//            this.data = data;
//            left = right = null;
//        }
//    }
//    Node root;
//    public BST() {
//        root = null;
//    }
//    public void insert(int data) {
//        root = insertRec(root, data);
//    }
//    Node insertRec(Node root, int data) {
//        if(root == null) {
//            root = new Node(data);
//            return root;
//        }
//        if(data < root.data) root.left = insertRec(root.left, data);
//        else if(data > root.data) root.right = insertRec(root.right, data);
//        return root;
//    }
//    public boolean search(int data) {
//        return searchRec(root, data);
//    }
//    boolean searchRec(Node root, int data) {
//        if(root == null) return false;
//        if(root.data == data) return true;
//        if(data < root.data) return searchRec(root.left, data);
//        else return searchRec(root.right, data);
//    }
//}
