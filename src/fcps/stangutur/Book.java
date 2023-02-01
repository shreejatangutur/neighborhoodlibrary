package fcps.stangutur;
// class is like a blueprint/plan
public class Book {
	
	int pagecount = 100;
	String title;
	int price;
	int chapters;
	String author;
	
	private int BookID;
	private int pages;
	private String category;
	private String rating;
	private String publisher;
	private int studentId; 
	
	
	public Book(String title, String author, int bookID, int pages, String category) {
		super();
		this.title = title;
		this.author = author;
		this.BookID = bookID;
		this.pages = pages;
		this.category = category;
	}


	public int getPagecount() {
		return pagecount;
	}


	public void setPagecount(int pagecount) {
		this.pagecount = pagecount;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getChapters() {
		return chapters;
	}


	public void setChapters(int chapters) {
		this.chapters = chapters;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getBookID() {
		return BookID;
	}


	public void setBookID(int bookID) {
		BookID = bookID;
	}


	public int getPages() {
		return pages;
	}


	public void setPages(int pages) {
		this.pages = pages;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getRating() {
		return rating;
	}


	public void setRating(String rating) {
		this.rating = rating;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	

	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	// constructor - this is used to construct a class - creating objects.
	public Book(){
		
	}
	
	
	public Book(String heading){
		title = heading; 
	}
	
	public Book(String name,String heading){
		author=name;
		title= heading;
		
	
	}
	
	public int calculatePrice(){
	// price of each chapter
		int eachChapterVal = 8;
			if (author != null && author.equals("Sarah Dessen")){
				eachChapterVal= 10;
			}
			else{
				eachChapterVal=1;
			}
			int value = chapters * eachChapterVal;
			return value;
		
	}
	
	public void highlightpage(){
		// first part: initial value of for loop variable.- current Page
		// second part : condition : This will be evaluated every time before executing its body.
		//Third part: after the loop executed everytime, what should be done.
		for (int currentPage=1 ; currentPage < pagecount ; currentPage++ ){
			boolean divisible = currentPage % 7==0;
			if (divisible){
				System.out.println(currentPage);
			}
		}
	}
	
	
	
	public String TableOfCt() {
		return "Page one has copyright, page 10 has index";
		
	}
		
	public int getglossary(){
		int glosrypage = pagecount - 3;
				return glosrypage;
		
	}
	
	/******************* Method ends here **************/
	
	
	// This is main method.
	public static void main(String args[]){
		Book b = new Book("Covid-19 crisis");
		System.out.println(b.getSummary());
		
		Book chsMag = new Book("CHS Weekly Magazine");
		chsMag.price = 20;
		chsMag.pagecount=8;
		chsMag.chapters=0;
		
		System.out.println(chsMag.getSummary());
		
		Book dramland= new Book ("Sarah Dessen","Dreamland");
		dramland.price=1000;
		dramland.pagecount=80;
		dramland.chapters=7;
		
		
		System.out.println(dramland.getSummary());
		dramland.highlightpage();
		
		
	}
	
	//If the book has three of less reviews, then highlight page numbers that are divisible by eight. 
	
	
	/***************  Methods ***************/
	public String getSummary(){
		return " My Book :" + title + ". no of pages in my book:" + pagecount +  " there are " + chapters + "  chapters in this book" + "the value of each book is " + calculatePrice() + TableOfCt() + getglossary();
		
		
	}
	
	
	public int bookmarkPageNumber(){
//		System.out.println("my dummy mark : page No 33");
		return 25;
	}

}
