public class Book {
    private String nameBook;
    private int year;
    private Author author;
    public Book(String nameBook, int year, Author author){
        this.nameBook = nameBook;
        this.year = year;
        this.author = author;
    }
    public String getNameBook(){
        return this.nameBook;
    }
    public int getYear(){
        return this.year;
    }
    public Author getAuthor(){
        return this.author;
    }
    public  void setYear(int year){
        this.year = year;
    }
}
