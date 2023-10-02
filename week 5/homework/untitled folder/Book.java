/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: Book Class which has isbn, title, author, pub, and pg. Takes in author obj.
*/

public class Book{
    //declare private variables
    private String isbn, title, publisher;
    private Author author;
    private int pages;

    /**
     * global constructor for all input variables
     * @param isbn input isbn as a string
     * @param title input title as a string
     * @param author input author as an author class
     * @param pub input publisher string
     * @param pg input page numbers as integer
     */

    //global constructor
    public Book(String isbn, String title, Author author, String pub, int pg){
        this.isbn = isbn;
        this.title = title;
        this.publisher = pub;
        this.author = author;
        this.pages = pg;
    }


    /**
     * copy constructor
     * @param book input as book obj
     */

    //copy constructor
    public Book(Book book){
        this.isbn = book.isbn;
        this.title = book.title;
        this.publisher = book.publisher;
        this.author = new Author(book.author);
        this.pages = book.pages;
    }


     /**
     * method equals overrides default equals to check if book obj are the same.
     * @param auth input book obj
     * @return returns boolean, true if obj are the same, false if obj are not.
     */

    @Override
    public boolean equals(Object bk){
        Book book = (Book)bk;
        // Author author = (Author)book
        return (this.isbn.equals(book.isbn) &&
        this.title.equals(book.title) &&
        this.publisher.equals(book.publisher)&&
        this.author.equals(book.author)&&
        this.pages == book.pages);
    }

    /**
     * method toString returns string of obj
     * @return returns all obj variables in printed format
     */
    @Override
    public String toString(){
        String auth = author.getEmailAddy();
        return String.format("%s %s <%s> (ISBN-10 #%s, %d pages)", title, author, auth, isbn, pages);
    }

    /**
     * method getIsbn returns obj isbn
     * @return returns obj isbn in string format.
     */

    public String getIsbn(){
        return this.isbn;
    }

    /**
     * method getTilereturns obj title
     * @return returns obj tile in string format.
     */

    public String getTitle(){
        return this.title;
    }

    /**
     * method getPublisher returns obj publisher
     * @return returns obj publisher in string format.
     */
    public String getPublisher(){
        return this.publisher;
    }

    /**
     * method getAuthor returns obj author
     * @return returns obj author in Author obj format.
     */
    public Author getAuthor(){
        return this.author;
    }
    
    /**
     * method getPages returns obj pages
     * @return returns obj pages in int format.
     */
    
    public int getPages(){
        return this.pages;
    }

    /**
     * method setIsbn sets obj isbn to input isbn number
     * @param num new isbn number in string format
     */
    public void setIsbn(String num){
        this.isbn = num;
    }

    /**
     * method setTitle sets obj title to input title
     * @param newTitle new title in string format
     */
    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    /**
     * method setPublisher sets obj publisher to input pub
     * @param pub new publisher in string format
     */

    public void setPublisher(String pub){
        this.publisher = pub;
       
    }

    /**
     * method setAuthor sets author to input author obj
     * @param auth input author obj to be set new author
     */
    public void setAuthor(Author auth){
        this.author = auth;
    }

    /**
     * method setNumPages sets obj pages to input pages
     * @param pg input number of pages in int format
     */
    public void setNumPages(int pg){
       this.pages = pg;
    }




}