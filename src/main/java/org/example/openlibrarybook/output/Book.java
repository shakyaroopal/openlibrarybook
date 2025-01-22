package org.example.openlibrarybook.output;

import com.fasterxml.jackson.annotation.JsonProperty;
//import jakarta.persistence.;
import jakarta.persistence.*;
//import lombok.*;
import lombok.*;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Book {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id; // Use Long for auto-generated IDs
    @Id
    @Column(unique = true, nullable = false)
    private String isbn;

    @Column(nullable = false)
    private String title;

//    @Column
//    private LocalDate publishDate;

    @Column
    private String url;
}