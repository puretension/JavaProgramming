package ArrayListPractice;

//import java.util.*;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;

import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class ArrayList1 {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
//    	String query = "name=kitae&addr=seoul&age=21";
//    	StringTokenizer st = new StringTokenizer(query,"&=");
//    	int n = st.countTokens();
    	
//    	char [] charArray = new char[10];
//    	
//    	for(int i = 0;i<10;i++)
//    	{
//    		 charArray[i] = in.next().charAt(0);
//    	}
//    	String x = new String(charArray);
//    	System.out.print(x);
    	
//    	Date currentDate = new Date();
//    	System.out.println(currentDate);
//    	
//    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 MM일 HH시 mm분 ss초"); //암기 
//    	String formattedDate = sdf.format(currentDate); //암기 
//    	System.out.println(formattedDate); 
//    	Date date1 = new Date(2022,3,1);
//    	Date date2 = new Date(2022,2,1);
//    	
//    	if(date2.before(date1))
//    		System.out.println("date2가 date1보다 이른 날짜입니다");
//    	else 	System.out.println("date2가 date1보다 늦은 날짜입니다");
//    	long currentTime = System.currentTimeMillis();
//    	long future = currentTime + 86400000;
//    	Date futureDate = new Date(future);
//    	System.out.println(futureDate);
//    	
//    	Calendar now = Calendar.getInstance();
//    	int year = now.get(Calendar.YEAR);
//    	int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
//    	int day = now.get(Calendar.DAY_OF_MONTH);
//    	int hour = now.get(Calendar.HOUR_OF_DAY);
//    	int minute = now.get(Calendar.MINUTE);
//    	int second = now.get(Calendar.SECOND);
//    	
//    	System.out.printf("%d년 %d월 %d일 %02d시 %02d분 %02d초\n", year, month, day, hour,minute,second);
//    	
//    	Calendar tomorrow = Calendar.getInstance();
//    	tomorrow.add(Calendar.DAY_OF_MONTH, 1);
//    	year = tomorrow.get(Calendar.YEAR);
//    	month = tomorrow.get(Calendar.MONTH) + 1;
//    	day = tomorrow.get(Calendar.DAY_OF_MONTH);
//    	System.out.printf("내일은 %d년 %d월 %d일입니다\n", year, month, day);
//    	
//    	
//    	System.out.println("obj1.compareTo(obj2): " + now.compareTo(tomorrow));
    	
//    	Random rand1 = new Random();
//    	int num1 = rand1.nextInt(10);
//    	System.out.println(num1);
//    	
//    	Random rand2 = new Random();
//    	int num2 = rand2.nextInt(6) + 1;
//    	System.out.println(num2);
//    	
//    	Random rand3 = new Random();
//    	StringBuilder sb = new StringBuilder();
//    	
//    	for(int i = 0;i<5;i++)
//    	{
////    		 char number = (char)(rand3.nextInt(26) + 97);
////    		 sb.append(number);
//    		char number = (char)(int)(Math.random() * 26 + 97);
//    		sb.append(number);
//    	}
//    	
//    	System.out.print(sb.toString());
    	
//    	//java.text 
//    	
//    	Date now = new Date();
//       	System.out.println("현재 날짜: " + now);
//    	DateFormat df = DateFormat.getDateTimeInstance();
//       	
//    	String dateToStr = DateFormat.getInstance().format(now);
//    	System.out.println("DateFormat.getInstance(): " + dateToStr);
//    	
//    	dateToStr = DateFormat.getDateInstance().format(now);
//    	System.out.println("DateFormat.getDateInstance(): " + dateToStr);
//    	
//    	dateToStr = DateFormat.getTimeInstance().format(now);
//    	System.out.println("DateFormat.getTimeInstance(): " + dateToStr);
//    	
//    	dateToStr = DateFormat.getDateTimeInstance().format(now);
//    	System.out.println("DateFormat.getDateTimeInstance(): "+ dateToStr);
//    	
//    	dateToStr = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(now);
//    	System.out.println("DateFormat.getTimeInstance(DateFormat.MEDIUM): " + dateToStr);
//    	
//    	//getDateTimeInstance의 2가지 표현
//    	dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(now);
//    	System.out.println("DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT): " + dateToStr);
//    	
//    	dateToStr = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG).format(now);
//    	System.out.println("DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG): " + dateToStr);
//    	
//    	System.out.println("DateFormat.getDateTimeInstance(): " + dateToStr);
//    	
//    	
//    	//문자열을 날짜와 시간으로 파싱하기
//    	String strDate = "2022-04-10 10:30:00";
//    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//    	
//    	String strDate2 = "20:10:00 2022-04-16";
//    	SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss yyyy-MM-dd");
//    	try  {
//    		System.out.println(sdf2.parse(strDate2));
//    	} catch(ParseException e) { 
//    		e.printStackTrace();
//    	}
//    	try { 
//    		Date date = sdf.parse(strDate);
//    		System.out.println(date);
//    	} catch(ParseException e) { 
//    		e.printStackTrace();
//    	}
    }
} 