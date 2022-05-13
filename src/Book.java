public class Book {
    private String bookTitle;
    private int bookNumOfPages;
    private int bookPublishYear;

    public Book(String bookTitle, int bookNumOfPages, int bookPublishYear){
        this.bookTitle = bookTitle;
        this.bookNumOfPages = bookNumOfPages;
        this.bookPublishYear =bookPublishYear;
    }


    public Book(String bookTitle, int bookNumOfPages){
        this.bookTitle = bookTitle;
        this.bookNumOfPages = bookNumOfPages;
    }


    public Book(int bookNumOfPages, int bookPublishYear){
        this.bookNumOfPages = bookNumOfPages;
        this.bookPublishYear =bookPublishYear;
    }

    public Book(String bookTitle){
        this.bookTitle = bookTitle;
    }

    public Book(int bookNumOfPages){
        this.bookNumOfPages = bookNumOfPages;
    }

    public Book(){
        this.bookTitle=null;
        this.bookNumOfPages = 0;
        this.bookPublishYear =0;
    }
    public String getBookTitle() {
        return bookTitle;
    }

    public int getBookNumOfPages() {
        return bookNumOfPages;
    }

    public int getBookPublishYear() {
        return bookPublishYear;
    }
    @Override
    public String toString() {
        return getBookTitle() + ", " + getBookNumOfPages() + " pages, " + getBookPublishYear();
    }
}
