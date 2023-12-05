import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int year = scanner.nextInt();

        Book book = new Book(title, author, year);
        BookProcessor bookProcessor = new BookProcessor(book);
        Thread bookThread = new Thread(bookProcessor);

        bookThread.start();
        bookThread.interrupt();
    }
}