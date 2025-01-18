public class Main {
    public static void printInfoBook(String name, int year, String author) {
        System.out.println("Название книги - " + name + "\nДата выпуска - " + year + "\nАвтор - " + author);
    }
    public static void main(String[] args) {
        Author author1 = new Author("Фёдор", "Достоевский");
        Author author2 = new Author("Лев", "Толстой");
        Book book1 = new Book("Преступление и наказание", 1866, author1);
        Book book2 = new Book("Война и мир", 1863, author2);
        printInfoBook(book1.getNameBook(), book1.getYear(), author1.getNameSurname());
        printInfoBook(book2.getNameBook(), book2.getYear(), author2.getNameSurname());
        System.out.println();
        System.out.println("Изменена дата книг");
        book1.setYear(2025);
        book2.setYear(2025);
        printInfoBook(book1.getNameBook(), book1.getYear(), author1.getNameSurname());
        printInfoBook(book2.getNameBook(), book2.getYear(), author2.getNameSurname());
    }
}