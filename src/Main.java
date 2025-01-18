public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Фёдор", "Достоевский");
        Author author2 = new Author("Лев", "Толстой");
        Book book1 = new Book("Преступление и наказание", 1866, author1);
        Book book2 = new Book("Война и мир", 1863, author2);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println();
        System.out.println("Изменена дата книг");
        book1.setYear(2025);
        book2.setYear(2025);
        System.out.println(book1);
        System.out.println(book2);
    }
}