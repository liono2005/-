package bip.online.biplio2024.service;

import bip.online.biplio2024.entity.AuthorEntity;
import bip.online.biplio2024.entity.BookEntity;
import bip.online.biplio2024.repository.AuthorRepo;
import bip.online.biplio2024.repository.BookRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@AllArgsConstructor

public class BookService {

        private final BookRepo repo;



//    public List<AuthorEntity> {
//        return repo.findAll();
//    }
//    public Optional<AuthorEntity> findById(){
//        return repo.findById(id);
//    }

        public BookEntity save(BookEntity data) {
            return repo.save(data);
        }
        public void update(BookEntity data){
            repo.save(data);
        }
}
