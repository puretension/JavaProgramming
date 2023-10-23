package Boj;
import java.util.*;



public class baekjoon1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
//		Scanner in = new Scanner(System.in);
//		int N,M;
//		N = in.nextInt();
//		M = in.nextInt();
//		in.nextLine();
//		int cnt = 0;
//		
//		HashMap<String, Integer>check = new HashMap<>();
//		
//		for(int i = 0;i<N;i++)
//		{ 
//			String str = in.nextLine();
//			check.put(str, 1);
//		}
//		for(int i = 0;i<M;i++)
//		{ 
//			String str = in.nextLine();
//			if(check.containsKey(str))
//				cnt++;
//		}
//		System.out.print(cnt);
		
//		Scanner in = new Scanner(System.in);
//		HashMap<Character, Integer> check = new HashMap<>();
//		for(int i = 0;i<26;i++)
//			check.put((char)('a' + i), -1);
//		String str = in.next();
//		
//		char [] charArr = str.toCharArray();
//		for (int i = 0; i < charArr.length; i++) {
//            char ch = charArr[i];
//            if (check.containsKey(ch)) {
//                if (check.get(ch) == -1) {
//                    check.replace(ch, i);
//                }
//            }
//        }
//
//        for (char ch = 'a'; ch <= 'z'; ch++) {
//            System.out.print(check.get(ch) + " ");
//        }
		
		
		//1269
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		int m = in.nextInt();
//		HashMap<Integer, Integer> A = new HashMap<>();
//		HashMap<Integer, Integer> B = new HashMap<>();
//		
//		int [] a = new int[n];
//		int [] b = new int [m];
//		
//		for(int i = 0;i<n;i++)
//		{ 
//			a[i] = in.nextInt();
//			A.put(a[i], 1);
//		}
//		
//		for(int i = 0;i<m;i++)
//		{ 
//			b[i] = in.nextInt();
//			B.put(b[i], 1);
//		}
//		
//		int cnt = n + m;
//		
//		for(int i = 0;i<m;i++)
//		{ 
//			if(A.containsKey(b[i]))
//				cnt--;
//		}
//		for(int i = 0;i<n;i++)
//		{ 
//			if(B.containsKey(a[i]))
//				cnt--;
//		}
//		
//		System.out.print(cnt);
		
		
		Scanner in = new Scanner(System.in);
		int M = in.nextInt();
		HashMap<Integer, Integer>set = new HashMap<>();
		
//		for(int i = 0;i<M;i++)
//		{ 
//		String a = in.next();
//		switch(a)
//		{ 
//		case "add": int number = in.nextInt();
//					if(set.containsKey(number)) break;
//					else 
//					set.put(number, 1);
//					break;
//		case "check": number = in.nextInt();
//					if(set.containsKey(number))
//						System.out.println(set.get(number));
//					else System.out.println(0);
//					break;
//		case "remove": number = in.nextInt();
//					   if(set.containsKey(number))
//					   { 
//						   set.remove(number);
//					   }
//					   break;
//		case "toggle":	number = in.nextInt();
//					  if(set.containsKey(number))
//					  { 
//						  set.remove(number);
//					  }
//					  else 
//						  set.put(number,1);
//					  break;
//		case "all": set.clear();
//					for(int x = 0;x<20;x++)
//					set.put(x+1,1);
//					break;
//		case "empty":
//				set.clear();
//				break;
//		}
//		}
//		int bitset = 0;
//		bitset |= 1<<3; //00001000
		
		
	}
	
}
