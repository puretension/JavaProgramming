//package 명품JAVA;
//import java.util.Scanner;
//
//
//public class StringBufferAdd {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		Scanner in = new Scanner(System.in);
////		StringBuffer sb = new StringBuffer();
////		System.out.print("Enter the first string: ");
////		String a = in.nextLine();
////		sb.append(a.toCharArray());
////		System.out.print("Enter the second string: ");
////		String b = in.nextLine();
////		sb.append(a.toCharArray());
//		
//			Scanner sc = new Scanner(System.in);
//	        System.out.print("Enter the first string: ");
//	        String first = sc.nextLine();
//	        System.out.print("Enter the second string: ");
//	        String second = sc.nextLine();
//	        
//	        StringBuffer input = new StringBuffer(first).append(" ").append(second);
//	        StringBuffer result = new StringBuffer();
//		
//	        String [] words = input.toString().split(" ");
//	        
////	        for (String word : input.toString().split(" ")) {
////	            if (word.length() > 0) {
////	                result.append(Character.toUpperCase(word.charAt(0))).
////	                        append(word.substring(1)).
////	                        append(" ");
////	            }
////	        }
//	        
//	        for(int i = 0;i<words.length;i++)
//	        {
//	        	 String word = words[i];
//	        	 if(word.length() > 0)
//	        	 { 
//	        		 result.append(Character.toUpperCase(word.charAt(0)));
//	        		 result.append(word.substring(1)).append(" ");
//	        		 
//	        	 }
//	        }
//	}
//
//}
