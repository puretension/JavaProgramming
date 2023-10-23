//package ErrorPractice;
//import java.util.*;
//
//public class EvenJumpToJava {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		 int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};
//		    // 짝수만 포함하는 ArrayList 생성
//	        ArrayList<Integer> dataList = new ArrayList<>();
//	        for(int i=0; i<data.length; i++) {
//	            if(data[i] % 2 == 0) {
//	                dataList.add(data[i]);
//	            }
//	        }
//	        HashSet<Integer>dataSet = new HashSet<>(dataList);
//	        ArrayList<Integer>distinctList = new ArrayList<>(dataSet);
//	        Comparator<Integer>comp = (a,b) -> Integer.compare(a, b);
//	        distinctList.sort(comp);
//	        int [] result = new int[distinctList.size()];
//	        for(int i = 0;i<result.length;i++) {
//	        	result[i] = distinctList.get(i);
//	        }
//	        for(int num:result) {
//	        	System.out.println(num);
//	        }
//	        
//	}
//
//}
