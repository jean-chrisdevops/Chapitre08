package bookstoread;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

public class BookShelfSpec {

    @Test
    public void shelfEmptyWhenNoBookAdded() {
        BookShelf shelf = new BookShelf();
        List<String> books = shelf.books();
        assertTrue(books.isEmpty(), () -> "L'étagère devrait être vide.");
    }

    @Test
    void bookshelfContainsTwoBooksWhenTwoBooksAdded() {
        BookShelf shelf = new BookShelf();

        shelf.add("Effective Java", "Code Complete");

        List<String> books = shelf.books();
        assertEquals(2, books.size(), () -> "L'étagère devrait contenir deux livres.");
    }
}
