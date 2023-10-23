//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        BookManager bookManager = new BookManager(new Scanner(System.in));
//
//        Scanner scanner = new Scanner(System.in);
//        
//        // 실습 자료 참고하여 Main 기능 구현
//        
//        System.out.println("도서 관리 시스템");
//        System.out.println("1. 도서 추가");
//        System.out.println("2. 도서 목록 출력");
//        System.out.println("3. 도서 검색");
//        System.out.println("4. 도서 삭제");
//        System.out.println("5. 도서 정보 수정");
//        System.out.println("6. 도서 제목으로 정렬");
//        System.out.println("0. 종료");
//        
//        while(true) {
//        	
//        	System.out.print("원하는 기능을 선택하세요: ");
//        	String key = scanner.nextLine();
//        	if(key.equals("0")) break;
//        	switch(key) {
//        	case "1": System.out.println("도서 추가");
//        			System.out.print("제목: ");
//        			String title = scanner.nextLine();
//        			System.out.print("작가: ");
//        			String author = scanner.nextLine();
//        			System.out.print("출판사: ");
//        			String publisher = scanner.nextLine();
//        			System.out.print("가격: ");
//        			double price = scanner.nextDouble();
//        			bookManager.addBook(new Book(title,author,publisher,price));
//        			System.out.println("도서가 추가되었습니다.");
//          			scanner.nextLine();
//          			continue;
//        	case "2": System.out.println("도서 목록 출력");
//        			bookManager.displayAllBooks();
//        			continue;
//        	case "3": System.out.println("도서 검색");
//        		System.out.print("검색할 제목: ");
//        		String searchName = scanner.nextLine();
//        		bookManager.searchBookByTitle(searchName);
//        		continue;
//        	case "4": System.out.println("도서 삭제");
//    		System.out.print("삭제할 제목: ");
//    		String removeName = scanner.nextLine();
//    		bookManager.removeBook(removeName);
//    		continue;
//        	case "5": System.out.println("도서 정보 수정");
//        			System.out.print("수정할 제목: ");
//        			String existName = scanner.nextLine();
//        			bookManager.updateBook(existName);
//        			continue;
//        	case "6":
//        	    System.out.println("도서 제목으로 정렬");
//        	    bookManager.sortBooksByTitle();
//        		continue;
//        	}
//        	
//        }
//        
//    }
//}
//
