import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class KitapKoleksiyon {
    public static void main(String[] args) {
        Set<Book> bookHash = new HashSet<>();

        bookHash.add(new Book("Berserk Volume 1", 224, "Kentaro Miura", 1990));
        bookHash.add(new Book("The Flowers of Evil", 448, "Charles Baudelaire", 1857));
        bookHash.add(new Book("A wizard of Earthsea", 448, "Ursula K. Le Guin", 1968));
        bookHash.add(new Book("Wuthering Heights", 416, "Emily Bronte", 1847));
        bookHash.add(new Book("After Dark", 180, "Murakami Haruki", 2004));

        Set<Book> sortedByName = new TreeSet<>(bookHash);

        for (Book book : sortedByName) {
            System.out.println(book.name + " " + book.page + " " + book.author + " " + book.date);
        }
    }
}

class Book implements Comparable<Book>{
    String name;
    int page;
    String author;
    int date;

    public Book(String name, int page, String author, int date) {
        this.name = name;
        this.page = page;
        this.author = author;
        this.date = date;
    }

    @Override
    public int compareTo(Book other){
        return this.name.compareTo(other.name);
    }

}
