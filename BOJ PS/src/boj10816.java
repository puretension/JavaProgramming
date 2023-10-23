//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
//import java.util.*;
//
//public class boj10816 {
//
//	public static void main(String[] args) throws IOException {
//    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    	int a, b;
//    	a = Integer.parseInt(br.readLine());
//    	HashMap<Integer,Integer>M = new HashMap<Integer,Integer>();
//    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//    	for(int i = 0;i<a;i++) { 
//    		int num = Integer.parseInt(st.nextToken());
//    		M.put(num, M.getOrDefault(num, 0) + 1);
//    	}
//    	
//    	b = Integer.parseInt(br.readLine());
//		StringBuilder sb = new StringBuilder();
//		st = new StringTokenizer(br.readLine(), " ");
//    	for(int i = 0;i<b;i++) { 
//    		int num = Integer.parseInt(st.nextToken());
//    		sb.append(M.getOrDefault(num, 0)).append(" ");
//    	}
//    	System.out.println(sb);
//	}
//
//}
