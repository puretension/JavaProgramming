////package newAsignment;
//
//import java.util.ArrayList;
//
//class NumberExtractor {
//    public static ArrayList<Integer> extractNumbers(String str) {
//        ArrayList<Integer> result = new ArrayList<>();
//        StringBuffer nums = new StringBuffer();
//        for(int i = 0;i<str.length();i++)
//        { 
//        	char x = str.charAt(i);
//        	if(Character.isDigit(x)) //정수일땐 추가
//        		nums.append(x);
//        	//숫자이후 정수 x 문자 등장?
//        	else { 
//        		if(nums.length() > 0) { 
//        			result.add(Integer.parseInt(nums.toString())); //숫자 담은거 옮긴다
//        			nums.setLength(0); //스트링 버퍼 초기화
//        		}
//        	}
//        }
//        return result;
//    }
//}
//public class EX12_4 {
//    public static void main(String[] args) {
//        String str = "I am going to climb mountin to walk 145km and it would take more than 2 hours and 35 minutes";
//        ArrayList<Integer> numbers = NumberExtractor.extractNumbers(str);
//        System.out.println("Numbers in \"" + str + "\": " + numbers);
//
//    }
//}
