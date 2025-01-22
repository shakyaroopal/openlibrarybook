package org.example.openlibrarybook.output;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Author {
    @JsonProperty("authorId")
    private String authorId;
    private String authorName;
}
