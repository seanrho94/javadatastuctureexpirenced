package practise;

import lists.classes.Book;

public class Testbook {
    public static void main(String[] args) {
        Book book = new Book(12345, "MathGodBook", "Genius Bro");
        System.out.println(book);

        book.setBookName("MathFool");
        book.setBookName("Dumb Bro");
        book.setIsbnid(54321);

        System.out.println(book);
    }

}
