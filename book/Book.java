/**
 * This represents a Book.
 *
 * @author Lori White
 * @version 10/2/2018
 */
public class Book
{
    // instance variables
    private String isbn;
    private String title;
    private String author;
    private double cost;

    /**
     * Default constructor for objects of class Book.
     */
    public Book()
    {
        // initialize instance variables
        isbn = title = author = "";
        cost = 0;
    }
    /**
     * Overloaded constructor for objects of class Book.
     * 
     * @param id Book's ISBN
     * @param description Book's title
     * @param name Book's author
     * @param value Book's cost
     */
    public Book(String id, String description, String name, double value)
    {
        // initialize instance variables
        isbn = id;
        title = description;
        author = name;
        cost = value;
    }
    /**
     * Copy constructor for objects of class Book.
     * 
     * @param b another Book object
     */
    public Book(Book b)
    {
        // initialize instance variables
        this.isbn = b.isbn;
        this.title = b.title;
        this.author = b.author;
        this.cost = b.cost;
    }
    /**
     * Updates the Book's ISBN.
     * 
     * @param id Book's ISBN
     */
    public void setISBN(String id)
    {
        isbn = id;
    }
    /**
     * Updates the Book's author.
     * 
     * @param name Book's author
     */
    public void setAuthor(String name)
    {
        author = name;
    }
    /**
     * Updates the Book's title.
     * 
     * @param description Book's title
     */
    public void setTitle(String description)
    {
        title = description;
    }
    /**
     * Updates the Book's cost.
     * 
     * @param value Book's cost
     */
    public void setCost(double value)
    {
        cost = value;
    }
    /**
     * Determines if a Book is the same as another Book based on the ISBN.
     * 
     * @param b another Book object
     * @return whether this Book is equal to the other Book
     */
    public boolean equals(Book b)
    {
        return this.isbn.equals(b.isbn);
    }
    /**
     * Compares a Book based on their cost.
     * 
     * @param s another Book object
     * @return whether this Book's cost is greater than, less than, or equal to the other Book's cost
     */
    public int compareTo(Book b)
    {
    	if(this.cost - b.cost > 0)
    		return 1;
    	else if(this.cost - b.cost < 0)
    		return -1;
    	else
    		return 0;
    }
    /**
     * Creates a string that represents a Book.
     * 
     * @return the string that represents a Book
     */
    public String toString()
    {
        return "ISBN: " + isbn + "\nTitle: " + title + "\nAuthor: " + author + "\nCost: $" + cost;
    }
}