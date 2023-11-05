package Book.DesignPattern.Pattern_01_Iterator.TestProblem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// ArrayList 사용
public class BookShelf implements Iterable<Book>{
    private List<Book> books;

    public BookShelf(int initSize) {
        this.books = new ArrayList<>(initSize);
    }

    public Book getBookAt(int index){
        return books.get(index);
    }

    public void appendBook(Book book){
        books.add(book);
    }

    public int getLength(){
        return books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
