package fcps.stangutur;
import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
	
	public List<Book> mybooks;
	
	public LibraryManager(List<Book> booklist){
		mybooks = booklist;
	}
	
	
	public List<Book> getBooks(int studentid){
		List<Book> studentBooks = new ArrayList<Book>();
		for(Book book : mybooks ){
			int s=book.getStudentId();
			if(s==studentid){
				studentBooks.add(book);
			}
				
		}
		
		return studentBooks;
	}
	
	/**
	 * Returns book details for a given book id
	 * @param bookid
	 * @return
	 */
	public Book getBook(int bookid){
		for (Book book:mybooks){
			int id=book.getBookID();
				if(bookid==id){
					return book; 
					
				}
			
		}
		
		
		return null;
	}
	

	/**
	 * Returns all books that meet the given category
	 * @param category
	 * @return
	 */
	public List<Book> getBooksByCategory(String  category){
		List<Book> categories = new ArrayList <Book>();
		for (Book book: mybooks){
			String c=book.getCategory();
			if(c.equals(category)){
				categories.add(book);
			}
			
			
		}

		return categories;
	}
	
	
	

}
