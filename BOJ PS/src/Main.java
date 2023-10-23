
//1920

import java.util.*;

public class Main {
    public static void main(String[] args) {
    	
    	
    	
    	
//    	//1920 
//        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        HashMap<Integer, Integer> A = new HashMap<>(N);
//        for (int i = 0; i < N; i++) {
//            int number = in.nextInt();
//            A.put(number, 1);
//        }
//        int M = in.nextInt();
//        for (int i = 0; i < M; i++) {
//            int number = in.nextInt();
//            if (A.containsKey(number))
//                System.out.println(1);
//            else
//                System.out.println(0);
//        }
//        
//        //10817
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        int min = a;
//        if (min > b)
//            min = b;
//        if (min > c)
//            min = c;
//
//        if (min == a)
//            System.out.println((b <= c) ? b : c);
//        else if (min == b)
//            System.out.println((a <= c) ? a : c);
//        else
//            System.out.println((a <= b) ? a : b);
    	
    	
//    	//2738
//    	Scanner in = new Scanner(System.in);
//    	int N = in.nextInt();
//		int M = in.nextInt();
//		
//		int [][] arr1 = new int[N][M];
//		int [][] arr2 = new int[N][M];
//		int [][] sumArr = new int[N][M];
//		
//		for(int i = 0;i<N;i++)
//		{ 
//			for(int j = 0;j<M;j++)
//			{ 
//				arr1[i][j] = in.nextInt();
//			}
//		}
//		for(int i = 0;i<N;i++)
//		{ 
//			for(int j = 0;j<M;j++)
//			{ 
//				arr2[i][j] = in.nextInt();
//			}
//		}
//		
//		for(int i = 0;i<N;i++)
//		{ 
//			for(int j = 0;j<M;j++)
//			{ 
//				sumArr[i][j] = arr1[i][j] + arr2[i][j];
//			}
//		}
//		
//		for(int i = 0;i<N;i++)
//		{ 
//			for(int j = 0;j<M;j++)
//			{ 
//				System.out.print(sumArr[i][j] + " ");
//			}
//			System.out.println();
//		}
    
    	
//    //1032 좋앗던 풀이
//    Scanner in = new Scanner(System.in);
//    int N = in.nextInt();
//    String [] str = new String[N];
//    
//    int len = 0;
//    
//    for(int i = 0;i<N;i++)
//    {
//    	str[i] = in.next();
//    }
//    
//	len = str[0].length();
//	
//    StringBuilder sb = new StringBuilder(str[0]);
//	int k = 0;
//	
//	String x = sb.toString();
//	for(int i = 0;i<len;i++)
//	{ 
//		for(int j = 1;j<N;j++)
//		{
//			if(x.charAt(i) != str[j].charAt(i))
//				{ 
//				sb.setCharAt(i, '?');
//				break;
//				}
//		}
//	}
//	
//	System.out.print(sb.toString());
    	
    	
//    //9093	
//    Scanner in = new Scanner(System.in);
//    int N = in.nextInt();
////    String [] words = new String[20];
//    in.nextLine(); //nextLine전에 스캐너입력받앗다면 비워주기(엔터남아잇음)
//    for(int i = 0;i<N;i++)
//    { 
//    	String str = in.nextLine(); //1. 문장을 입력 받는다 
//    	StringBuffer sb = new StringBuffer();
//    	String [] strArray = str.split(" "); //split으로 각 word로 분해하여 String 배열의 원소값으로 집어넣는다 
//    	for(int j = 0;j<strArray.length;j++) //워드의 개수만큼 
//    	{ 
//    		int len = strArray[j].length(); //각 워드의 길이 
//    		for(int k = len -1;k>=0;k--) //역순으로 버퍼에 저장시킨다
//    		{ 
//    			sb.append(strArray[j].charAt(k));
//    		}
//    		sb.append(" ");
//    	}
//    	System.out.println(sb);
//    }
    
    	
//    Scanner in = new Scanner(System.in);
//    StringBuilder sb = new StringBuilder();
//    
//    String x = in.nextLine();
//    int xLen = x.length();
//    boolean flag = false;
//	Stack<Character>charStack = new Stack<Character>(xLen);
//	
//	for(int i = 0;i<xLen;i++)
//	{ 
//		if(x.charAt(i) == '<') {
//			 while(!charStack.isEmpty())
//				sb.append(charStack.pop());
//					flag = true;
//		}
//		else if(x.charAt(i) == '>')
//		{
//			 flag = false;
//			 sb.append(x.charAt(i));
//			 continue;
//		}
//		if(flag == true) 
//			sb.append(x.charAt(i));
//		else if(flag == false)
//		{ 
//			if(x.charAt(i) == ' ') { 
//				 while(!charStack.isEmpty())
//						sb.append(charStack.pop());
//			}
//			sb.append(' ');
//			continue;
//		}
//		else { 
//			charStack.push(x.charAt(i));
//		}
//	}
    	
//    	//11721
//    	Scanner in = new Scanner(System.in);
//    	String str = in.next();
//    	 for (int i = 0; i < str.length(); i++) {
//             System.out.print(str.charAt(i));
//             if (i % 10 == 9) {
//             	System.out.println();
//             }
//    	 }
    	
    	
    	
//    	//17413
//    Scanner in = new Scanner(System.in);
//    String str = in.nextLine();
//    int strLen = str.length();
//    Stack<Character>charStack = new Stack<Character>(strLen);
//    boolean flag = false;
//    StringBuffer sb = new StringBuffer();
//    for(int i = 0;i<strLen;i++)
//    { 
//    	if(str.charAt(i) == '<')
//    	{ 
//    		flag = true;
//    		while(!charStack.isEmpty())
//    		{ 	
//    			sb.append(charStack.pop());
//    		}
//    		sb.append(str.charAt(i));
//    	}
//    	else if(flag == true && str.charAt(i)!= '<' && str.charAt(i) != '>')
//    	{ 
//    		sb.append(str.charAt(i));
//    	}
//    	else if(str.charAt(i) == '>')
//    	{ 
//    		flag = false;
//    		sb.append(str.charAt(i));
//    		continue;
//    	}
//    	else if(flag == false && str.charAt(i) == ' ') {
//    		while(!charStack.isEmpty())
//    		{ 
//    			sb.append(charStack.pop());
//    		}
//    		sb.append(str.charAt(i));
//    	}
//    	else charStack.push(str.charAt(i));
//    }
//    while(!charStack.isEmpty())
//	{ 
//		sb.append(charStack.pop());
//	}
    	
//    	Scanner in = new Scanner(System.in);
//    	String str = in.nextLine();
//    	int strlen = str.length();
//    	Stack<Character>strStack = new Stack<>(strlen);
    	
    	//1213, 1254 같은문제 
//    	Scanner in = new Scanner(System.in);
//    	String x = in.next();
//    	
//    	checkPalindrome(x);
//    	    }
//    	
//    	    private static void checkPalindrome(String s) {
//    	        //todo: 구현하시오 (implement this)
//    	    	String x = s.toUpperCase().replace("[^A-Z]", "");
//    	    	String temp = new StringBuffer(x).reverse().toString();
//    			if(x.equals(temp)) System.out.println(s + " is Palindrome");
//    			else System.out.println(s + "is not palindrome");
//    	    }
    	
//    	int a, b;
//    	Scanner in = new Scanner(System.in);
//    	a = in.nextInt();
//    	b = in.nextInt();
//    	int count = 0;
//    	HashMap<String, Integer>track = new HashMap<String, Integer>();
//    	HashMap<Integer,String>sung = new HashMap<Integer,String>();
//    	for(int i = 0;i<a;i++)
//    	{ 
//    		String name = in.next().trim();
//    		track.put(name, 1);
//    	}
//    	for(int i = 0;i<b;i++)
//    	{ 
//    		String name2 = in.next().trim();
//    		if(track.get(name2) == 1)
//    		{ 
//    			sung.put(count,name2);
//    			count++;
//    		}
//    	}
//    	String temp = "";
//    	for(int i = 0;i<sung.size();i++)
//    	{ 
//    		for(int j = i + 1;j<sung.size()-1;j++)
//    		{
//    			if(sung.get(i).charAt(0) > sung.get(j).charAt(0)) { 
//    				temp = sung.get(i);
////    				sung.get(i).replaceAll(sung.get(i), sung.get(j));
////    				sung.get(j).replaceAll(sung.get(j),temp);
//    				 sung.put(i, sung.get(j));
//    		         sung.put(j, temp);
//    			}
//    		}
//    	}
//    	System.out.println(count);
//    	for(int i = 0;i<sung.size();i++) { 
//    		System.out.println(sung.get(i));
//    	}
//    	
//    in.close();
    	
//    	//1620 이다솜 포켓몬
//    	Scanner in = new Scanner(System.in);
//    	int N = in.nextInt();
//    	int M = in.nextInt();
//    	in.nextLine();
//    	HashMap<String,Integer>pkm = new HashMap<String,Integer>();
//    	HashMap<Integer,String>pkm2 = new HashMap<Integer,String>();
//    	for(int i = 1;i <= N;i++)
//    	{
//    		String pkmName = in.nextLine().trim();
//    		pkm.put(pkmName, i);
//    		pkm2.put(i, pkmName);
//    	}
//    	
//    	for(int i = 1;i <= M;i++)
//    	{ 
//    		String x = in.nextLine().trim();
//    		if(Character.isDigit(x.charAt(0))){ 
//    			int numIdx = Integer.parseInt(x);
//    			System.out.println(pkm2.get(numIdx));
//    			continue;
//    		}
//    		System.out.println(pkm.get(x));
//    	}
    	
    	
//    	//9375(HashMap, Iterator)
//    	Scanner in = new Scanner(System.in);
//    	int N = in.nextInt();
//    	for(int i = 0;i<N;i++) {
//        	String [] strArray;
//        	HashMap<String, Integer> fashion = new HashMap<String,Integer>();
//    		int M = in.nextInt();
//    		in.nextLine();
//    		for(int j = 0;j<M;j++) { 
//    			String pair = in.nextLine();
//    			strArray = pair.split(" ");
//    			//키값 자체를 늘려주는게 핵심알고리즘
//    			if(fashion.containsKey(strArray[1])) fashion.put(strArray[1], fashion.get(strArray[1]) + 1);
//    			else fashion.put(strArray[1], 1);
//    		}
//    		int answer = 1;
//    		//별도의 Iterator생성없이 이 for문으로도 가능(숙지)
////    		for (int val : hm.values()) {
////				answer *= (val + 1);
////			}
//	
//    		Iterator<Integer>it = fashion.values().iterator();
//    		for(int k = 0;k<fashion.size();k++) { 
//    			answer *= it.next() + 1;
//    		}
//    		System.out.println(answer -1);
//    	}
    	
    	
//    	//11652(조건 엣지 체크) 근데 코드가 좀 더럽다..
//    	Scanner in =new Scanner(System.in);
//    	HashMap<Long, Integer> cards = new HashMap<Long,Integer>();
//    	int N = in.nextInt();
//    	int maxCount = 0;
//    	long maxKey = 0;
//    	while(N-- > 0) { 
//    		Long x = in.nextLong();
//    		if(cards.containsKey(x)) {
//    			cards.put(x, cards.get(x) + 1);
//    			//개수가 동일한 경우
//    			if(maxCount == cards.get(x))
//    			{ 
//    				if(maxKey <= x) continue;
//    				else { 
//    					maxKey = x;
//    					maxCount = cards.get(x);
//    				}
//    			}
//    			//개수가 달라 변경해줘야하는 경우
//    			else if(maxCount < cards.get(x)) //개수가 더많다면 maxCount는 변경
//    				{
//    				maxCount = cards.get(x);
//    				maxKey = x;
//    				}
//    		}
//    		else {
//    			cards.put(x, 1);
//    			if(cards.get(x) == maxCount)
//    			{ 
//    				//개수가 동일한 경우
//    				if(maxKey <= x) continue;
//    				else { 
//    					maxKey = x;
//    					maxCount = cards.get(x);
//    				}
//    			}
//    			else if(maxCount < cards.get(x))  {
//    				maxCount = cards.get(x);
//    				maxKey = x;
//    			}
//    		}
//    	}
//    	System.out.println(maxKey);
   
    	//펠린드롬 수 브론즈2
//    	Scanner in = new Scanner(System.in);
//    	String str = in.nextLine();
//    	checkPalindrome(str);
//    	Scanner in = new Scanner(System.in);
//    	int T,M,N;
//    	T = in.nextInt();
//    	while(T-- > 0) {
//    	N = in.nextInt();
//    	HashMap<Integer,Integer>bool = new HashMap<>();
//    	while(N-- > 0) { 
//    		int number = in.nextInt();
//    		bool.put(number, 1);
//    	}
//    	M = in.nextInt();
//    	while(M-- > 0) { 
//    		int number = in.nextInt();
//    		if(bool.containsKey(number)) System.out.println(1);
//    		else System.out.println(0);
//    	}
//    	}
    	
    }
    
//    private static void checkPalindrome(String s) {
//        //todo: 구현하시오 (implement this)
//    	String x = s.toUpperCase().trim().replace("[^A-Z]", "");
//    	String temp = new StringBuffer(x).reverse().toString();
//  		if(x.equals(temp)) System.out.println(1);
//  		else System.out.println(0);
//    }
}

class PocketMon{ 
	String name;
	int number;
	PocketMon(String name, int number){ 
		this.name = name;
		this.number = number;
	}
}


class Stack<T>{ 
	int top;
	char [] stk;
	public Stack(int len){ 
		top = -1;
		stk = new char[len];
	}
	public void push(char ch) { 
		if(top == stk.length-1)
			return;
		stk[++top] = ch;
	}
	public char pop() { 
		return stk[top--];
	}
	public boolean isEmpty() { 
		if(top == -1) return true;
		return false;
	}
}




