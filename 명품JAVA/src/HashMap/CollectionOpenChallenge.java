//package HashMap;
//import java.util.*;
//import java.lang.Math;
//
//class Word{ 
//	private String eng;
//	private String kor;
//	Word(String eng, String kor) { 
//		this.eng = eng;
//		this.kor = kor;
//	}
//	
//	public String eng() { 
//		return eng;
//	}
//}
//
//public class CollectionOpenChallenge {
//
//	void make(int [] ex, int answerIdx, int size, int answer) { 
//		int [] n = {-1,-1,-1,-1};
//		int j;
//		for(int i = 0;i<4;i++)
//		{ 
//			do { 
//				j = (int)Math.random()*size;
//			}while(j == answerIdx || exists(n,j));
//			n[i] = j;
//		}
//		n[answer -1] = answerIdx;
//		for(int i = 0;i<4;i++)
//			ex[i] = n[i];
//	}
//	
//	boolean exists(int n [], int j) { 
//		for(int i = 0 ;i<n.length;i++)
//			if (n[i] == j) return true;
//		return false;
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner in =new Scanner(System.in);
//		Vector<Word> v = new Vector<Word>();
//		v.add(new Word("constructor", "생성자"));
//		v.add(new Word("overriding", "재정의"));
//		v.add(new Word("extends", "상속"));
//		v.add(new Word("array", "배열"));
//		v.add(new Word("string", "문자열"));
//		v.add(new Word("character", "문자"));
//		v.add(new Word("integer", "정수"));
//		v.add(new Word("double", "실수"));
//		v.add(new Word("abstract", "추상"));
//		v.add(new Word("implements", "구현하다"));
//		
//		System.out.print("현재 10개의 단어가 들어 있습니다.");
//		
//		
//		
//	}
//
//}
