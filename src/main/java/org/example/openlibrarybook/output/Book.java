package org.example.openlibrarybook.output;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Book {
    @JsonProperty("bookId")
    private String bookId;
    @JsonProperty("bookTitle")
    private String title;
    @JsonProperty("bookAuthor")
    private String authorId;
}
