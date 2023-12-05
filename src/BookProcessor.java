public class BookProcessor implements Runnable{
    private Book book;

    public BookProcessor(Book book) {
        this.book = book;
    }

    @Override
    public void run() {
        System.out.println(this.book.toString());
    }
}
