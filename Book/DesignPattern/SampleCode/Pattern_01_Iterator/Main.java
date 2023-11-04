package Book.DesignPattern.SampleCode.Pattern_01_Iterator;

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

        System.out.println();

        // ArrayList 테스트
        BookShelf_1 bookShelf_1 = new BookShelf_1(4);
        bookShelf_1.appendBook(new Book("Around the World in 80 Days"));
        bookShelf_1.appendBook(new Book("Bible"));
        bookShelf_1.appendBook(new Book("Cinderella"));
        bookShelf_1.appendBook(new Book("Daddy-Long-Legs"));
        bookShelf_1.appendBook(new Book("East of Eden"));
        bookShelf_1.appendBook(new Book("Frankenstein"));

        for(Book book : bookShelf_1){
            System.out.println(book.getName());
        }
    }
}