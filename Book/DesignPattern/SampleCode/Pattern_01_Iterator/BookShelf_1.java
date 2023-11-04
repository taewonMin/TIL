package Book.DesignPattern.SampleCode.Pattern_01_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// ArrayList 사용
public class BookShelf_1 implements Iterable<Book>{
    private List<Book> books;

    public BookShelf_1(int initSize) {
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
        return new BookShelfIterator_1(this);
    }
}
