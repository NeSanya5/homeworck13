import java.util.Objects;

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

    public String toString() {
        return "Название книги - " + this.nameBook + "\nГод выпуска - " + this.year + "\nАвтор - " + this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, year, author);
    }
}
