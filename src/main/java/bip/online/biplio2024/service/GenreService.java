package bip.online.biplio2024.service;

import bip.online.biplio2024.entity.CityEntity;
import bip.online.biplio2024.entity.GenreEntity;
import bip.online.biplio2024.repository.CityRepo;
import bip.online.biplio2024.repository.GenreRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@AllArgsConstructor
public class GenreService {



        private final GenreRepo repo;



//    public List<AuthorEntity> {
//        return repo.findAll();
//    }
//    public Optional<AuthorEntity> findById(){
//        return repo.findById(id);
//    }

        public GenreEntity save(GenreEntity data) {
            return repo.save(data);
        }
        public void update( GenreEntity data){
            repo.save(data);
        }
}
