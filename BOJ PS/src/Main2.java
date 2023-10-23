import java.util.*;
import java.io.*;

public class Main2 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		int N = in.nextInt();
//		int M = in.nextInt();
//		in.nextLine();
//		
//		String [] sentence = new String[2];
//		HashMap<String,String>find = new HashMap<>();
//		while(N-- > 0) { 
//			String str = in.nextLine();
//			sentence = str.split(" ");
//			find.put(sentence[0], sentence[1]);
//		}
//		while(M-- > 0) {  
//			String k = in.next();
//			if(find.containsKey(k)){ 
//				System.out.println(find.get(k));
//			}
//		}
//		
//	}
	
	//17219 Bufferreader BufferWriter 사용이유 
	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int N = Integer.parseInt(st.nextToken());
//		int M = Integer.parseInt(st.nextToken());
//		
//		HashMap<String,String>find = new HashMap<>();
//		for(int i=0; i<N; i++) { 
//			String str = br.readLine();
//			String [] sentence = str.split(" ");
//			find.put(sentence[0], sentence[1]);
//		}
//		
//		for(int i=0; i<M; i++) {  
//			String k = br.readLine();
//			if(find.containsKey(k)){ 
//				bw.write(find.get(k) + "\n");
//			}
//		}
//		
//		bw.flush();
//		Scanner in = new Scanner(System.in);
//		int N = in.nextInt();
//		in.nextLine();
//		String p = in.nextLine();
//		String [] key = p.split("*");
//		for(String x: key) { 
//			System.out.println(x);
//		}
//		for(int i = 0;i<N;i++) {
//			 String x = in.nextLine();
//			 
//		}
		
		
//		// 7785 해쉬맵, 문자열 정렬 관련 꼭 다뤄볼 코드 
//		Scanner in = new Scanner(System.in);
//		int N = in.nextInt();
//		in.nextLine();
//		
//		HashMap<String,String>mp = new HashMap<>();
//		
//		for(int i = 0;i<N;i++) {
//			String name = in.next();
//			String work = in.next();
//			
//			if(mp.containsKey(name)) {mp.remove(name);}
//			else {mp.put(name, work);}
//		}
//		
//		//HashMap의 모든 key가져와서 ArrayList로 변환함 
//		ArrayList<String> list = new ArrayList<>(mp.keySet());
//		//list의 요소들을 내림차순 정렬(Collections.sort는 디폴트 오름차순 저장임)
//		Collections.sort(list, Collections.reverseOrder());
//		
//		for(int i = 0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
	}
	
	

}

//class Stack<T>{ 
//	int top;
//	char [] stk;
//	public Stack(int len){ 
//		top = -1;
//		stk = new char[len];
//	}
//	public void push(char ch) { 
//		if(top == stk.length-1)
//			return;
//		stk[++top] = ch;
//	}
//	public char pop() { 
//		return stk[top--];
//	}
//	public boolean isEmpty() { 
//		if(top == -1) return true;
//		return false;
//	}
//}