package org.agoncal.quarkus.starting;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.PathParam;

import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class BookRepository {


    public List<Book> getAllBooks() {
        return List.of(
                new Book(1, "Understanding Quarkus", "Antonio", 2020, "IT"),
                new Book(2, "Java", "Antonio", 2020, "IT"),
                new Book(3, "Thinking Java", "Antonio", 1998, "IT")
        );
    }

    public Optional<Book> getBook(int id) {
        return getAllBooks().stream().filter(book -> book.id == id).findFirst();
    }

}
