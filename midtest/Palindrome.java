//import java.util.*;
//
//
//public class Palindrome {
//    public static void main(String[] args) {
//        String s1 = "abcba";
//        String s2 = "abcbd";
//        String s3 = "abcBa";
//
//        checkPalindrome(s1);
//        checkPalindrome(s2);
//        checkPalindrome(s3);
//    }
//
//    private static void checkPalindrome(String s) {
//        //todo: 구현하시오 (implement this)
//    	String x = s.toUpperCase().trim().replace("[^A-Z]", "");
//    	String temp = new StringBuffer(x).reverse().toString();
//		if(x.equals(temp)) System.out.println(s + " is Palindrome");
//		else System.out.println(s + "is not palindrome");
//    }
//}
