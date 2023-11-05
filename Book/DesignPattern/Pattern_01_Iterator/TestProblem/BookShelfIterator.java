package Book.DesignPattern.Pattern_01_Iterator.TestProblem;

import java.util.Iterator;
import java.util.NoSuchElementException;

// ArrayList 용 Iterator(이름만 변경)
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
