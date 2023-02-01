package fcps.stangutur;

import java.util.List;
import java.util.Scanner;

public class Application {
	
	
	public static void main(String args[]){
		System.out.println("Welcome to FCPS library");
		System.out.println("You can find Books  and student details");
		
		System.out.println("1- Book details 2- Student check outs 3. Book categories ");
		
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
		System.out.print("Enter your input: ");
		String str= sc.nextLine(); //reads string.
		int inputvalue = Integer.parseInt(str);
		
		LibraryDatabase database = new LibraryDatabase();
		database.readData();
		
		LibraryManager manager = new LibraryManager(database.getBooklist());
		find(manager, inputvalue);
		
	}
	
	
	public static void printBook(Book bookdetails){
		System.out.print(" Book ID:"+bookdetails.getBookID());
		System.out.print(" Category:"+bookdetails.getCategory());
		System.out.print(" Student ID:"+bookdetails.getStudentId());
		System.out.print(" Author:"+bookdetails.getAuthor());
		System.out.print(" num of pages:"+bookdetails.getPagecount());
		System.out.print(" Title:"+bookdetails.getTitle());
		
	}
	
	
	public static void find(LibraryManager manager,int inputvalue){
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
		
		if(inputvalue == 1){
			System.out.print("Enter Book ID: ");
			
			String bookid= sc.nextLine(); //reads string.
			int bookIdval =Integer.valueOf(bookid);
			
			Book bookdetails = manager.getBook(bookIdval);
			if(bookdetails == null){
				System.out.print("No BOOK FOUND.. exiting");
					
			}
			printBook(bookdetails);
			
		}else if(inputvalue == 2){
			System.out.print("Enter Student ID: ");
			
			String studentId= sc.nextLine(); //reads string.
			int studentIDval =Integer.valueOf(studentId);
			
			List<Book> bookdetails = manager.getBooks(studentIDval);
			for(Book book: bookdetails){
				
				printBook(book);
			}
			
		} else if(inputvalue == 3){
			System.out.print("Enter Book Category: ");
			
			String catgeory= sc.nextLine(); //reads string.
			
			List<Book>  books = manager.getBooksByCategory(catgeory);
			if(books.isEmpty()){
				System.out.print("No books found for this category");
			}
			for(Book book: books){
				printBook(book);
			}
		} else {
			System.out.print("Command not found ... exiting the system ");
		}
	}

}
