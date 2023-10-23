//import java.util.ArrayList;
//import java.util.StringTokenizer;
//
//public class DupWordCheck {
//    public static void main(String[] args) {
//        String sentence = "The quick brown fox jumps over the lazy Brown dog";
//        String x = sentence.toUpperCase();
//        StringBuffer sb = new StringBuffer(x);
//        
//        //todo: 구현하시오 (implement this)
//        String [] strArray = x.split(" ");
//        int len = strArray.length;
//        String k = " is duplicated";
//        int [] a = new int[2];
//        int idx = 0;
//        for(int i = 0;i<len;i++) {
//        	for(int j = i+1;j<len;j++)
//        	{ 
//        		if(strArray[i].equals(strArray[j]))
//        			a[idx++] = j;
//        	}
//        }
//        String [] strArray2 = sentence.split(" ");
//        for(int i = 0;i<2;i++)
//        	System.out.println(strArray2[a[i]]+ " is duplicated");
//    }
//}