import java.util.ArrayList;

public class Reader {
    private String name;
    private ArrayList<Book> borrowedBooks;

    Reader(String name){
        this.name = name;
        borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Library library, Book book){
        library.deleteBook(book);
        borrowedBooks.add(book);
    }

    public void returnBook(Library library, Book book){
        library.addBook(book);
        borrowedBooks.remove(book);
    }

    public void printBorrowedBooks(){
        for(Book book : borrowedBooks){
            System.out.println(book.toString());
        }
    }



}
