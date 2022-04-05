package JavaProject01;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMangement {
	
	Scanner sc = new Scanner(System.in);
	
	ArrayList<Book> books = new ArrayList<Book>();
	
	public void registerBook() {
		
		int bookno = sc.nextInt();
		String title = sc.next();
		String author = sc.next();
		String genre = sc.next();
		String bookposition = sc.next();
		boolean availability = sc.nextBoolean();
		
		Book book = new Book(bookno, title, author, genre, bookposition, availability);
		
		books.add(book);
		
	}
	
}
