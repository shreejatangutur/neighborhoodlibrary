package fcps.stangutur.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

import fcps.stangutur.Book;
import fcps.stangutur.LibraryDatabase;
import fcps.stangutur.LibraryManager;

public class LibraryManagerTest {
	
	@Test
	public void loadBooks(){
		LibraryDatabase database= new LibraryDatabase();
		List<Book> list = new ArrayList<>();
		list.add (new Book("College Search", "AuthorA", 2001, 30, "education"));
		LibraryManager manager = new LibraryManager(list);
		Book book = manager.getBook(2001);
		String author = book.getAuthor();
		assertEquals("Author should match for given book ID.","AuthorA", author);
	}
	

}
