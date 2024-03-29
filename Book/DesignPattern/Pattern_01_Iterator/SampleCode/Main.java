package Book.DesignPattern.Pattern_01_Iterator.SampleCode;

import java.util.Iterator;

public class Main{
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));

        // 1
        Iterator<Book> it = bookShelf.iterator();
        while(it.hasNext()){
            System.out.println(it.next().getName());
        }
        System.out.println();

        // 2
        for(Book book : bookShelf){
            System.out.println(book.getName());
        }
    }
}