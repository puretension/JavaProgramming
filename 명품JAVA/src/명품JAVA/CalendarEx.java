//package 명품JAVA;
//
//public class CalendarEx {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.print(2);
//	}
//
//}

package 명품JAVA;
import java.util.Calendar;
import java.util.*;


class CodeBlocks {
	static String count = "";
	String count2 = "";
	public CodeBlocks() { 
		count += "B";
		count2 += "B";
	}
	//non-static 메서드에서 static메서드에 대한 접근이 가능한가? 
	public void append() { 
		count += "D";
		count2 += "D";
	}
}

public class CalendarEx {
	
	public static void printCalendar(String present, Calendar cal) { 
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int hour = cal.get(Calendar.HOUR);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int ampm = cal.get(Calendar.AM_PM);
		int minute = Calendar.getInstance().get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);
		System.out.print(present + year + "/" + month + "/" + day+ "/");
	}

	public static void main(String[] args) {
//		System.out.println(CodeBlocks.count);
//		CodeBlocks a = new CodeBlocks();
//		System.out.println(a.count);
//		System.out.println(a.count2);
//		a.append();
//		System.out.println(a.count);
//		System.out.println(a.count2);
////		Calendar now = Calendar.getInstance();
////		printCalendar("현재: ", now);
//		Scanner in = new Scanner(System.in);
//		String str = in.nextLine();
//		str = str.toUpperCase().trim().replace("[^A-Z]", "");
////		StringBuffer sb = new StringBuffer();
////		String temp = sb.append(str).reverse().toString();
//		String temp = new StringBuffer(str).reverse().toString();
//		if(str.equals(temp)) System.out.println("SAme");
//		else System.out.println("no");
		
//		int N = 4;
//		for(int i = 0;i<N;i++)
//		{
//			for(int j = 0;j<i;j++)
//			{ 
//				System.out.print(" ");
//			}
//			for(int k = N;k>i;k--)
//				System.out.print("*");
//			System.out.println();
//		}
		
//		for(int i = 1;i<=N;i++)
//		{ 
//			for(int j = N-i; j>0;j--)
//				System.out.print(" ");
//			for(int k = 1;k<= i*2-1;k++)
//				System.out.print("*");
//			System.out.println();
//		}
		
//		for(int i = 1;i<=4;i++)
//		{ 
//			for(int j = 5-i;j>0;j--) System.out.print(" ");
//			for(int k = 1;k<=i*2-1;k++) System.out.print("*");
//			System.out.println();
//		}
		
//		int x = 8;
//		
//		   // 상단 
//        for(int i=1; i<=5; i++) {   
//            for (int j=1; j<=5-i; j++) {
//                System.out.print(" "); //공백
//            }
//            for (int j=1; j<=i*2-1; j++) { //나머지 별 한방에채우기.
//                System.out.print("*"); 
//            }
//            System.out.println();
//        }
//        //하단.
//        for(int i=4; i>0; i--) {    //하단 
//            for (int j=4; j>=i; j--) {
//                System.out.print(" "); //공백
//            }
//            for (int j=1; j<=i*2-1; j++) {
//                System.out.print("*"); 
//            }
//            
//            System.out.println();
//        }
	}

}
