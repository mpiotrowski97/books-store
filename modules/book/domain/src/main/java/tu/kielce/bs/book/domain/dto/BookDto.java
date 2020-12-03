package tu.kielce.bs.book.domain.dto;

import lombok.Builder;
import lombok.Getter;
import tu.kielce.bs.book.domain.Category;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Builder
public class BookDto {
        private final String isbn;
        private final String title;
        private final String author;
        private final String description;
        private final String publishedBy;
        private final BigDecimal price;
        private final Integer quantity;
        private final String category;
}
