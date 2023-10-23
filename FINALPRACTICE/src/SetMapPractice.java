//import java.io.*;
//import java.util.*;
//
//public class SetMapPractice {
//
//	public static void main(String[] args){
//		// TODO Auto-generated method stub
////		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
////		String x = bf.readLine();
////		int n = Integer.parseInt(bf.readLine()); //정수입력받을때만
////		
////		StringBuffer sb = new StringBuffer();
//		
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		in.nextLine();
//		
//		TreeMap<String,String>mp = new TreeMap<String,String>();
//		
////		while(n-- > 0) {
////			String name, record;
////			String a = in.nextLine();
////			String [] str = a.split(" "); //개선점 1
////			name = str[0];
////			record = str[1];
////			if(record.equals("leave")) {
////				mp.remove(name);
////				continue;
////			}
////			mp.put(name, record);
////		}
//		
//		while(n-- > 0) {
//			String name = in.next(); 
//			String record = in.next();
//			if(mp.containsKey(name)) mp.remove(name);
//			else mp.put(name, record);
//		}
//		
//		ArrayList<String>nameList = new ArrayList<String>(mp.keySet());
//		
////		Comparator<String>reverseName = Collections.reverseOrder(); //객체자체를 리버스 할수도 잇다 
//		Collections.sort(nameList,Collections.reverseOrder());
//		
//		for(String x: nameList) {
//			System.out.println(x);
////			StringBuffer sb = new StringBuffer(x);
////			String reversePrintName = sb.reverse().toString();
////			System.out.println(reversePrintName);
//		}
//		
//	}
//
//}


