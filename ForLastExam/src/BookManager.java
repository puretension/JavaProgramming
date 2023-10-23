//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Scanner;
//
//public class BookManager {
//    private ArrayList<Book> books;
//    private Scanner scanner;
//
//    public BookManager(Scanner scanner) {
//        books = new ArrayList<>();
//        this.scanner = scanner;
//    }
//
//    public void addBook(Book book) {
//    	books.add(book);
//    }
//
//    public void displayAllBooks() {
//    	if(books.size() == 0) {
//    		System.out.println("등록된 도서가 없습니다.");
//    		return;
//    	}
//    	for(Book a: books) {
//    		a.displayInfo();
//    		System.out.println();
//    	}
//    }
//
//    public void searchBookByTitle(String title) {
//    	if(books.size() == 0) {
//    		System.out.println("등록된 도서가 없습니다.");
//    		return;
//    	}
//    	for(Book a: books) {
//    		if(a.getTitle().equals(title)) {
//    			a.displayInfo();
//    			return;
//    		}
//    	}
//    	System.out.println("해당하는 도서를 찾을 수 없습니다.");
//    }
//
//    public void removeBook(String title) {
//    	if(books.size() == 0) {
//    		System.out.println("등록된 도서가 없습니다.");
//    		return;
//    	}
//    	for(Book a: books) {
//    		if(a.getTitle().equals(title)) {
//    			books.remove(a);
//    			System.out.println("도서가 삭제되었습니다.");
//    			return;
//    		}
//    	}
//     	System.out.println("해당하는 도서를 찾을 수 없습니다.");
//    }
//
//    public void updateBook(String existTitle) {
//    	if(books.size() == 0) {
//    		System.out.println("등록된 도서가 없습니다.");
//    		return;
//    	}
//    	for(Book a: books) {
//    		if(a.getTitle().equals(existTitle)) {
//    			System.out.println("도서를 찾았습니다. 수정할 정보를 입력해주세요.");
//    			System.out.print("도서 제목: ");
//    			String newTitle = scanner.nextLine();
//    			a.setTitle(newTitle);
//    			
//    			System.out.print("도서 작가: ");
//    			String newAuthor = scanner.nextLine();
//    			a.setAuthor(newAuthor);
//    			
//    			System.out.print("도서 출판사: ");
//    			String newPublisher = scanner.nextLine();
//    			a.setPublisher(newPublisher);
//    			
//    			System.out.print("도서 가격: ");
//    			//scanner.nextLine();
//    			double newPrice = scanner.nextDouble();
//    			a.setPrice(newPrice);
//    			scanner.nextLine();
//    			System.out.println("도서 정보가 수정되었습니다.");
//    	 		return;
//    		}
//    	}
//    	System.out.println("해당하는 도서를 찾을 수 없습니다.");
//    	return;
//    }
//    
//    public void sortBooksByTitle() {
//    	if(books.size() == 0) {
//    		System.out.println("등록된 도서가 없습니다.");
//    		return;
//    	}
//        Collections.sort(books, new Comparator<Book>() {
//            @Override
//            public int compare(Book book1, Book book2) {
//                return book1.getTitle().compareTo(book2.getTitle());
//            }
//        });
//        displayAllBooks();
//    }
//
//}
//
