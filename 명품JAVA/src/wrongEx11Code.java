//package newAsignment;
//
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.StringTokenizer;
//
//public class EX11_11 {
//   public static void main(String[] args) {
//       Scanner scanner = new Scanner(System.in);
//       System.out.print("수식을 입력하세요: ");
//       String input = scanner.nextLine();
//
//       // 공백 제거
//       input = input.replaceAll("\\s+", "");
//
//       // 입력된 수식 출력
//       System.out.println("입력된 수식: " + input);
//
//       double result = 0.0;
//
//       // 사용법 체크
//       StringTokenizer tokenizer = new StringTokenizer(input, "+-*/", true);
//
//       ArrayList<String> tokens = new ArrayList<>();
//       while (tokenizer.hasMoreTokens()) {
//           tokens.add(tokenizer.nextToken());
//       }
//
//       for (String each_token : tokens) {
//           System.out.println(each_token);
//       }
//
//       // tokens 리스트에서 곱셈과 나눗셈과 관련된 항 모두 처리
//       // 3 + 4 * 6 -2  => 3 + 24 - 2
//       // todo: 1. { 3, +, 24, -, 2} 로 구성된 리스트 구성
//       for(int i = 0;i<tokens.size();i++)
//       { 
//    	   if(tokens.get(i).equals("*") || tokens.get(i).equals("/"))
//    	   { 
//    		   Double k = calculate(Double.parseDouble(tokens.get(i-1)), Double.parseDouble(tokens.get(i+1)), tokens.get(i).charAt(0));
//    		   tokens.remove(i-1);
//    		   tokens.remove(i-1);
//    		   tokens.remove(i-1);
//    		   tokens.add(i - 1, Double.toString(k));
//    		   i--; //1줄여줘야함 skip하지 않도록 
//    	   }
//       }
//      
//       //거의 다되가나 약간의 보완이 필요
//      
//       // todo: 2 { 3, +, 24, -, 2} 로 구성된 리스트로 +, - 연산 수행
//       
//       result = Double.parseDouble(tokens.get(0));
//       for(int i = 1;i<tokens.size();i++)
//       { 
//    	   if(tokens.get(i).equals("+") || tokens.get(i).equals("-"))
//    	   { 
//    		   result = calculate(result, Double.parseDouble(tokens.get(i+1)), tokens.get(i).charAt(0));
//    		 
//    	   }
//       }
//       // 최종 결과 출력
//       System.out.println("계산 결과: " + result);
//   }
//
//   private static double calculate(double num1, double num2, char op) {
//       switch (op) {
//           case '+':
//               return num1 + num2;
//           case '-':
//               return num1 - num2;
//           case '*':
//               return num1 * num2;
//           case '/':
//               return num1 / num2;
//           default:
//               throw new IllegalArgumentException("지원하지 않는 연산자입니다.");
//       }
//   }
//}
