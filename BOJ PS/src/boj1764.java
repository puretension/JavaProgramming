//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class boj1764 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a, b;
//    	Scanner in = new Scanner(System.in);
//    	a = in.nextInt();
//    	b = in.nextInt();
//    	in.nextLine();
//    	int count = 0;
//    	HashMap<String, Integer>track = new HashMap<String, Integer>();
//    	HashMap<Integer,String>sung = new HashMap<Integer,String>();
//    	for(int i = 0;i<a;i++)
//    	{ 
//    		String name = in.nextLine().trim();
//    		track.put(name, 1);
//    	}
//    	
//    	for(int i = 0;i<b;i++)
//    	{ 
//    		String name2 = in.nextLine().trim();
//    		if(track.containsKey(name2))
//    		{ 
//    			sung.put(count,name2);
//    			count++;
//    		}
//    	}
//    	
////    	String temp = "";
////    	for(int i = 0;i<sung.size();i++)
////    	{ 
////    		for(int j = i + 1;j<sung.size()-1;j++)
////    		{
////    			if(sung.get(i).charAt(0) > sung.get(j).charAt(0)) { 
////    				temp = sung.get(i);
//////    				sung.get(i).replaceAll(sung.get(i), sung.get(j));
//////    				sung.get(j).replaceAll(sung.get(j),temp);
////    				 sung.put(i, sung.get(j));
////    		         sung.put(j, temp);
////    			}
////    		}
////    	}
////    	System.out.println(count);
////    	for(int i = 0;i<count;i++) { 
////    		System.out.println(sung.get(i));
////    	}
//    	
//    	ArrayList<String>arr = new ArrayList<String>(sung.values());
//    	Collections.sort(arr);
//    	
//    	System.out.println(count);
//    	for(int i = 0;i<count;i++) { 
//    		System.out.println(arr.get(i));
//    	}
//    	
//    in.close();
//	}
//
//}
