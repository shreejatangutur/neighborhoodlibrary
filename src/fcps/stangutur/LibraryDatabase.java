package fcps.stangutur;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LibraryDatabase {

	List<Book> booklist = new ArrayList<>();

	public LibraryDatabase() {

	}

	public void readData() {
		List<String> booklines = null;
		try {
			booklines = Files.readAllLines(Paths.get("C:/library", "BookDetails.csv"));
		} catch (IOException e) {
			System.err.println(" Create a folder C:/library and load BookDetails.csv ");
		}

		if (booklines == null) {
			System.out.print("Unable to read the file");
		}
		
		for (String st : booklines) {
			
			String[] details = st.split(",");
			String bookID = details[0];
			String Title = details[1];
			String Author = details[2];
			String pages = details[3];
			String category = details[4];
			String rating = details[5];
			//String publisher = details[6];
			

			if(Author.equals("Author") && category.equals("category")){
				System.out.println("do not load first line called Header");
				continue;
			}
			String studentID = details[6];
			int bookIDval = Integer.parseInt(bookID);
			int pageCount = Integer.parseInt(pages);
			int studentIdVal = Integer.parseInt(studentID);
			
			Book book = new Book(Title, Author, bookIDval, pageCount, category);
			book.setStudentId(studentIdVal);
			booklist.add(book);
		}
	}

	public List<Book> getBooklist() {
		return booklist;
	}

}
