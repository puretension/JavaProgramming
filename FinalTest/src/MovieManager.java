//import java.util.*;
//import java.util.Collections;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//
//public class MovieManager {
//    private List<Movie> movies;
//    String filePath = "movie.csv";
//
//    public MovieManager() {
//        // TODO:
//    	movies = new ArrayList<Movie>();
//    	Scanner scanner = new Scanner(System.in);
//    }
//
//    public void addMovie(Movie movie) {
//        movies.add(movie);
//    }
//
//    public void writeMoive(Movie movie) {
//        // TODO:
//    	
//    }
//    
////  public void searchBookByTitle(String title) {
////  Book book = bookMap.get(title);  // 도서 제목을 key로 사용하여 도서 객체를 가져옴
////  if (book != null) {
////      book.displayInfo();
////      System.out.println();
////  } else {
////      System.out.println("해당하는 도서를 찾을 수 없습니다.");
////  }
////}
//
//    public void searchMoviesByTitle(String title) {
//        // TODO
//    	for(Movie movie: movies) {
//    		if(movie.getTitle().equals(title)) {
//    			movie.print();
//    		}
//    	}
//    }
//
//    public void searchMoviesByDirector(String director) {
//        // TODO
//    }
//
//    public void printRandomMovies(int count) {
//        // TODO
//    }
//
//    public void showAllMovies() {
//        for (Movie movie : movies) {
//            movie.print();
//        }
//    }
//
//    private void loadMoviesFromCSV(String csvFilePath) {
//        // TODOÚ
//    }
//}