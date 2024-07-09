package ttc;

import java.io.Serializable;
import java.util.ArrayList;

public class CartBean implements Serializable {
    private ArrayList<BookBean> _books = new ArrayList<>();
    
    public CartBean(){}

    public void addBook(BookBean book) {
        _books.add(book);
    }
    public void setBooks(ArrayList books) {
        _books = books;
    }
    public ArrayList getBooks() {
        return _books;
    }
}
