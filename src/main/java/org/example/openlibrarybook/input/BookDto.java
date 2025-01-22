package org.example.openlibrarybook.input;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.internal.util.StringHelper;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BookDto{
    private String id;

    private String isbn;

    private String title;

    private LocalDate publishDate;

    private String numberOfPages;

}
