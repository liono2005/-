package bip.online.biplio2024.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="genres")
public class GenreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
   // @OneToMany(mappedBy = "genre",cascade = CascadeType.ALL)
   // private List<BookEntity> books;
}
