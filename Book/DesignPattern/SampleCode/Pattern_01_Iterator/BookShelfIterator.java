package Book.DesignPattern.SampleCode.Pattern_01_Iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Book next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }

        return this.bookShelf.getBookAt(index++);
    }
}
