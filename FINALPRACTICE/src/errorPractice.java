import java.util.*;
//class errorPractice {
//	static void method(boolean b) {
//		try {
//			System.out.println(1);
//			if (b)
//				throw new ArithmeticException();
//			System.out.println(2);
//		} catch (RuntimeException r) {
//			System.out.println(3);
//			return;
//		} catch (Exception e) {
//			System.out.println(4);
//			return;
//		} finally {
//			System.out.println(5); //finally블록은 return이 위에잇더라도 무조건실행
//		}
//		System.out.println(6);
//	}
//
//	public static void main(String[] args) {
//		method(true);
//		method(false);
//	} // main
//}


//public class errorPractice {
//	public static void main(String[] args) {
//		// 1~100 사이의 임의의 값을 얻어서 answer에 저장한다.
//		int answer = (int) (Math.random() * 100) + 1;
//		int input = 0; // 사용자입력을 저장할 공간
//		int count = 0; // 시도횟수를 세기 위한 변수
//		System.out.println("answer: " + answer);
//		do {
//			count++;
//			System.out.print("1과 100사이의 값을 입력하세요 :");
//
//			try {
//			input = new Scanner(System.in).nextInt();
//			}catch(InputMismatchException e) {
//				System.out.println("유효하지 않은 값입니다. 다시 값을 입력해 주세요.");
//				continue;
//			}
//			if (answer > input) {
//				System.out.println("더 큰 수를 입력하세요 .");
//			} else if (answer < input) {
//				System.out.println("더 작은 수를 입력하세요 .");
//			} else {
//				System.out.println("맞췄습니다 .");
//				System.out.println("시도횟수는 " + count + "번입니다 .");
//				break; // do-while문을 벗어난다
//			}
//		} while (true); 
//	} 
//} 


//class UnsupportedFunctionException extends RuntimeException{
//	private int ERR_CODE = 100;
//	UnsupportedFunctionException(String msg, int errCode){
//		super(msg);
//		ERR_CODE = errCode;
//	}
//	UnsupportedFunctionException(String msg){
//		this(msg,100);
//	}
//	public int getErrCode() {return ERR_CODE;}
//	public String getMessage() {return "[" + getErrCode() + "]" + super.getMessage();}
//}
//
//class errorPractice {
//	public static void main(String[] args) throws Exception {
//		throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
//	}
//}


//class errorPractice {
//	public static void main(String[] args) {
//		try {
//			method1();
//			System.out.println(6);
//		} catch (Exception e) {
//			System.out.println(7);
//		}
//	}
//
//	static void method1() throws Exception {
//		try {
//			method2();
//			System.out.println(1);
//		} catch (NullPointerException e) {
//			System.out.println(2);
//			throw e;
//		} catch (Exception e) {
//			System.out.println(3);
//		} finally {
//			System.out.println(4);
//		}
//		System.out.println(5);
//	} 
//
//	static void method2() {
//		throw new NullPointerException();
//	}
//}


//public class errorPractice{
//	static void method(boolean b) {
//		try {
//			System.out.println(1);
//			if(b) return; //return이 아닌 exit일땐 1하고 바로 종
//			System.out.println(2);
//		}catch(RuntimeException r) {
//			System.out.println(3);
//			return;
//		}catch(Exception e) {
//			System.out.println(4);
//			return;
//		}finally {
//			System.out.println(5);
//		}
//		System.out.println(6);
//	}
//	
//	public static void main(String[] args) {
//		method(true);
//		method(false);
//	}
//}


//public class errorPractice{
//	static void method1() {
//		try {
//			method2();
//			System.out.println(1);
//		}catch(ArithmeticException e) {
//			System.out.println(2);
//		}finally {
//			System.out.println(3);
//		}
//		System.out.println(4);
//	}
//	static void method2() {
//		throw new NullPointerException();
//	}
//	
//	public static void main(String[] args) {
//		try {
//			method1();
//		}catch(Exception e) {
//			System.out.println(5);
//		}
//	}
//}