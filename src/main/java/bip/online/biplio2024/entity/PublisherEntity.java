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
@Table(name="publishers")

public class PublisherEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String title;
        @ManyToOne
        @JoinColumn(name = "city_id")
        private  CityEntity city;
//        @OneToMany(mappedBy = "publisher",cascade = CascadeType.ALL)
//        private List<BookEntity> books;


    }
