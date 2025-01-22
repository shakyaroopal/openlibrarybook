package org.example.openlibrarybook.service;
import lombok.AllArgsConstructor;
import org.example.openlibrarybook.Mapper.BookMapper;
import org.example.openlibrarybook.input.BookDto;
import org.example.openlibrarybook.output.Author;
import org.example.openlibrarybook.output.Book;
import org.example.openlibrarybook.repository.BookRepository;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;
import java.time.LocalDate;

@Service
public class BookService {

    @Autowired
    private RestOperations restTemplate;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private Book book;

    private AuthorService authorService;

    public Book getBooks(String isbn) {
        String url = "https://openlibrary.org/api/books?bibkeys=ISBN:" + isbn + "&jscmd=data&format=json";
        String check = "https://openlibrary.org/api/books?bibkeys=ISBN:9780140328721&jscmd=data&format=json";
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        System.out.println(response.getBody());
        JSONObject json = new JSONObject(response.getBody());
        JSONObject bookData = json.getJSONObject("ISBN:" + isbn);
        book.setIsbn(isbn);
        book.setTitle(bookData.getString("title"));
        book.setUrl(bookData.getString("url"));

        Str

        return book;
    }
}
