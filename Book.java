/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
public class Book
{
     // The fields.
    private String author;
    private String title;
	private int pages;
	private String refNumber;
	private int borrowed;
	private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
		pages = bookPages;
		refNumber = "";
		courseText = bookCourseText;
    }
	// This satisfies problem 2.83
    public String getAuthor(){
	return author;
	}
	// This satisfies problem 2.83
	public  String getTitle(){
	return title;
	}
	// This satisfies problem 2.85
    public int getPages(){
	return pages;
	}
	// This satisfies problem 2.84
	public void printAuthor(){
	System.out.println(author);
	}
	// This satisfies problem 2.84
	public void printTitle(){
	System.out.println(title);
	}
	//This Satisfies 2.87
	public void printDetails()
    {
   System.out.println("Title: " + title + " , Author: " + author + ", Pages: " + pages);
   //This satisfies 2.89
   if(refNumber.length() > 0){
   System.out.println("Reference Number: " +refNumber);
    }
	else{
	System.out.println("Reference Number: " +"ZZZ");
	}
	//This part satisifies 2.91
	System.out.println("This book has been borrowed " +borrowed +" times.");
	}
	//This satisfies 2.88
	public String getRefNumber(){
	return refNumber;
	}
	//This satisfies 2.88
	public void setRefNumber(String ref){
	//This satisfies 2.90
	if(refNumber.length() >=3){
	refNumber = ref;
	}
	else{
	System.out.println("Reference Number must be more than 3 characters");
	}
	}
	//This satisfies 2.91
	public void borrow(){
	borrowed = borrowed +1;
	}
	public int getBorrowed(){
	return borrowed;
	}
	//This satisfies 2.92
	public boolean isCourseText(){
	return courseText;
	}
}
