import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    Library() {
        books = new ArrayList<>();
    }

    void addBook(Book book){
        books.add(book);
    }

    void deleteBook(Book book){
        books.remove(book);
    }

    void printBooks(){
        for(Book book : books){
            System.out.println(book.getTitle());
        }
    }



}
