package bip.online.biplio2024.service;

import bip.online.biplio2024.entity.BookEntity;
import bip.online.biplio2024.entity.CityEntity;
import bip.online.biplio2024.repository.BookRepo;
import bip.online.biplio2024.repository.CityRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@AllArgsConstructor
public class CityService {

        private final CityRepo repo;



//    public List<AuthorEntity> {
//        return repo.findAll();
//    }
//    public Optional<AuthorEntity> findById(){
//        return repo.findById(id);
//    }

        public CityEntity save(CityEntity data) {
            return repo.save(data);
        }
        public void update( CityEntity data){
            repo.save(data);
        }
}
