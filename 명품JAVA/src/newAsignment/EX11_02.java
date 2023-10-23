//package newAsignment;
//
//public class EX11_02 {
//
//	public static void main(String [] args) { 
////		int iterations = 100000000;
////		
////		long start, end;
////		StringBuilder sb = new StringBuilder();
////		
////		start = System.nanoTime();
////		
////		for(int i = 0;i<iterations;i++)
////			sb.append('a');
////		sb.toString();
////		sb.setLength(0);
////		
////		end = System.nanoTime();
////		System.out.printf("StringBuilder: %d ns\n", end - start);
////		
////		//StringBuffer속도 측정
////		StringBuffer sbf = new StringBuffer();
////		start = System.nanoTime();
////		
////		for(int i = 0;i<iterations;i++)
////			sbf.append('a');
////		sbf.toString();
////		sbf.setLength(0);
////		
////		end = System.nanoTime();
////		System.out.printf("StringBuffer: %d ns\n", end - start);
//		
//		StringBuilder sb = new StringBuilder();
//		sb.append("Hello");
//		sb.append(" ");
//		sb.append("World");
//		String str1 = sb.toString();
//		
//		sb.setLength(0); //sb초기화
//		
//		sb.append("Java");
//		sb.append(" ");
//		sb.append("Programming");
//		String str2 = sb.toString();
//		////Java Programming
//		sb.setLength(0);
//		sb.delete(5, 8); //Pro 3개 삭제
//		String str3 = sb.toString();
//		sb.insert(5, "is ");
//		String str4 = sb.toString();
//		
//		sb.replace(8, sb.length(), "fun!");
//		String str5 = sb.toString();
//		
//		System.out.println("str1 = "+ str1);
//		
//		
//		
//	}
//}
