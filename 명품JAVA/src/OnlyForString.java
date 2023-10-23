//import java.util.Scanner;
//public class OnlyForString {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		String str1 = "abcd";
////		char data[] = {'a', 'b','c','d'};
////		String str2 = new String(data); //str2 = "abcd"
////		
////		String java = "Java";
////		String cpp = "C++";
////		int res = java.compareTo(cpp);
////		if(res < 0)
////			System.out.println(java + "가 더 오름차순입니다.");
////		else if (res >0)
////			System.out.println(java + "가 더 내림차순입니다.");
////		else 
////			System.out.println("동일합니다.");
//		
////		StringBuffer love = "I Love";
////		love.concat("You");
////		System.out.println(love);
//		
////		StringBuffer love = new StringBuffer("I Love");
////		love.append("You");
////		System.out.println(love);
////		
////		StringBuffer sb = new StringBuffer("This");
////		sb.append(" is pencil");
////		System.out.println(sb);
////		
////		sb.insert(7,  " my");
////		System.out.println(sb);
////		sb.replace(8, 10, "your");
////		System.out.println(sb);
////		sb.delete(8, 13);
////		System.out.println(sb);
////		sb.setLength(4);
////		System.out.println(sb);
//		
//		Scanner in = new Scanner(System.in);
//		String firstString,secondString;
//		System.out.print("Enter the first string: ");
//		firstString = in.nextLine();
//		System.out.print("Enter the second string: ");
//		secondString = in.nextLine();
//		String answerString = firstString + " " + secondString;
////		//System.out.println(answerString);
//		String [] arr = answerString.split(" ");
//		StringBuffer answer = new StringBuffer("");
//		for(int i = 0;i<arr.length;i++)
//		{ 
//			String modifiedWord = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
//			answer.append(modifiedWord + " ");
//			
//		}
////		for(int i = 0;i<arr.length;i++)
////		{ 
////			answer.append(arr[i] + " ");
////
////		}
////		
////		
//		System.out.print("String with first letter capitalized: " + answer);
//		
////		StringBuffer answer = new StringBuffer();
////		for(String word: in.toString().split(" "))
////		{ 
////			if(word.length() > 0) { 
////				answer.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
////			}
////		}
//	}
//
//}
