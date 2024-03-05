package bip.online.biplio2024.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="authors")
public class AuthorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "не может пустым")
    private String name;
    @NotBlank(message = "не может пустым")
    private String lastname;
    private String surname;
    //@OneToMany(cascade = CascadeType.ALL,mappedBy = "author")
   // private List<BookEntity> books;



}
