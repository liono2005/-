package bip.online.biplio2024.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "books")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
   @JoinColumn(name = "author_id")
    private AuthorEntity author;
    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private PublisherEntity publisher;
    @ManyToOne
    @JoinColumn(name = "genre_id")
   private GenreEntity genre;//;hanar
    private String year;
}
