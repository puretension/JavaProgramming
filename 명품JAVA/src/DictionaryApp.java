//
//
//abstract class PairMap{ 
//	protected String [] keyArray; //key 저장 배열 
//	protected String [] valueArray; //array 저장 배열 
//	
//	abstract String get(String key); //key값을 가진 value 리턴, 없으면 null 리턴
//	abstract void put(String key, String value); // key - value로 저장하되, 기존 key가 있다면 값을 value로 수정함 
//	abstract String delete(String key); //key값 가진 아이템을 value와 함께 삭제. 삭제된 value 리턴
//	abstract int length(); //현재 저장된 아이템 개수 리턴함 
//}
//
//class Dictionary extends PairMap{ 
////	int capacity;
//	int size;
//	int index = 0;
////	Dictionary(int capacity){ 
////		this.capacity = capacity;
////		this.size = 0;
////		this.index = 0;
////		this.keyArray = new String[capacity];
////		this.valueArray = new String[capacity];
////	} 
//	public Dictionary(int size) {
//		keyArray = new String [size];
//		valueArray = new String [size];
//	}
//	
////	void put(String key, String value) { 
////		for(int i = 0;i< size;i++)
////		{ 
////			if(keyArray[i] == key)
////				{ 
////				keyArray[i] = value; 
////				return;
////				}
////		}
////		keyArray[index] = key;
////		valueArray[index] = value;	
////		index++;
////		size++;
////	}
//	
//	public void put(String key, String value) {
//		// 이미 있는 key라면
//		for(int i=0; i<index; i++) {
//			if(key.equals(keyArray[i])) {
//				valueArray[i] = value;
//				return;
//			}
//		}
//		
//		// 새로운 key라면
//		keyArray[index] = key;
//		valueArray[index] = value;
//		index++;
//	}
//	
//	public String get(String key) {
//		for(int i=0; i<index; i++) {
//			if(key.equals(keyArray[i]))
//				return valueArray[i];
//		}
//		
//		return null;
//	}
//	
////	String delete(String key) { 
////		String delValue = null;
////		for(int i = 0;i< size;i++)
////		{ 
////			if(keyArray[i] == key)
////				{ 
////				delValue = keyArray[i]; 
////				keyArray[i] = null;
////				valueArray[i] = null;
////				size--;
////				return delValue;
////				}
////		}
////		return delValue;
////	}
//	public String delete(String key) {
//		for(int i=0; i<index; i++) {
//			if(key.equals(keyArray[i])) {
//				valueArray[i] = "null";
//				return "null";
//			}
//		}
//		
//		// 배열에 없는 key라면
//		return "동일한 key가 없습니다.";
//	}
//
////	int length() { 
////		return size;
////	}
//
//	public int length() {
//		return index;
//	}
//	
//}
//
//public class DictionaryApp {
//	public static void main(String [] args) {
//		Dictionary dic = new Dictionary(10);
//		dic.put("황기태", "자바");
//		dic.put("이재문", "파이썬");
//		dic.put("이재문", "C++");
//		System.out.println("이재문의 값은 " + dic.get("이재문"));
//		System.out.println("황기태의 값은 " + dic.get("황기태"));
//		dic.delete("황기태");
//		System.out.println("황기태의 값은 " + dic.get("황기태"));
//	}
//}
