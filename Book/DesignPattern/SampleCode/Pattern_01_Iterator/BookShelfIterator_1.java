package Book.DesignPattern.SampleCode.Pattern_01_Iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

// ArrayList 용 Iterator(이름만 변경)
public class BookShelfIterator_1 implements Iterator<Book> {
    private BookShelf_1 bookShelf;
    private int index;

    public BookShelfIterator_1(BookShelf_1 bookShelf) {
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
