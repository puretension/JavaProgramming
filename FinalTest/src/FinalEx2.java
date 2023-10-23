import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FinalEx2 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 9, 5, 4, 6};
        int[] arr2 = {3, 4, 5, 6, 4, 3, 6, 7, 6}; //2  2 

        findCommonElements(arr1, arr2);
    }


    public static void findCommonElements(int[] arr1, int[] arr2) {
        // TODO: 구현
    	HashMap<Integer,Integer>mp = new HashMap<Integer,Integer>();
    	for(int i = 0;i<arr1.length;i++) {
    		mp.put(arr1[i], mp.getOrDefault(arr1[i], 0)+ 1);
    	}
    	
    	HashMap<Integer,Integer>mp2 = new HashMap<Integer,Integer>();
    	for(int i = 0;i<arr2.length;i++) {
    		mp2.put(arr2[i], mp2.getOrDefault(arr2[i], 0)+ 1);
    	}
    	
    	for(int i = 1;i<=9;i++) {
    		if(mp.containsKey(i) && mp2.containsKey(i)) {
    			int ans = mp.get(i) + mp2.get(i);
    			System.out.println("Element: " + i + ", " + "Count: " + ans);
    		}
    	}
    	
    }
}