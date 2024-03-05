package bip.online.biplio2024.service;

import bip.online.biplio2024.entity.GenreEntity;
import bip.online.biplio2024.entity.PublisherEntity;
import bip.online.biplio2024.repository.GenreRepo;
import bip.online.biplio2024.repository.PublisherRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@AllArgsConstructor
public class PublisherService {

           private final PublisherRepo repo;

//    public List<AuthorEntity> {
//        return repo.findAll();
//    }
//    public Optional<AuthorEntity> findById(){
//        return repo.findById(id);
//    }

        public PublisherEntity save(PublisherEntity data) {
            return repo.save(data);
        }
        public void update( PublisherEntity data){
            repo.save(data);
        }
}
